package io.github.sandersgutierrez.calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OperationFactory {
    private static final Map<String, Operation> operationMap = new HashMap<>();

    static {
        operationMap.put("add", new Addition());
        operationMap.put("subtract", new Subtraction());
        operationMap.put("multiply", new Multiplication());
        operationMap.put("divide", new Division());
    }

    public static Optional<Operation> getOperation(String operator) {
        return Optional.ofNullable(operationMap.get(operator));
    }
}
