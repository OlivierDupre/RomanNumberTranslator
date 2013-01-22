package fr.dupre;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Converts an arabian number into a roman number.
 */
public class RomanTranslator {

    private enum RomanNumbers {

        I("I", 1), V("V", 5), X("X", 10), L("L", 50), C("C", 100), D("D", 500),
        M("M", 1000);
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

        public static Set<Integer> arabicValues() {
            Set<Integer> arabicValues = new TreeSet();

            for (RomanNumbers romanNumber : values()) {
                arabicValues.add(romanNumber.getArabicValue());
            }

            return arabicValues;
        }
    }

    public String convert(int arabicNumber) {
        TreeSet<Integer> romanNumberArabicValues = (TreeSet<Integer>) RomanNumbers.arabicValues();

        for (Iterator<Integer> romanNumberIterator = romanNumberArabicValues.descendingIterator(); romanNumberIterator.hasNext();) {
            int arabicValue = romanNumberIterator.next();
        }

        if (arabicNumber >= RomanNumbers.X.getArabicValue()) {
            return convert(arabicNumber, RomanNumbers.X);
        } else if (arabicNumber >= RomanNumbers.V.getArabicValue()) {
            return convert(arabicNumber, RomanNumbers.V);
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
