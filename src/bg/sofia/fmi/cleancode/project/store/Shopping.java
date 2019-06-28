package bg.sofia.fmi.cleancode.project.store;

import bg.sofia.fmi.cleancode.project.enums.Command;
import bg.sofia.fmi.cleancode.project.product.Product;
import bg.sofia.fmi.cleancode.project.utils.Constants;
import bg.sofia.fmi.cleancode.project.utils.Validator;

import java.util.*;

public class Shopping {

    private Map<Product, Integer> availableProducts;

    private Set<String> brands;

    public Shopping(Map<Product, Integer> storeProducts, Set<String> brands) {
        availableProducts = storeProducts;
        this.brands = brands;

    }

    public void run() {
        System.out.println();
        System.out.println(String.format("%60s", Constants.WELCOME_TO_STORE + "\n"));
        System.out.println(Constants.MENU_MESSAGE);

        Scanner input = new Scanner(System.in);

        while (true) {

            createMenuMessage();
            System.out.print(Constants.YOUR_CHOICE);

            String userInput = getValidUserChoiceInput(input);

            if (userInput.equals(Command.EXIT.getCommand())) {

                System.out.println(Constants.GOODBYE_MESSAGE);
                input.close();
                return;

            } else if (userInput.equals(Command.SEARCH_PRODUCT.getCommand())) {
                searchProduct(input);
            } else if (userInput.equals(Command.SEARCH_BRAND.getCommand())) {
                searchBrand(input);
            } else {
                //When user chose 'buy product' command


            }
        }
    }

    private void createMenuMessage() {
        System.out.println("Menu>");
        System.out.println(String.format("%15s", Command.BUY_PRODUCT.getCommand()));
        System.out.println(String.format("%16s", Command.SEARCH_BRAND.getCommand()));
        System.out.println(String.format("%18s", Command.SEARCH_PRODUCT.getCommand()));
        System.out.println(String.format("%8s", Command.EXIT.getCommand()));

    }

    private String getValidUserChoiceInput(Scanner input) {
        String userInput = input.nextLine();
        while (!Validator.isValidUserChoice(userInput)) {
            System.out.println(Constants.WRONG_COMMAND_MESSAGE);
            createMenuMessage();
            System.out.print(Constants.YOUR_CHOICE);
            userInput = input.nextLine();
        }

        return userInput;

    }

    private String getValidYesOrNoAnswer(Scanner input) {
        String userInput = input.nextLine();

        while (!Validator.isYesOrNoUserInput(userInput)) {
            System.out.print(Constants.YES_NO_USER_INPUT);
            userInput = input.nextLine();
        }

        return userInput;

    }

    private void searchProduct(Scanner input) {

        while (true) {
            System.out.print(Constants.TYPE_OF_PRODUCT_SEARCH);

            String productType = getValidProductType(input);

            System.out.print(Constants.SEARCH_BRAND_MESSAGE);
            String brand = getValidBrand(input);

            for (Product current : getProductsByBrand(productType, brand)) {
                System.out.println();
                current.printInformation();
                System.out.println();
            }

            System.out.print(Constants.CONTINUE_MESSAGE);
            String userInput = getValidYesOrNoAnswer(input);

            if (userInput.equals(Constants.NO_ANSWER)) {
                return;
            }
        }
    }

    private String getValidProductType(Scanner input) {

        String userInput = input.nextLine();

        while (!Validator.isCorrectProductType(userInput.toLowerCase())) {
            System.out.println(Constants.NO_SUCH_PRODUCT_TYPE_MESSAGE);
            System.out.print(Constants.TYPE_OF_PRODUCT_SEARCH);

            userInput = input.nextLine();
        }

        return userInput;
    }

    private String getValidBrand(Scanner input) {

        String userInput = input.nextLine();

        while (!Validator.containsBrand(brands, userInput.toLowerCase())) {
            System.out.println(Constants.NO_SUCH_BRAND_MESSAGE);

            System.out.print(Constants.SEARCH_BRAND_MESSAGE);
            userInput = input.nextLine();
        }

        return userInput;

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

    private void searchBrand(Scanner input) {

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
            userInput = getValidYesOrNoAnswer(input);

            if (userInput.equals(Constants.NO_ANSWER)) {
                return;
            }
        }
    }

    public Set<String> getAllProductTypesFromBrand(String brand) {
        Set<String> brandProductTypes = new HashSet<>();

        for (Product product : availableProducts.keySet()) {
            if (product.getBrand().getBrandName().toLowerCase().equals(brand.toLowerCase())) {
                brandProductTypes.add(product.getProductType());
            }
        }

        return brandProductTypes;

    }

}
