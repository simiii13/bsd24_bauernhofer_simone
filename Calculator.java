package at.campus02.bsd;
import java.util.Scanner;

public class Calculator {

    public double add(double num1, double num2) {
        double result = 0;
        result = num1 + num2;
        return result;
    }

    public double subtract(double num1, double num2) {
        double result = 0;
        result = num1 - num2;
        return result;
    }

    public double divide(double num1, double num2) {
        double result = 0;
        result = num1 / num2;
        if (num2 == 0) {
            System.out.println("Division by zero");
        }
        return result;
    }

    public double multiply(double num1, double num2) {
        double result = 0;
        result = num1 * num2;
        return result;
    }
}
