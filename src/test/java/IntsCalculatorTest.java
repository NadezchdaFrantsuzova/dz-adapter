import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntsCalculatorTest {

    protected IntsCalculator intsCalculator;

    @BeforeEach
    void setUp() {
        intsCalculator = new IntsCalculator();
        System.out.println("Вызываюсь перед тестом");
    }

    @DisplayName("Метод sum")
    @Test
    void sum() {
        Assertions.assertEquals(10, intsCalculator.sum(-7, 17));
    }

    @DisplayName("Метод mult")
    @Test
    void mult() {
        Assertions.assertEquals(25, intsCalculator.mult(5, 5));
    }

    @DisplayName("Метод pow")
    @Test
    void pow() {
        Assertions.assertEquals(3125, intsCalculator.pow(5, 5));
    }
}