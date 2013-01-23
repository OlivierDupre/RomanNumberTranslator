/**
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package fr.roman;

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
    public void convert10() {
        assertEquals(romanTranslator.convert(10), "X");
    }

    @Test
    public void convert20() {
        assertEquals(romanTranslator.convert(20), "XX");
    }

    @Test
    public void convert5() {
        assertEquals(romanTranslator.convert(5), "V");
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

    @Test
    public void convert6() {
        assertEquals(romanTranslator.convert(6), "VI");
    }

    @Test
    public void convert4() {
        assertEquals(romanTranslator.convert(4), "IV");
    }

    @Test
    public void convert3999() {
        assertEquals(romanTranslator.convert(3999), "MMMCMXCIX");
    }

    @Test
    public void convert984() {
        assertEquals(romanTranslator.convert(984), "CMLXXXIV");
    }

    @Test
    public void convert2996() {
        assertEquals(romanTranslator.convert(2996), "MMCMXCVI");
    }
}
