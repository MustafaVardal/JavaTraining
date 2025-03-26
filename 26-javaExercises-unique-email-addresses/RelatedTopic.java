import java.util.Arrays;

public class RelatedTopic {

    public static void main(String[] args) {
        String s = "this is, comma.fullstop whitespace";

        String regex = "[,\\s\\.]";

        String[] arr = s.split(regex);

        for (String string : arr) {
            System.out.print(" "+ string);
        }

        System.out.println();
        String s1 = "joedoe@gmail.com";
        String[] arr2 = s1.split("@", 2);

        for (String string : arr2) {
            System.out.println(string);
        }

        System.out.println();

        String s3 = "Joe@Doe@gmail.com";

        String[] arr3 =s3.split("@",5);


        for (String string : arr3) {
            System.out.println(string);
        }
        System.out.println();
        String s4 = "joe@doe@da";

        String[] arr4 = s4.split("@", -2);
        for (String string : arr4) {
            System.out.println(string);
        }
        System.out.println();
        String[] strings = {"joedoe@mail.com", "zoepoe@mail.com","diobio@mail.com"};


        System.out.println(strings[0]);

        String a= strings[0];
        String[] b = a.split("@");
        String name = b[0];
        String all = name.replace(".","")+ "@" + b[1];

        System.out.println(all);


        String[] strings1 = {"","asdad.dsadssa","dasdadsaw2/dsasd"};

        String string = strings1[1];
        String[] strings2 = string.split("\\.");
        String string1 = strings2[1];
        String each = string1 + strings2[1];

        System.out.println(string1);
    }
}
