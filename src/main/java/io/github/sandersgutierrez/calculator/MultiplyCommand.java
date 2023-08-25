package io.github.sandersgutierrez.calculator;

public class MultiplyCommand implements Command {
    private final int a;
    private final int b;

    public MultiplyCommand(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer execute() {
        return a * b;
    }
}
