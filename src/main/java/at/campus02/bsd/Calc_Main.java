package at.campus02.bsd;

import java.util.Scanner;

public class Calc_Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double num1 = 0;
       double num2 = 0;

       try {
           System.out.print("Please enter the first number: ");
           num1 = Double.parseDouble(scanner.nextLine());
           System.out.print("Please enter the second number: ");
           num2 = Double.parseDouble(scanner.nextLine());
       } catch (NumberFormatException e) {
           e.printStackTrace();
           return;
       }

       Calculator calculator = new Calculator();
        System.out.println("Sum: " + calculator.add(num1, num2));
        System.out.println("Difference: " + calculator.subtract(num1, num2));
        System.out.println("Product: " + calculator.multiply(num1, num2));
        System.out.println("Quotient: " + calculator.divide(num1, num2));
    }
}
