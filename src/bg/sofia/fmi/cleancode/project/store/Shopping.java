package bg.sofia.fmi.cleancode.project.store;

import bg.sofia.fmi.cleancode.project.enums.Command;
import bg.sofia.fmi.cleancode.project.product.Product;
import bg.sofia.fmi.cleancode.project.utils.Constants;
import bg.sofia.fmi.cleancode.project.utils.PersonID;

import java.util.*;


/**
 * Represents shopping from a fitness store. Every user input is checked
 * before being processed. User can search for brand or product and can buy
 * product.
 */
public class Shopping {

    private static final int FIRST_ELEMENT = 0;
    private static final int NO_MORE_PRODUCTS_OF_THAT_TYPE = 0;

    private Map<Product, Integer> availableProducts;

    private Set<String> brands;

    //User input
    private Scanner input;

    private MenuInterface menuUI;

    public Shopping(Map<Product, Integer> storeProducts, Set<String> brands) {
        availableProducts = storeProducts;
        this.brands = brands;
        input = new Scanner(System.in);
        menuUI = new MenuInterface();
    }

    /**
     * Shopping get started.
     */
    public void run() {
        System.out.println();
        System.out.println(String.format("%60s", Constants.WELCOME_TO_STORE));

        while (true) {

            printMenuMessage();
            System.out.print(Constants.YOUR_CHOICE);

            String userInput = menuUI.parseUserCommand(input);

            if (userInput.equals(Command.EXIT.getCommand())) {
                System.out.println(Constants.GOODBYE_MESSAGE);
                input.close();
                return;

            } else if (userInput.equals(Command.SEARCH_PRODUCT.getCommand())) {
                searchProduct();
            } else if (userInput.equals(Command.SEARCH_BRAND.getCommand())) {
                searchBrand();
            } else if (userInput.equals(Command.BUY_PRODUCT.getCommand())) {
                makeOrder();
            } else {
                //When is inputted invalid command
                System.out.println(Constants.WRONG_COMMAND_MESSAGE);
            }
        }

    }

    private void printMenuMessage() {
        System.out.println("\nMenu>");
        System.out.println(String.format("%15s", Command.BUY_PRODUCT.getCommand()));
        System.out.println(String.format("%16s", Command.SEARCH_BRAND.getCommand()));
        System.out.println(String.format("%18s", Command.SEARCH_PRODUCT.getCommand()));
        System.out.println(String.format("%8s", Command.EXIT.getCommand()));

    }

    private void searchProduct() {

        while (true) {
            System.out.print(Constants.TYPE_OF_PRODUCT_SEARCH);
            String productType = menuUI.getProductType(input);

            if (productType.equals(Constants.NO_SUCH_PRODUCT_TYPE_MESSAGE)) {
                System.out.println(Constants.NO_SUCH_PRODUCT_TYPE_MESSAGE);
                continue;
            }

            System.out.print(Constants.SEARCH_BRAND_MESSAGE);
            String brand = menuUI.getBrand(input, brands);

            if (brand.equals(Constants.NO_SUCH_BRAND_MESSAGE)) {
                System.out.println(Constants.NO_SUCH_BRAND_MESSAGE);
                continue;
            }

            printProductsInformation(productType, brand);

            System.out.print(Constants.CONTINUE_MESSAGE);
            String yesNoAnswer = menuUI.getValidYesNoMessage(input);

            if (yesNoAnswer.equals(Constants.NO_ANSWER)) {
                return;
            }
        }

    }

    private void printProductsInformation(String productType, String productBrand) {
        for (Product current : menuUI.getProductsByBrand(productType, productBrand, availableProducts)) {
            System.out.println();
            current.printInformation();
            System.out.println();
        }

    }

    private void searchBrand() {

        while (true) {
            System.out.print(Constants.SEARCH_BRAND_MESSAGE);
            String brand = menuUI.getBrand(input, brands);

            if (brand.equals(Constants.NO_SUCH_BRAND_MESSAGE)) {
                System.out.println(Constants.NO_SUCH_BRAND_MESSAGE);
                continue;

            } else {
                System.out.println(Constants.FOUND_BRAND_MESSAGE);
                System.out.print("Product(s): ");
                printProductTypesFromBrand(brand);

            }

            System.out.println();
            System.out.print(Constants.CONTINUE_MESSAGE);
            String yesNoMessage = menuUI.getValidYesNoMessage(input);

            if (yesNoMessage.equals(Constants.NO_ANSWER)) {
                return;
            }
        }

    }

    private void printProductTypesFromBrand(String brand) {
        for (String productType : menuUI.getAllProductTypesFromBrand(brand, availableProducts)) {
            System.out.print(productType + " ");
        }
    }

    private void makeOrder() {

        PersonID customerID = getUserID();
        Product orderProduct = orderProduct();

        if (!availableProducts.get(orderProduct).equals(NO_MORE_PRODUCTS_OF_THAT_TYPE)) {
            System.out.println(Constants.ORDER_INFORMATION);
            customerID.printInformation();
            orderProduct.printInformation();

            //Updates product's count
            Integer remainProducts = availableProducts.get(orderProduct);
            availableProducts.remove(orderProduct);
            availableProducts.put(orderProduct, --remainProducts);

            System.out.print(Constants.PRESS_YES);
            String userInput = input.nextLine();
            while (!userInput.toLowerCase().equals(Constants.YES_ANSWER)) {
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

        String town;
        while (true) {
            System.out.print(Constants.INPUT_TOWN);
            town = menuUI.getValidTown(input);

            if (!town.equals(Constants.CAN_NOT_DELIVER_THE_ORDER)) {
                break;
            }

            System.out.println(Constants.CAN_NOT_DELIVER_THE_ORDER);
        }

        return new PersonID(firstName, surname, town);

    }

    private Product orderProduct() {

        System.out.print(Constants.TYPE_OF_PRODUCT_SEARCH);
        String productType = menuUI.getProductType(input);

        System.out.print(Constants.SEARCH_BRAND_MESSAGE);
        String productBrand = menuUI.getBrand(input, brands);

        return menuUI.getProductsByBrand(productType, productBrand, availableProducts).get(FIRST_ELEMENT);
    }

}
