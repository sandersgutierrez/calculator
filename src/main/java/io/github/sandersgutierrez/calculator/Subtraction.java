package io.github.sandersgutierrez.calculator;

public class Subtraction implements Operation {
    @Override
    public int apply(int a, int b) {
        return a - b;
    }
}
