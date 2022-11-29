package tests;

import org.junit.jupiter.api.Test;
import task.RegularRegex;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordTest {
    @Test
    public void emptyPasswordTest() {
         assertFalse(RegularRegex.Password(""));
    }

    @Test
    public void noDigitsPasswordTest() {
        assertFalse(RegularRegex.Password("Cool_pass"));
    }

    @Test
    public void noUpperCaseLettersPasswordTest() {
        assertFalse(RegularRegex.Password("coo1_pass"));
    }

    @Test
    public void noLowerCaseLettersPasswordTest() {
        assertFalse(RegularRegex.Password("COO1_PASS"));
    }

    @Test
    public void less8SymbolsPasswordTest() {
        assertFalse(RegularRegex.Password("C00l"));
    }

    @Test
    public void RussianLettersPasswordTest() {
        assertFalse(RegularRegex.Password("Кул1"));
    }

    @Test
    public void wrongSymbolsPasswordTest() {
        assertTrue(RegularRegex.Password("Coo1*pass"));
    }

    @Test
    public void correctTest1() {
        assertTrue(RegularRegex.Password("SupperPas1()"));
    }

    @Test
    public void correctTest2() {
        assertTrue(RegularRegex.Password("C00l_Pass."));
    }

    @Test
    public void correctTest3() {
        assertTrue(RegularRegex.Password("AaBb123aAb!B"));
    }
}
