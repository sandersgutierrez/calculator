package io.github.sandersgutierrez.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private final PrintStream standardOut = System.out;
    private final OutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        calculator = new Calculator();
    }

    @Test
    void givenSystemOutRedirection_whenInvokePrintln_thenOutputCaptorSuccess() {
        Calculator.main(null);
        assertEquals("Calculator!", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("Given two numbers when invoke calculate method with the add operation then return the sum total between the two numbers")
    void givenTwoNumbers_whenInvokeMethodCalculateWithTheAddOperation_thenReturnTheSumBetweenTheTwoNumbers() {
        assertEquals(12, calculator.calculate(new AddCommand(8, 4)));
    }

    @Test
    @DisplayName("Given two numbers when invoke calculate method with the subtract operation then return the difference between the two numbers")
    void givenTwoNumbers_whenInvokeMethodCalculateWithTheSubtractOperation_thenReturnTheDifferenceBetweenTheTwoNumbers() {
        assertEquals(4, calculator.calculate(new SubtractCommand(8, 4)));
    }

    @Test
    @DisplayName("Given two numbers when invoke calculate method with the multiply operation then return the multiplication result between the two numbers")
    void givenTwoNumbers_whenInvokeMethodCalculateWithTheMultiplyOperation_thenReturnTheMultiplicationResultBetweenTheTwoNumbers() {
        assertEquals(32, calculator.calculate(new MultiplyCommand(8, 4)));
    }

    @Test
    @DisplayName("Given two numbers when invoke calculate method with the divide operation then return the quotient between the two numbers")
    void givenTwoNumbers_whenInvokeMethodCalculateWithTheDivideOperation_thenReturnTheQuotientBetweenTheTwoNumbers() {
        assertEquals(2, calculator.calculate(new DivideCommand(8, 4)));
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }
}
