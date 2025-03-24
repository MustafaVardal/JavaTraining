import java.util.Arrays;

public class RelatedTopic {
    public static void main(String[] args) {

        String a = "adobe";
        String b = "dadada";
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        int i = 0;

        for (char c : charsA) {
            char ch2 = charsB[i++];

            if (c == ch2){
                System.out.println(c);
            }
            System.out.println(ch2);
        }

        int mapSizeA[] = new int[128];
        int mapSizeB[] = new int[128];

        for (char ca : charsA) {
            mapSizeA[ca] = i+1;
            System.out.println(mapSizeA[ca]);

        }



    }
}

