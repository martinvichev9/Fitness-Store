package bg.sofia.fmi.cleancode.project.utils;

import bg.sofia.fmi.cleancode.project.enums.Command;
import bg.sofia.fmi.cleancode.project.enums.Town;

import java.util.Set;

/**
 * Class 'Validator' is used for validating user inputs as commands,
 * searching, answers, etc.
 */
public class Validator {

    public static final boolean isValidMenuCommand(String menuCommand) {

        menuCommand = menuCommand.toLowerCase();

        return menuCommand.equals(Command.EXIT.getCommand()) ||
                menuCommand.equals(Command.SEARCH_BRAND.getCommand()) ||
                menuCommand.equals(Command.BUY_PRODUCT.getCommand()) ||
                menuCommand.equals(Command.SEARCH_PRODUCT.getCommand());

    }

    public static final boolean isYesOrNoUserInput(String userInput) {
        return userInput.toLowerCase().equals("yes") || userInput.toLowerCase().equals("no");
    }

    public static final boolean containsBrand(Set<String> brands, String brand) {
        return brands.contains(brand.toLowerCase());
    }

    public static final boolean isCorrectProductType(String productType) {

        return productType.equals(ProductType.AMINO_ACIDS.toLowerCase()) ||
                productType.equals(ProductType.BCAA.toLowerCase()) ||
                productType.equals(ProductType.LEGGINS.toLowerCase()) ||
                productType.equals(ProductType.PROTEIN.toLowerCase()) ||
                productType.equals(ProductType.PROTEIN_BAR.toLowerCase()) ||
                productType.equals(ProductType.SHORTS.toLowerCase()) ||
                productType.equals(ProductType.SWEATSHIRT.toLowerCase()) ||
                productType.equals(ProductType.T_SHIRT.toLowerCase());

    }

    /**
     * We consider towns as reachable if they belong to Enum class 'Town'
     */
    public static final boolean isReachableTown(String town) {

        for (Town current : Town.values()) {
            if (current.toString().toLowerCase().equals(town.toLowerCase())) {
                return true;
            }
        }

        return false;

    }

}
