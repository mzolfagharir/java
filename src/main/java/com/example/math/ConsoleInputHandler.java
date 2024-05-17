package com.example.math;

import java.util.Scanner;

public class ConsoleInputHandler {
    private Scanner scanner;

    public ConsoleInputHandler() {
        scanner = new Scanner(System.in);
    }

    public String getInput() {
        System.out.print("Enter operation (+, -, *, /) or 'esc' to exit: ");
        return scanner.nextLine().trim().toLowerCase();
    }

    public double[] getOperands() {
        double[] operands = new double[2];
        System.out.print("Enter First Number: ");
        operands[0] = scanner.nextDouble();
        System.out.print("Enter Second Number: ");
        operands[1] = scanner.nextDouble();
        scanner.nextLine();
        return operands;
    }
}