package bg.sofia.fmi.cleancode.project.store;

import bg.sofia.fmi.cleancode.project.enums.Command;
import bg.sofia.fmi.cleancode.project.product.Product;
import bg.sofia.fmi.cleancode.project.utils.Constants;
import bg.sofia.fmi.cleancode.project.utils.PersonID;
import bg.sofia.fmi.cleancode.project.utils.Validator;

import java.util.*;

public class Shopping {

    private static final int FIRST_ELEMENT = 0;
    private static final int NO_MORE_PRODUCTS_OF_THAT_TYPE = 0;

    private Map<Product, Integer> availableProducts;

    private Set<String> brands;

    private Scanner input;

    public Shopping(Map<Product, Integer> storeProducts, Set<String> brands) {
        availableProducts = storeProducts;
        this.brands = brands;
        input = new Scanner(System.in);

    }

    public void run() {
        System.out.println();
        System.out.println(String.format("%60s", Constants.WELCOME_TO_STORE));

        while (true) {

            createMenuMessage();
            System.out.print(Constants.YOUR_CHOICE);

            String userInput = getValidAnswer(Constants.MENU_COMMAND);

            if (userInput.equals(Command.EXIT.getCommand())) {

                System.out.println(Constants.GOODBYE_MESSAGE);
                input.close();
                return;

            } else if (userInput.equals(Command.SEARCH_PRODUCT.getCommand())) {
                searchProduct();
            } else if (userInput.equals(Command.SEARCH_BRAND.getCommand())) {
                searchBrand();
            } else {
                //When user chose 'buy product' command
                makeOrder();
            }
        }

    }


    /**
     * Verifies user's input. There are five cases of inputs:
     *  - when user inputs some command from menu, the command should be verified;
     *  - when user searches for some brand, the brand should be verified;
     *  - when user searches for some type of product, that types should be verified;
     *  - when user inputs 'yes'/'no';
     *  - when user inputs town, that town should be verified
     *
     * @param inputType what type is the input
     * @return verified input
     */
    public String getValidAnswer(String inputType ) {

        while (true) {

            String userInput = input.nextLine();

            if (inputType.equals(Constants.MENU_COMMAND)) {
                if (!Validator.isValidMenuCommand(userInput.toLowerCase())) {
                    System.out.println(Constants.WRONG_COMMAND_MESSAGE);
                    createMenuMessage();
                    System.out.print(Constants.YOUR_CHOICE);
                    continue;
                }

            } else if (inputType.equals(Constants.BRAND)) {
                if (!Validator.containsBrand(brands, userInput.toLowerCase())) {
                    System.out.println(Constants.NO_SUCH_BRAND_MESSAGE);
                    System.out.print(Constants.SEARCH_BRAND_MESSAGE);
                    continue;
                }

            } else if (inputType.equals(Constants.PRODUCT_TYPE)) {
                if (!Validator.isCorrectProductType(userInput.toLowerCase())) {
                    System.out.println(Constants.NO_SUCH_PRODUCT_TYPE_MESSAGE);
                    System.out.print(Constants.TYPE_OF_PRODUCT_SEARCH);
                    continue;
                }

            } else if (inputType.equals(Constants.YES_NO_ANSWER)) {
                if (!Validator.isYesOrNoUserInput(userInput)) {
                    System.out.print(Constants.YES_NO_USER_INPUT);
                    continue;
                }

            } else {
                //when user inputs town while ordering
                if (!Validator.isReachableTown(userInput.toLowerCase())) {
                    System.out.println(Constants.CAN_NOT_DELIVER_THE_ORDER);
                    System.out.print(Constants.INPUT_TOWN);
                    continue;
                }

            }

            return userInput;

        }
    }

    private void createMenuMessage() {
        System.out.println("\nMenu>");
        System.out.println(String.format("%15s", Command.BUY_PRODUCT.getCommand()));
        System.out.println(String.format("%16s", Command.SEARCH_BRAND.getCommand()));
        System.out.println(String.format("%18s", Command.SEARCH_PRODUCT.getCommand()));
        System.out.println(String.format("%8s", Command.EXIT.getCommand()));

    }

