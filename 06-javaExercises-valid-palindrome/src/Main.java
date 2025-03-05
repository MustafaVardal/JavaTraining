public class Main {
    public static void main(String[] args) {

        String s = "race a car";
        System.out.println(s + " is palindrome -> " + isPalindrome(s));
    }


    public static boolean isPalindrome(String s){

        if (s.isEmpty()){
            return true;
        }

        int firstValue = 0;
        int lastValue = s.length()-1;

        while (firstValue<=lastValue){
            char currentFirst = s.charAt(firstValue);
            char currentLast = s.charAt(lastValue);

            if (!Character.isLetterOrDigit(currentFirst)){
                firstValue++;
            } else if (!Character.isLetterOrDigit(currentLast)) {
                lastValue--;
            } else {
                if (Character.toLowerCase(currentFirst) != Character.toLowerCase(currentLast)){
                    return false;
                }
            }
            firstValue++;
            lastValue--;
        }
        return true;
    }
}

