package tests;

import org.junit.jupiter.api.Test;
import task.RegularRegex;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class URLTest {
    @Test
    public void emptyURLTest() {
        assertFalse(RegularRegex.URL(""));
    }

    @Test
    public void justTextURLTest() {
        assertFalse(RegularRegex.URL("Just Text"));
    }

    @Test
    public void oneWordDomainURLTest() {
        assertFalse(RegularRegex.URL("http://a.com"));
    }

    @Test
    public void spaceInDomainURLTest() {
        assertFalse(RegularRegex.URL("http://www.exa mple.com"));
    }

    @Test
    public void _InDomainURLTest() {
        assertFalse(RegularRegex.URL("http://www.exa_mple.com"));
    }

    @Test
    public void hyphenInStartDomainURLTest() {
        assertFalse(RegularRegex.URL("http://www.–example.com"));
    }

    @Test
    public void hyphenInEndDomainURLTest() {
        assertFalse(RegularRegex.URL("http://www.example–.com"));
    }

    @Test
    public void httpURLTest() {
        assertTrue(RegularRegex.URL("http://www.example.com"));
    }

    @Test
    public void httpsURLTest() {
        assertTrue(RegularRegex.URL("https://www.example.com"));
    }

    @Test
    public void withoutProtocolURLTest() {
        assertTrue(RegularRegex.URL("http://example.com"));
    }

    @Test
    public void withProtocolURLTest() {
        assertTrue(RegularRegex.URL("http://www.example.com"));
    }

    @Test
    public void simpleURLTest() {
        assertTrue(RegularRegex.URL("https://github.com/"));
    }

    @Test
    public void withAnySymbolsURLTest() {
        assertTrue(RegularRegex.URL("https://new.vyatsu.ru/account/obr/rasp/?login=yes"));
    }

    @Test
    public void withSharpURLTest() {
        assertTrue(RegularRegex.URL("https://ru.wikipedia.org/wiki/URL#StructureURL"));
    }
}
