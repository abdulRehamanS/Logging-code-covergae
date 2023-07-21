package In.Abdul.Junit.Testing.CheckPalindrome;


import In.Abdul.Junit.Testing.PalindromeCheckObject.PalindromeCheck;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class pcCheck {


    @ParameterizedTest
    @ValueSource(strings = {"mygym" ,"racecar","mygym"})
    public void testPalindrome(String str) {
        PalindromeCheck pp = new PalindromeCheck();
        boolean actulValue = pp.palindromecheck(str);
        assertTrue(actulValue);
    }


}
