package bg.sofia.fmi.cleancode.project.store;

import bg.sofia.fmi.cleancode.project.product.Product;
import bg.sofia.fmi.cleancode.project.utils.Constants;
import bg.sofia.fmi.cleancode.project.utils.Validator;

import java.util.*;

/**
 * User's menu interface
 */
public class MenuInterface {

    private String userInput;

    public MenuInterface() {
        userInput = new String();
    }

    /**
     * Checks command, which user inputs.
     *
     * @param input User input
     * @return "Wrong command" if command is wrong or user input
     */
    public String parseUserCommand(Scanner input) {
        userInput = input.nextLine();
        if (!Validator.isValidMenuCommand(userInput.toLowerCase())) {
            return Constants.WRONG_COMMAND_MESSAGE;
        }

        return userInput;
    }

    /**
     * Checks product, which user searches for
     *
     * @param input User input
     * @return constant when there is no such type of product
     * or user input (if there is)
     */
    public String getProductType(Scanner input) {
        userInput = input.nextLine();

        if (!Validator.isCorrectProductType(userInput.toLowerCase())) {
            return Constants.NO_SUCH_PRODUCT_TYPE_MESSAGE;
        }

        return userInput;
    }

    /**
     * Checks brand, which user searches for
     *
     * @param input  User input
     * @param brands All brands in store
     * @return constant when there is no such brand
     * or user input
     */
    public String getBrand(Scanner input, Set<String> brands) {
        userInput = input.nextLine();

        if (!Validator.containsBrand(brands, userInput)) {
            return Constants.NO_SUCH_BRAND_MESSAGE;
        }

        return userInput;
    }

    /**
     * Checks if user inputs 'yes'/'no', no matter of lower/upper letters.
     *
     * @param input User input
     * @return constant where input is not correct or user input
     * when is correct
     */
    public String getValidYesNoMessage(Scanner input) {
        userInput = input.nextLine();
        while (!Validator.isYesOrNoUserInput(userInput)) {

            System.out.print(Constants.YES_NO_USER_INPUT);
            userInput = input.nextLine();
        }

        return userInput;
    }

    /**
     * Returns all product types of some brand without repeating any types
     *
     * @param brand             Current brand
     * @param availableProducts All products in store
     * @return all product types of some brand
     */
    public Set<String> getAllProductTypesFromBrand(String brand, Map<Product, Integer> availableProducts) {
        Set<String> brandProductTypes = new HashSet<>();

        for (Product product : availableProducts.keySet()) {
            if (product.getBrand().getBrandName().toLowerCase().equals(brand.toLowerCase())) {
                brandProductTypes.add(product.getProductType());
            }
        }

        return brandProductTypes;

    }

    /**
     * Returns all products of some brand
     *
     * @param product           Type product
     * @param brand             Brand of product
     * @param availableProducts All product in store
     * @return all products(not product types as in the upper method) of some brand
     */
    public List<Product> getProductsByBrand(String product, String brand, Map<Product, Integer> availableProducts) {
        List<Product> productsByBrand = new LinkedList<>();

        for (Product current : availableProducts.keySet()) {
            if (current.getProductType().toLowerCase().equals(product.toLowerCase()) &&
                    current.getBrand().getBrandName().toLowerCase().equals(brand.toLowerCase())) {
                productsByBrand.add(current);
            }
        }

        return productsByBrand;

    }

    /**
     * Checks if town from user input is reachable(i.e., is part of Enum class Town)
     *
     * @param input User input
     * @return constant if town is not reachable or user input
     */
    public String getValidTown(Scanner input) {
        String userInput = input.nextLine();

        if (!Validator.isReachableTown(userInput.toLowerCase())) {
            return Constants.CAN_NOT_DELIVER_THE_ORDER;
        }

        return userInput;
    }


}
