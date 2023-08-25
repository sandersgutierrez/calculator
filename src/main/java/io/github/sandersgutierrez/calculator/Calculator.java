package io.github.sandersgutierrez.calculator;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator!");
    }

    public int calculate(int a, int b, Operator operator) {
        return operator.apply(a, b);
    }
}
