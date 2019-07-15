package model;

public class ArabicNumber implements AbstractNumber {
    protected String number;

    public ArabicNumber(String str) {
        number = str;
    }

    @Override
    public int getInt() {
        return Integer.parseInt(number);
    }

    @Override
    public String getString() {
        return number;
    }

    @Override
    public void setValue(int value) {
        number = Integer.toString(value);
    }
}