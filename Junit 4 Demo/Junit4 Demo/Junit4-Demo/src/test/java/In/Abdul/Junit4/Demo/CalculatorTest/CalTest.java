package In.Abdul.Junit4.Demo.CalculatorTest;

import In.Abdul.Junit4.Demo.Unit.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalTest {


    @Test
    public void addTest() {
        Calculator calculator = new Calculator();
        Integer actualValue = calculator.add(20, 30);
        Integer expectedValue = 50;
        assertEquals(expectedValue, actualValue);


    }


    @Test
    public void multiplyTest() {
        Calculator c = new Calculator();
        Integer actualValue1 = c.Multiply(20, 20);
        Integer expectedValue1 = 400;
        assertEquals(expectedValue1, actualValue1);
    }

}
