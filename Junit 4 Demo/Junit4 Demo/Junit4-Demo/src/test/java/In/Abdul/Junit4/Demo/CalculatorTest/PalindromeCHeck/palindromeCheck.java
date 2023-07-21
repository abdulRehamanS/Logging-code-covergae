package In.Abdul.Junit4.Demo.CalculatorTest.PalindromeCHeck;

import In.Abdul.Junit4.Demo.Unit.PalindromeCheck;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class palindromeCheck {

    @ParameterizedTest
    @ValueSource(strings = {"madam", "racecar", "mygym"})
    public void palindromeCheck(String str) {
        PalindromeCheck pc = new PalindromeCheck();
        Boolean actualValue = pc.palindromecheck(str);
        assertTrue(actualValue);
    }
}
