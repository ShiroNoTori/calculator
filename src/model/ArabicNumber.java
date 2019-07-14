package model;

public class ArabicNumber implements AbstractNumber {
    protected String number;

    public ArabicNumber(String str) {
        number = str;
    }

    public boolean isArabic() {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    @Override
    public int getInt() {
        return Integer.parseInt(number);
    }

    @Override
    public String getNumber(int i) {
        return String.valueOf(i);
    }
}