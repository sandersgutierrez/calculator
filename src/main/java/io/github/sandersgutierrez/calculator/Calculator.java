package io.github.sandersgutierrez.calculator;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator!");
    }

    public int calculate(Command command) {
        return command.execute();
    }
}