    private void searchProduct() {

        while (true) {
            System.out.print(Constants.TYPE_OF_PRODUCT_SEARCH);
            String productType = getValidAnswer(Constants.PRODUCT_TYPE);

            System.out.print(Constants.SEARCH_BRAND_MESSAGE);
            String brand = getValidAnswer(Constants.BRAND);

            printProducts(productType, brand);

            System.out.print(Constants.CONTINUE_MESSAGE);
            String userInput = getValidAnswer(Constants.YES_NO_ANSWER);

            if (userInput.equals(Constants.NO_ANSWER)) {
                return;
            }
        }

    }

    private List<Product> getProductsByBrand(String product, String brand) {
        List<Product> productsByBrand = new LinkedList<>();

        for (Product current : availableProducts.keySet()) {
            if (current.getProductType().toLowerCase().equals(product.toLowerCase()) &&
                    current.getBrand().getBrandName().toLowerCase().equals(brand.toLowerCase())) {
                productsByBrand.add(current);
            }
        }

        return productsByBrand;

    }

    private void printProducts(String productType, String productBrand) {
        for (Product current : getProductsByBrand(productType, productBrand)) {
            System.out.println();
            current.printInformation();
            System.out.println();
        }

    }

    private void searchBrand() {

        while (true) {
            System.out.print(Constants.SEARCH_BRAND_MESSAGE);
            String userInput = input.nextLine();

            if (!brands.contains(userInput.toLowerCase())) {
                System.out.println(Constants.NO_SUCH_BRAND_MESSAGE);

            } else {
                System.out.println(Constants.FOUND_BRAND_MESSAGE);
                System.out.print("Product(s): ");

                for (String productType : getAllProductTypesFromBrand(userInput)) {
                    System.out.print(productType + " ");
                }
            }

            System.out.println();
            System.out.print(Constants.CONTINUE_MESSAGE);
            userInput = getValidAnswer(Constants.YES_NO_ANSWER);

            if (userInput.equals(Constants.NO_ANSWER)) {
                return;
            }
        }

    }

    private Set<String> getAllProductTypesFromBrand(String brand) {
        Set<String> brandProductTypes = new HashSet<>();

        for (Product product : availableProducts.keySet()) {
            if (product.getBrand().getBrandName().toLowerCase().equals(brand.toLowerCase())) {
                brandProductTypes.add(product.getProductType());
            }
        }

        return brandProductTypes;

    }

    private void makeOrder() {

        PersonID customerID = getUserID();
        Product orderProduct = orderProduct();

        if (!availableProducts.get(orderProduct).equals(NO_MORE_PRODUCTS_OF_THAT_TYPE)) {
            System.out.println(Constants.ORDER_INFORMATION);
            customerID.printInformation();
            orderProduct.printInformation();

            Integer remainProducts = availableProducts.get(orderProduct);
            availableProducts.remove(orderProduct);
            availableProducts.put(orderProduct, --remainProducts);

            System.out.print(Constants.PRESS_YES);
            String userInput = input.nextLine();
            while(!userInput.toLowerCase().equals(Constants.YES_ANSWER)) {
                System.out.print(Constants.PRESS_YES);
                userInput = input.nextLine();
            }
            System.out.println(Constants.PROCESS_ORDER);

        } else {
            System.out.println(Constants.NO_MORE_ITEMS);
        }

    }

    private PersonID getUserID() {

        System.out.print(Constants.INPUT_FIRST_NAME);
        String firstName = input.nextLine();

        System.out.print(Constants.INPUT_SURNAME);
        String surname = input.nextLine();

        System.out.print(Constants.INPUT_TOWN);
        String town = getValidAnswer(Constants.TOWN);

        return new PersonID(firstName, surname, town);

    }

    private Product orderProduct() {

        System.out.print(Constants.TYPE_OF_PRODUCT_SEARCH);
        String productType = getValidAnswer(Constants.PRODUCT_TYPE);

        System.out.print(Constants.SEARCH_BRAND_MESSAGE);
        String productBrand = getValidAnswer(Constants.BRAND);

        return getProductsByBrand(productType, productBrand).get(FIRST_ELEMENT);

    }

}
