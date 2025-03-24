public class Main {
    public static void main(String[] args) {

        String first  = "bababa";

        String second = "taktak";

        System.out.println("is this isomorphic: " + isIsomorphic(first, second));

    }

    public static boolean isIsomorphic(String s, String t){
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        int i =0;

        int[] sizeS  = new int[128];
        int[] sizeT = new int[128];

        for (char sc : charS) {
            char tc = charT[i++];
            if (sizeS[sc] != sizeT[tc]){
                return false;
            }

            sizeS[sc] = i+1;
            sizeT[tc] = i+1;
        }

        return true;
    }
}
