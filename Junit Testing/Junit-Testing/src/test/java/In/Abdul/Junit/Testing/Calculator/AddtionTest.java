package In.Abdul.Junit.Testing.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddtionTest {

    @Test
    public void addTest() {
        Addition addition = new Addition();
        Integer actualValue = addition.add(20, 30);
        Integer expectedValue = 50;
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void subTest() {
        Addition addition = new Addition();
        Integer actualValue = addition.sub(20, 30);
        Integer expectedValue = -10;
        assertEquals(expectedValue, actualValue);
    }
}
