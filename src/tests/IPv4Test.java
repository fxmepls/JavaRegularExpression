package tests;

import org.junit.jupiter.api.Test;
import task.RegularRegex;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IPv4Test {

    @Test
    public void emptyString () {
        assertFalse(RegularRegex.IPv4(""));
    }

    @Test
    public void withCharString () {
        assertFalse(RegularRegex.IPv4("g24.24.42.2"));
    }
    @Test
    public void withSymbolsString () {
        assertFalse(RegularRegex.IPv4("3#4.33.22.3"));
    }
    @Test
    public void moreOctetsString () {
        assertFalse(RegularRegex.IPv4("1.2.4.2.3"));
    }
    @Test
    public void noMoreOctetsString () {
        assertFalse(RegularRegex.IPv4("1.2.3"));
    }
    @Test
    public void moreThanAllowedValueString () {
        assertFalse(RegularRegex.IPv4("258.22.4.6"));
    }

    @Test
    public void lessThanAllowedValueString () {
        assertFalse(RegularRegex.IPv4("-8.22.4.6"));
    }


    @Test
    public void correctString () {
        assertTrue(RegularRegex.IPv4("8.22.4.6"));
    }

    @Test
    public void correctMinString () {
        assertTrue(RegularRegex.IPv4("0.0.0.0"));
    }


    @Test
    public void correctMaxString () {
        assertTrue(RegularRegex.IPv4("255.255.255.255"));
    }


    @Test
    public void morePointsString () {
        assertFalse(RegularRegex.IPv4("255.255.255.255."));
    }

    @Test
    public void noPointsString () {
        assertFalse(RegularRegex.IPv4("255 255 255 255"));
    }
}
