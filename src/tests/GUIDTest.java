package tests;

import org.junit.jupiter.api.Test;
import task.RegularRegex;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GUIDTest {


    @Test
    public void emptyString () {
        assertFalse(RegularRegex.GUID(""));
    }
    @Test
    public void withWrongCharString () {
        assertFalse(RegularRegex.GUID("ffffffff-ffff-ffff-ffff-zfffffffffff"));
    }
    @Test
    public void withSymbolsString () {
        assertFalse(RegularRegex.GUID("ffffffff-ffff-ffff-ffff-zfffffffffff!"));
    }
    @Test
    public void moreCharString () {
        assertFalse(RegularRegex.GUID("ffffffff-ffff-fffff-ffff-fffffffffff"));
    }
    @Test
    public void noMoreCharString () {
        assertFalse(RegularRegex.GUID("ffffffff-ffff-fff-fff-ffffffffffff"));
    }

    @Test
    public void correctGUID() {
        assertTrue(RegularRegex.GUID("12345678-abcd-ABCD-0000-123456789012"));
    }

    @Test
    public void minValueGUIDTest() {
        assertTrue(RegularRegex.GUID("00000000-0000-0000-0000-000000000000"));
    }

    @Test
    public void maxValueLowerCaseGUID() {
        assertTrue(RegularRegex.GUID("ffffffff-ffff-ffff-ffff-ffffffffffff"));
    }

    @Test
    public void maxValueUpperCaseGUID() {
        assertTrue(RegularRegex.GUID("FFFFFFFF-FFFF-FFFF-FFFF-FFFFFFFFFFFF"));
    }

    @Test
    public void moreSymbolsInFirstNumberGUIDTest() {
        assertFalse(RegularRegex.GUID("100000000-0000-0000-0000-000000000000"));
    }

    @Test
    public void lessSymbolsInFirstNumberGUIDTest() {
        assertFalse(RegularRegex.GUID("0000000-0000-0000-0000-000000000000"));
    }

    @Test
    public void moreSymbolsInSecondNumberGUIDTest() {
        assertFalse(RegularRegex.GUID("00000000-10000-0000-0000-000000000000"));
    }

    @Test
    public void lessSymbolsInSecondNumberGUIDTest() {
        assertFalse(RegularRegex.GUID("00000000-000-0000-0000-000000000000"));
    }

    @Test
    public void moreSymbolsInThirdNumberGUIDTest() {
        assertFalse(RegularRegex.GUID("00000000-0000-0000-10000-000000000000"));
    }

    @Test
    public void lessSymbolsInThirdNumberGUIDTest() {
        assertFalse(RegularRegex.GUID("00000000-0000-0000-000-000000000000"));
    }

    @Test
    public void moreSymbolsInFourthNumberGUIDTest() {
        assertFalse(RegularRegex.GUID("00000000-0000-0000-10000-000000000000"));
    }

    @Test
    public void lessSymbolsInFourthNumberGUIDTest() {
        assertFalse(RegularRegex.GUID("00000000-0000-0000-000-000000000000"));
    }

    @Test
    public void moreSymbolsInFifthNumberGUIDTest() {
        assertFalse(RegularRegex.GUID("00000000-0000-0000-0000-1000000000000"));
    }

    @Test
    public void lessSymbolsInFifthNumberGUIDTest() {
        assertFalse(RegularRegex.GUID("00000000-0000-0000-0000-00000000000"));
    }

    @Test
    public void lessMinusGUIDTest() {
        assertFalse(RegularRegex.GUID("000000000000-0000-0000-00000000000"));
    }

    @Test
    public void moreMinusGUIDTest() {
        assertFalse(RegularRegex.GUID("000000000000--0000-0000-00000000000"));
    }
}
