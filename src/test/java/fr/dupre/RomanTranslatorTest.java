package fr.dupre;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
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
        Assert.assertEquals(romanTranslator.convert(1), "I");
    }
}
