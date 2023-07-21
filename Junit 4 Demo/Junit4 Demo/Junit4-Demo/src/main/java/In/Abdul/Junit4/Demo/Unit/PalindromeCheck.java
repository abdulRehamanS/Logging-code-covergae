package In.Abdul.Junit4.Demo.Unit;

public class PalindromeCheck {

    public Boolean palindromecheck(String str) {
        String rev = "";
        Integer length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            return true;
        }
        return false;
    }


}
