package at.campus02.bsd;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

private static final Logger logger = LogManager.getLogger(Calculator.class);

    public double add(double num1, double num2) {
        logger.debug("add() called with the parameters: num1 = " + num1 + ", num2 = " + num2);
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        logger.debug("subtract() called with the parameters: num1 = " + num1 + ", num2 = " + num2);
        return num1 - num2;
    }

    public double divide(double num1, double num2) {
        logger.debug("divide() called with the parameters: num1 = " + num1 + ", num2 = " + num2);

        if (num2 == 0) {
            logger.error("Attempt: Division by zero! num1 = " + num1 + ", num2 = " + num2);
            return 0;
        }
        return num1 / num2;
    }

    public double multiply(double num1, double num2) {
        logger.debug("multiply() called with the parameters: num1 = " + num1 + ", num2 = " + num2);
        return num1 * num2;
    }

    public int factorial(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
