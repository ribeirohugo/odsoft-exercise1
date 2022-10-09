package com.twu.calculator;

public class Calculator {

    private double accumulator;

    /** 
     * @param operation is the math operation to be done
     * @param operand is the value to apply to the operation
     * @return double
     */
    public double doOperation(String operation, double operand) {
        switch (operation) {
            case "add":
                accumulator += operand;
                break;
            case "subtract":
                accumulator -= operand;
                break;
            case "multiply":
                accumulator *= operand;
                break;
            case "divide":
                accumulator /= operand;
                break;
            case "abs":
                accumulator = Math.abs(accumulator);
                break;
            case "neg":
                accumulator = -accumulator;
                break;
            case "sqrt":
                accumulator = Math.sqrt(accumulator);
                break;
            case "sqr":
                accumulator = Math.pow(accumulator, 2);
                break;
            case "cube":
                accumulator = Math.pow(accumulator, 3);
                break;
            case "cubert":
                accumulator = Math.cbrt(accumulator);
                break;
            case "factorial":
                accumulator += factorial(operand);
                break;
            case "third":
                accumulator += (operand / 3.0);
                break;
            case "cancel":
                accumulator = 0;
                break;
            case "exit":
                System.exit(0);
        }
        return accumulator;
    }

    
    /** 
     * @param n is the number to calculate factorial of
     * @return double
     */
    private double factorial(double n) {
        return factorialAux(Math.floor(n), 1);
    }

    
    /** 
     * @param n is the current value to calculate factorial of
     * @param amount is the current amount value of the calculation
     * @return double
     */
    private double factorialAux(double n, double amount) {
        if(n > 0) {
            amount *= n;
            amount = factorialAux(n-1, amount);
        }
        return amount;
    }
}
