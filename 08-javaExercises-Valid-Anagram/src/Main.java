import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        String s = "anagram";
        String t = "nagaram";

        System.out.println("Is it anagram or no: " + isAnagram(s,t));


    }

    private static boolean isAnagram(String s, String t) {

        char[] sChars = s.toCharArray();

        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);

    }
}