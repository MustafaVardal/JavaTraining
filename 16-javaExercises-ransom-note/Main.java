public class Main {

    public static void main(String[] args) {

        String a = "ab";
        String b= "abcd";

        System.out.println("First string has same character/characters ? " + canConstruct(a,b));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] alphabet = new int[26]; // a to z alphabet index

        for (char c : ransomNote.toCharArray()) { // take each letter
            int i = magazine.indexOf(c, alphabet[c % 26]);  // search the c in magazine( basically we are looking for each one of ransomnote letters)
            if (i == -1) return false; // if it is not then return false;
            alphabet[c % 26] = i + 1; // go next ransomNote character.
        }
        return true;
    }
}
