package bg.sofia.fmi.cleancode.project.utils;

public class PersonID {

    private static final int FIRST_CHARACTER = 0;
    private static final int SECOND_CHARACTER = 1;

    private String firstName;
    private String surname;
    private String town;

    public PersonID(String firstName, String surname, String town) {
        this.firstName = firstName;
        this.surname = surname;
        this.town = town;
    }

    public void printInformation() {
        System.out.println("Name: " + firstName);
        System.out.println("Surname: " + surname);

        //For capitalizing only the first letter of town
        town = town.substring(FIRST_CHARACTER, SECOND_CHARACTER).toUpperCase() +
                town.substring(SECOND_CHARACTER).toLowerCase();
        System.out.println("Town: " + town);
    }

}
