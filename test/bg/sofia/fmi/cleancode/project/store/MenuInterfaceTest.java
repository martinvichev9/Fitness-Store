package bg.sofia.fmi.cleancode.project.store;

import bg.sofia.fmi.cleancode.project.utils.Constants;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MenuInterfaceTest {

    private MenuInterface menuInterface;

    private Scanner scanner;

    private InputStream stream;

    @Before
    public void setUp() {
        menuInterface = new MenuInterface();
        scanner = new Scanner(System.in);
    }

    @Test
    public void testParseCommandWhenInputIsCorrect() {
        //All four cases when user's command is correct,
        //no matter lower/upper letters

        String input = "exit";
        stream = new ByteArrayInputStream(input.getBytes());
        scanner = new Scanner(stream);
        assertEquals(input, menuInterface.parseUserCommand(scanner));

        input = "Search Product";
        stream = new ByteArrayInputStream(input.getBytes());
        scanner = new Scanner(stream);
        assertEquals(input, menuInterface.parseUserCommand(scanner));

        input = "search brand";
        stream = new ByteArrayInputStream(input.getBytes());
        scanner = new Scanner(stream);
        assertEquals(input, menuInterface.parseUserCommand(scanner));

        input = "BUY PrOdUcT";
        stream = new ByteArrayInputStream(input.getBytes());
        scanner = new Scanner(stream);
        assertEquals(input, menuInterface.parseUserCommand(scanner));

    }

    @Test
    public void testParseCommandWhenInputIsIncorrect() {
        String incorrect = "eXxit";
        stream = new ByteArrayInputStream(incorrect.getBytes());
        scanner = new Scanner(stream);
        assertEquals(Constants.WRONG_COMMAND_MESSAGE, menuInterface.parseUserCommand(scanner));

        incorrect = "command command";
        stream = new ByteArrayInputStream(incorrect.getBytes());
        scanner = new Scanner(stream);
        assertEquals(Constants.WRONG_COMMAND_MESSAGE, menuInterface.parseUserCommand(scanner));

        incorrect = "Search band";
        stream = new ByteArrayInputStream(incorrect.getBytes());
        scanner = new Scanner(stream);
        assertEquals(Constants.WRONG_COMMAND_MESSAGE, menuInterface.parseUserCommand(scanner));
    }

    @Test
    public void testGetProductWhenProductTypeIsNotCorrect() {
        String incorrect = "proteinZZ";
        stream = new ByteArrayInputStream(incorrect.getBytes());
        scanner = new Scanner(stream);
        assertEquals(Constants.NO_SUCH_PRODUCT_TYPE_MESSAGE, menuInterface.getProductType(scanner));

        //The correct one is 'protein'
        incorrect = "proteins";
        stream = new ByteArrayInputStream(incorrect.getBytes());
        scanner = new Scanner(stream);
        assertEquals(Constants.NO_SUCH_PRODUCT_TYPE_MESSAGE, menuInterface.getProductType(scanner));
    }

    @Test
    public void testGetProductWhenProductTypeIsCorrect() {
        String correct = "protein";
        stream = new ByteArrayInputStream(correct.getBytes());
        scanner = new Scanner(stream);
        assertEquals(correct, menuInterface.getProductType(scanner));

        correct = "amino acids";
        stream = new ByteArrayInputStream(correct.getBytes());
        scanner = new Scanner(stream);
        assertEquals(correct, menuInterface.getProductType(scanner));

        correct = "t-shirt";
        stream = new ByteArrayInputStream(correct.getBytes());
        scanner = new Scanner(stream);
        assertEquals(correct, menuInterface.getProductType(scanner));

        correct = "bcaa";
        stream = new ByteArrayInputStream(correct.getBytes());
        scanner = new Scanner(stream);
        assertEquals(correct, menuInterface.getProductType(scanner));
    }

    @Test
    public void testGetBrandWithNoExistingBrands() {

        Set<String> brands = new HashSet<>();
        brands.add("lonsdale");
        brands.add("myprotein");
        brands.add("tapout");
        brands.add("muscle pharm");

        String brand = "brand";
        stream = new ByteArrayInputStream(brand.getBytes());
        scanner = new Scanner(stream);
        assertEquals(Constants.NO_SUCH_BRAND_MESSAGE, menuInterface.getBrand(scanner, brands));

        brand = "lonsdala";
        stream = new ByteArrayInputStream(brand.getBytes());
        scanner = new Scanner(stream);
        assertEquals(Constants.NO_SUCH_BRAND_MESSAGE, menuInterface.getBrand(scanner, brands));

    }

    @Test
    public void testGetBrandWithExistingBrands() {
        Set<String> brands = new HashSet<>();
        brands.add("lonsdale");
        brands.add("myprotein");
        brands.add("tapout");
        brands.add("muscle pharm");

        String brand = "lonsdale";
        stream = new ByteArrayInputStream(brand.getBytes());
        scanner = new Scanner(stream);
        assertEquals(brand, menuInterface.getBrand(scanner, brands));

        brand = "MusClE Pharm";
        stream = new ByteArrayInputStream(brand.getBytes());
        scanner = new Scanner(stream);
        assertEquals(brand, menuInterface.getBrand(scanner, brands));

    }

    @Test
    public void testGetValidYesNoMessage() {
        String correct = "YeS";
        stream = new ByteArrayInputStream(correct.getBytes());
        scanner = new Scanner(stream);
        assertEquals(correct, menuInterface.getValidYesNoMessage(scanner));

        correct = "no";
        stream = new ByteArrayInputStream(correct.getBytes());
        scanner = new Scanner(stream);
        assertEquals(correct, menuInterface.getValidYesNoMessage(scanner));

    }

    @Test
    public void testGetValidYesNoMessageWithTwoIncorrectInputs() {
        //first two are incorrect
        String inputs = "other\nother\nYeS";
        stream = new ByteArrayInputStream(inputs.getBytes());
        scanner = new Scanner(stream);
        assertEquals(inputs.split("\n")[2], menuInterface.getValidYesNoMessage(scanner));



    }

    @Test
    public void testGetValidYesNoMessageWithThreeIncorrectInputs() {
        //first three are incorrect
        String inputs = "other\nother\nyeSS\nno";
        stream = new ByteArrayInputStream(inputs.getBytes());
        scanner = new Scanner(stream);
        assertNotEquals(inputs.split("\n")[1], menuInterface.getValidYesNoMessage(scanner));

        inputs = "other\nother\nyeSS\nno";
        stream = new ByteArrayInputStream(inputs.getBytes());
        scanner = new Scanner(stream);
        assertEquals(inputs.split("\n")[3], menuInterface.getValidYesNoMessage(scanner));


    }

    @Test
    public void testGetValidTownWhenInputIsIncorrect() {
        String input = "Paris";
        stream = new ByteArrayInputStream(input.getBytes());
        scanner = new Scanner(stream);
        assertEquals(Constants.CAN_NOT_DELIVER_THE_ORDER, menuInterface.getValidTown(scanner));

        input = "Madrid";
        stream = new ByteArrayInputStream(input.getBytes());
        scanner = new Scanner(stream);
        assertEquals(Constants.CAN_NOT_DELIVER_THE_ORDER, menuInterface.getValidTown(scanner));

    }

}