import java.util.Locale;

public class RelatedDsTopic {
    public static void main(String[] args) {


        String a = "Apple";
        String b = "Banana";
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(4));
        System.out.println(a.charAt(3));

        if (a.toLowerCase(Locale.ROOT).charAt(0) == b.toLowerCase().toLowerCase(Locale.ROOT).charAt(1)){
            System.out.println("A");
        }
        char[]s = new char[a.length()];
        a.getChars(0, a.length(), s, 0);
        System.out.println(s);




    }
}
