public class Main {
    public static void main(String[] args) {

        String s = "race a car";
        System.out.println(s + " is palindrome -> " + isPalindrome(s));
    }


    public static boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder();

       for (char ch : s.toCharArray()){
           if (Character.isLetterOrDigit(ch)){
               sb.append(Character.toLowerCase(ch));
           }
       }
       if (sb.toString().equals(sb.reverse().toString())){
           return true;
       }
       return false;
    }
}

