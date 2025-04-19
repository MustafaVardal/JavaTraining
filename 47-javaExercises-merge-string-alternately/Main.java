public class Main {
    public static void main(String[] args) {

        String a = "abc";
        String b = "df";
        String d= mergeAlternately(a,b);
        System.out.println(d);
    }


    public static String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        StringBuilder res = new StringBuilder();
        int i = 0, j = 0;
        while (i < n || j < m) {
            if (i < n) res.append(word1.charAt(i++));
            if (j < m) res.append(word2.charAt(j++));
        }
        return res.toString();

    }
}
