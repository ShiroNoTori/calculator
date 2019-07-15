package calculator;

import model.AbstractNumber;

public class Calc {
    public static String calc(String expression) throws Exception {

        String[] str = Parser.parse(expression);
        AbstractNumber operatorLeft = NumberFabric.createNumber(str[0]);
        AbstractNumber operatorRight = NumberFabric.createNumber(str[1]);
        String operator = str[2];

        int aInt = operatorLeft.getInt();
        int bInt = operatorRight.getInt();

        switch (operator) {
            case "+":
                operatorLeft.setValue(aInt + bInt);
                return operatorLeft.getString();
            case "-":
                operatorLeft.setValue(aInt - bInt);
                return operatorLeft.getString();
            case "*":
                operatorLeft.setValue(aInt * bInt);
                return operatorLeft.getString();
            case "/":
                operatorLeft.setValue(aInt / bInt);
                return operatorLeft.getString();
            default:
                return null;
        }
    }
}