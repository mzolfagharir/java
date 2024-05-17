package com.example.math;

public class MathApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        ConsoleInputHandler inputHandler = new ConsoleInputHandler();
        History history = new History();

        while (true) {
            String operation = inputHandler.getInput();

            if (operation.equals("esc")) {
                history.saveToFile();
                System.out.println("Exiting application. History saved to  your desktop.");
                break;
            }

            double[] operands = inputHandler.getOperands();
            double result = 0;

            try {
                switch (operation) {
                    case "+":
                        result = calculator.add(operands[0], operands[1]);
                        break;
                    case "-":
                        result = calculator.subtract(operands[0], operands[1]);
                        break;
                    case "*":
                        result = calculator.multiply(operands[0], operands[1]);
                        break;
                    case "/":
                        result = calculator.divide(operands[0], operands[1]);
                        break;
                    default:
                        System.out.println("Invalid operation.");
                        continue;
                }

                String entry = String.format("%s %f and %f = %f", operation, operands[0], operands[1], result);
                System.out.println(entry);
                history.addEntry(entry);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}