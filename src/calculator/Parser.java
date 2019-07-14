package calculator;

import java.util.Arrays;

public class Parser {

    private static final char[] operators = {'+', '-', '*', '/'};

    public static String[] parse(String expression) throws Exception {
        String[] result = new String[3];
        char[] arr = expression.toCharArray();
        int nOfOperands = 0;


        for (int i = 0; i < operators.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (operators[i] == arr[j]) {
                    if (nOfOperands > 0) throw new Exception("More than 1 operand");
                    result[0] = new String(Arrays.copyOfRange(arr, 0, j));
                    result[1] = new String(Arrays.copyOfRange(arr, j + 1, arr.length));
                    result[2] = String.valueOf(arr[j]);
                    nOfOperands++;
                }
            }
        }
        return result;
    }

}
