package bg.sofia.fmi.cleancode.project.utils;

import bg.sofia.fmi.cleancode.project.enums.Command;

import java.util.Set;

public class Validator {

    public static final boolean isValidUserChoice(String userChoice) {

        userChoice = userChoice.toLowerCase();

        return userChoice.equals(Command.EXIT.getCommand()) ||
                userChoice.equals(Command.SEARCH_BRAND.getCommand()) ||
                userChoice.equals(Command.BUY_PRODUCT.getCommand()) ||
                userChoice.equals(Command.SEARCH_PRODUCT.getCommand());

    }

    public static final boolean isYesOrNoUserInput(String userInput) {
        return userInput.toLowerCase().equals("yes") || userInput.toLowerCase().equals("no");
    }

    public static final boolean containsBrand(Set<String> brands, String brand) {
        return brands.contains(brand);
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

}
