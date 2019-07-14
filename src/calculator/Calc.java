package calculator;

import model.AbstractNumber;

public class Calc {
    public static String calculate(String expression) throws Exception {
        String operator = Parser.parse(expression)[2];
        AbstractNumber[] abstractNumbers = Validator.validate(Parser.parse(expression));
        switch (operator) {
            case "+":
                return abstractNumbers[0].getNumber(abstractNumbers[0].getInt() + abstractNumbers[1].getInt());
            case "-":
                return abstractNumbers[0].getNumber(abstractNumbers[0].getInt() - abstractNumbers[1].getInt());
            case "*":
                return abstractNumbers[0].getNumber(abstractNumbers[0].getInt() * abstractNumbers[1].getInt());
            case "/":
                return abstractNumbers[0].getNumber(abstractNumbers[0].getInt() / abstractNumbers[1].getInt());
            default:
                return null;
        }
    }
}
