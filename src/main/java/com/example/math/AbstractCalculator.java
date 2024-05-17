package com.example.math;

public abstract class AbstractCalculator {
    public abstract double add(double a, double b);
    public abstract double subtract(double a, double b);
    public abstract double multiply(double a, double b);
    public abstract double divide(double a, double b) throws ArithmeticException;
}