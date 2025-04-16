public class Main {

    public static void main(String[] args) {

        String s = "Karak";

        System.out.println(" Is it palindrome? "+ isPalindrome(s));
    }

    public static boolean isPalindrome(String s){

        int left =0;
        int right = s.length() - 1;
        while (left < right) {

            while(left < right && !alphaNum(s.charAt(left))){
                left++;
            }
            while (right > left && !alphaNum(s.charAt(right))){
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }

    private static boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
