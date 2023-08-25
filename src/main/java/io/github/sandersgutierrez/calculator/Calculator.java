package io.github.sandersgutierrez.calculator;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator!");
    }

    public int calculate(int a, int b, String operator) {
        int result = Integer.MIN_VALUE;

        if ("add".equals(operator)) {
            result = a + b;
        } else if ("multiply".equals(operator)) {
            result = a * b;
        } else if ("divide".equals(operator)) {
            result = a / b;
        } else if ("subtract".equals(operator)) {
            result = a - b;
        }

        return result;
    }
}
