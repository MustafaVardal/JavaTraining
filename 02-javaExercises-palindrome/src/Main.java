import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int num = -121;


        System.out.println(num+ "\n"+ "Palindrome number? \n" + num + " -> " + isPalindrome(num));

    }

    private static boolean isPalindrome(int num) {
            if (num <0){
                return  false;
            }

            int reversed =0;

            while (num > reversed){
                reversed = reversed * 10 + num % 10;
                num /= 10;
            }
            return (num == reversed) || (num == reversed / 10);
    }
}

