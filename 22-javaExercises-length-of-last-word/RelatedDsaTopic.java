import java.util.*;

public class RelatedDsaTopic {

    public static void main(String[] args) {
        String a  = "   Hello World ";
        System.out.println(a.trim());
        System.out.println(a.lastIndexOf('e'));
        String b = "My name is donkey";


        System.out.println(a.compareTo(b));
        System.out.println(a.compareToIgnoreCase(b));

        System.out.println(a.equals(b));

        System.out.println(a.concat("\n"+ b));

        List<Character> letters = new ArrayList<>();
        for (int i = a.length()-1; i >= 0; i--){
            if (a.charAt(i) != ' '){
                letters.add(a.charAt(i));
            }
        }
        for (char letter:letters){
            System.out.print(letter);
        }



    }
}
