package bg.sofia.fmi.cleancode.project.utils;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidatorTest {

    @Test
    public void testIfIsValidMenuCommand() {
        assertTrue(Validator.isValidMenuCommand("buy product"));
        assertTrue(Validator.isValidMenuCommand("search product"));
        assertFalse(!Validator.isValidMenuCommand("search brand"));
        assertTrue(Validator.isValidMenuCommand("exit"));
        assertFalse(Validator.isValidMenuCommand("menu command"));
    }

    @Test
    public void testIfIsCorrectProductType() {
        assertTrue(Validator.isCorrectProductType("protein"));
        assertFalse(Validator.isCorrectProductType("proteins"));
        assertTrue(Validator.isCorrectProductType("protein bar"));
        assertTrue(Validator.isCorrectProductType("amino acids"));
        assertTrue(Validator.isCorrectProductType("bcaa"));


    }

    @Test
    public void testIfIsReachableTown() {
        assertTrue(Validator.isReachableTown("Sofia"));
        assertFalse(Validator.isReachableTown("fofia"));
        assertTrue(Validator.isReachableTown("SOFIa"));

    }

}