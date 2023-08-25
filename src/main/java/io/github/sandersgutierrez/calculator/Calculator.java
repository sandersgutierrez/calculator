package io.github.sandersgutierrez.calculator;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator!");
    }

    public int calculate(int a, int b, String operator) {
        Operation targetOperation = OperationFactory
            .getOperation(operator)
            .orElseThrow(() -> new IllegalArgumentException("Invalid Operator"));

        return targetOperation.apply(a, b);
    }
}
