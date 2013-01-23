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
package fr.dupre;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Converts an arabian number into a roman number.
 */
public class RomanTranslator {

    private enum RomanNumbers implements Comparable<RomanNumbers> {

        M("M", 1000), CM("CM", 900),
        D("D", 500), CD("CD", 400),
        C("C", 100), XC("XC", 90),
        L("L", 50), XL("XL", 40),
        X("X", 10), IX("IX", 9),
        V("V", 5), IV("IV", 4),
        I("I", 1);
        private final String romanDigit;
        private final int arabicValue;

        private RomanNumbers(String romanDigit, int arabicValue) {
            this.romanDigit = romanDigit;
            this.arabicValue = arabicValue;
        }

        public String getRomanDigit() {
            return romanDigit;
        }

        public int getArabicValue() {
            return arabicValue;
        }
    }

    public String convert(int arabicNumber) {
        Set<RomanNumbers> romanNumbersValues = new TreeSet(Arrays.asList(RomanNumbers.values()));

        for (RomanNumbers romanNumber : romanNumbersValues) {
            if (arabicNumber >= romanNumber.getArabicValue()) {
                return convert(arabicNumber, romanNumber);
            }
        }

        return convert(arabicNumber, RomanNumbers.I);
    }

    private String convert(int arabicNumber, RomanNumbers romanNumber) {
        if (arabicNumber == 0) {
            return "";
        }

        return romanNumber.getRomanDigit() + convert(arabicNumber - romanNumber.getArabicValue());
    }
}
