package calculator;

import model.*;

public class NumberFabric {
    public static AbstractNumber createNumber(String numberString) throws Exception{
        if (isRoman(numberString)) {
            return new RomanNumber(numberString);
        } else if (isArabic(numberString)){
            return new ArabicNumber(numberString);
        } else throw new Exception("unknown class");
    }

    private static boolean isArabic(String number) {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private static boolean isRoman(String number) {
        final char[] lexicon = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        char[] arr = number.toCharArray();
        int nums = 0;
        for (char anArr : arr) {
            for (char aLexicon : lexicon) {
                if (anArr == aLexicon) nums++;
            }
        }
        return nums == arr.length;
    }
}