import java.util.*;

public class RelatedDsaTopic {

    public static void main(String[] args) {
        String a  = "   Hello World ";
        System.out.println(a.trim());
        System.out.println(a.lastIndexOf('e'));


        List<Character> letters = new ArrayList<>();
        for (int i = a.length()-1; i >= 0; i--){
            if (a.charAt(i) != ' '){
                letters.add(a.charAt(i));
            }
        }
        for (char letter:letters){
            System.out.print(letter);
        }
        System.out.println();


    }
}
