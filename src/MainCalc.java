import calculator.Calc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainCalc {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String expression = reader.readLine();

        System.out.println(Calc.calculate(expression));
    }
}
