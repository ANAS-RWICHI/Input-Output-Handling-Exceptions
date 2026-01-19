package TP5.EXCEPTIION;


public class Calculator {
    public static double divide(double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }
    public static int convertToNumber(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + text + "' is not a valid number");
            return 0;
        }
    }
    public static double calculate(char operation, double a, double b) {
        try {
            switch (operation) {
                case '+':
                    return a + b;
                case '-':
                    return a - b;
                case '*':
                    return a * b;
                case '/':
                    return divide(a, b);
                default:
                    throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Operation '" + operation + "' not supported");
            return 0;
        }
    }
}
