package In.Abdul.Junit.Testing.ExceptionTest;

import In.Abdul.Junit.Testing.Exception.StringUtils;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class exceptionTest {


    @Test
    public void testException1() {
        StringUtils ss = new StringUtils();
        assertThrows(IllegalStateException.class, () -> ss.stringToInt(null));
    }

    @Test
    public void testException2() {
        StringUtils ss1 = new StringUtils();
        assertThrows(IllegalStateException.class, () -> ss1.stringToInt(""));
    }

    @Test
    public void testException3() {
        StringUtils s3 = new StringUtils();
        Integer value = s3.stringToInt("10");
        assertEquals("10", value);
    }

}
