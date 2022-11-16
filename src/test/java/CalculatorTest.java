import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    protected Calculator calculator;
    protected Calculator.Formula formula;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        formula = new Calculator.Formula();
        System.out.println("Вызываюсь перед тестом");
    }

    @DisplayName("Метод calculate()")
    @Test
    void calculate() {
        formula.addOperand(2).addOperand(5);
        Assertions.assertEquals(7, formula.calculate(Calculator.Operation.SUM).result());
        Assertions.assertEquals(-3, formula.calculate(Calculator.Operation.SUB).result());
        Assertions.assertEquals(10, formula.calculate(Calculator.Operation.MULT).result());
        Assertions.assertEquals(0.4, formula.calculate(Calculator.Operation.DIV).result());
        Assertions.assertEquals(32, formula.calculate(Calculator.Operation.POW).result());
    }

    @DisplayName("Метод calculate() с пустыми операндами")
    @Test
    void calculateException() {
        Assertions.assertThrows(IllegalStateException.class, () -> {
            formula.calculate(Calculator.Operation.SUB).result();
        });
    }

    @DisplayName("Метод result() с пустыми данными")
    @Test
    void result() {
        Assertions.assertThrows(IllegalStateException.class, () -> {
            formula.result();
        });
    }
}