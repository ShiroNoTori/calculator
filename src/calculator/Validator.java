package calculator;

import model.AbstractNumber;
import model.ArabicNumber;
import model.RomanNumber;

public class Validator {

    public static AbstractNumber[] validate(String[] parsedExpr) throws Exception {
        AbstractNumber[] result = new AbstractNumber[2];

        ArabicNumber a = new ArabicNumber(parsedExpr[0]);
        ArabicNumber b = new ArabicNumber(parsedExpr[1]);
        RomanNumber c = new RomanNumber(parsedExpr[0]);
        RomanNumber d = new RomanNumber(parsedExpr[1]);

        if (a.isArabic() && a.isArabic()) {
            result[0] = a;
            result[1] = b;
            return result;
        } else if (c.isRoman() && d.isRoman()) {
            result[0] = c;
            result[1] = d;
            return result;
        } else throw new Exception();
    }
}
