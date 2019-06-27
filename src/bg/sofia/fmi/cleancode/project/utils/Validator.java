package bg.sofia.fmi.cleancode.project.utils;

import bg.sofia.fmi.cleancode.project.enums.Command;

public class Validator {

    public static final boolean isValidUserChoice(String userChoice) {

        userChoice = userChoice.toLowerCase();

        return userChoice.equals(Command.EXIT.getCommand()) ||
                userChoice.equals(Command.SEARCH_BRAND.getCommand()) ||
                userChoice.equals(Command.BUY_PRODUCT.getCommand()) ||
                userChoice.equals(Command.SEARCH_PRODUCT.getCommand()) ||
                userChoice.equals(Command.VIEW_PRODUCT.getCommand());

    }

    public static final boolean isYesOrNoUserInput(String userInput) {
        return userInput.toLowerCase().equals("yes") || userInput.toLowerCase().equals("no");
    }

}
