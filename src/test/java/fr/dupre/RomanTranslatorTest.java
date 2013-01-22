package fr.dupre;

import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Tests cases for {@link RomanTranslator}.
 */
public class RomanTranslatorTest {

    RomanTranslator romanTranslator;

    @BeforeMethod
    public void setUp() {
        romanTranslator = new RomanTranslator();
    }

    @AfterMethod
    public void tearDown() {
        romanTranslator = null;
    }

    @Test
    public void convert1() {
        assertEquals(romanTranslator.convert(1), "I");
    }

    @Test
    public void convert2() {
        assertEquals(romanTranslator.convert(2), "II");
    }

    @Test
    public void convert3() {
        assertEquals(romanTranslator.convert(3), "III");
    }

    @Test
    public void convert5() {
        assertEquals(romanTranslator.convert(5), "V");
    }

    @Test
    public void convert6() {
        assertEquals(romanTranslator.convert(6), "VI");
    }

    @Test
    public void convert10() {
        assertEquals(romanTranslator.convert(10), "X");
    }

    @Test
    public void convert20() {
        assertEquals(romanTranslator.convert(20), "XX");
    }
    

    @Test
    public void convert50() {
        assertEquals(romanTranslator.convert(50), "L");
    }
    

    @Test
    public void convert100() {
        assertEquals(romanTranslator.convert(100), "C");
    }
    

    @Test
    public void convert500() {
        assertEquals(romanTranslator.convert(500), "D");
    }
    

    @Test
    public void convert1000() {
        assertEquals(romanTranslator.convert(1000), "M");
    }
}
