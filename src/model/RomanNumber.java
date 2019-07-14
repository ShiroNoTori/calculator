package model;

public class RomanNumber implements AbstractNumber {
    private String number;
    private static final char[] lexicon = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};

    public RomanNumber(String str) {
        number = str;
    }

    public boolean isRoman() {
        char[] arr = number.toCharArray();
        int nums = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < lexicon.length; j++) {
                if (arr[i] == lexicon[j]) nums++;
            }
        }
        return nums == arr.length;
    }

    @Override
    public int getInt() {
        return number.replace("CM", "DCD")
                .replace("M", "DD")
                .replace("CD", "CCCC")
                .replace("D", "CCCCC")
                .replace("XC", "LXL")
                .replace("C", "LL")
                .replace("XL", "XXXX")
                .replace("L", "XXXXX")
                .replace("IX", "VIV")
                .replace("X", "VV")
                .replace("IV", "IIII")
                .replace("V", "IIIII").length();
    }

    @Override
    public String getNumber(int i) {
        return String.valueOf(new char[i]).replace('\0', 'I')
                .replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL")
                .replace("LL", "C")
                .replace("LXL", "XC")
                .replace("CCCCC", "D")
                .replace("CCCC", "CD")
                .replace("DD", "M")
                .replace("DCD", "CM");
    }
}