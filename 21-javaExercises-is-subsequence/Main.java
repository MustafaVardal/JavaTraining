public class Main {

    public static void main(String[] args) {
        String s = "sad";
        String t = "suburband";
        System.out.println(isSubsequence(s, t));
    }

    private static boolean isSubsequence(String s, String t) {

        int i =0, j =0;
        while (i < s.length() && j < t.length()){
            if (s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
    return i == s.length();
    }
        /*return rec(s, t, 0, 0);
    }

    private static boolean rec(String s, String t, int i, int i1) {
        if (i == s.length()) return true;
        if(i1 == t.length()) return false;
        if (s.charAt(i)== t.charAt(i1)){
            return  rec(s,t,i+1,i1+1);
        }
        return rec(s,t,i,i1+1);
    }*/
}
