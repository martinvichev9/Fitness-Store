package bg.sofia.fmi.cleancode.project.enums;

public enum Command {

    SEARCH_PRODUCT("search product"),
    SEARCH_BRAND("search brand"),
    BUY_PRODUCT("buy product"),
    EXIT("exit");

    private String command;

    Command(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

}
