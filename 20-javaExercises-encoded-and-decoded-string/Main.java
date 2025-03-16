import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Main {

    public static void main(String[] args) {

        List<String> strs= List.of(new String[]{"Im", "deep", "dde"});
        String encoded= encode(strs);
        System.out.println(encoded);

        System.out.println(decoded(encoded));

    }

    public static String encode(List<String> str){
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : str) {
            stringBuilder.append(string.length()).append("#").append(string);
        }
        return stringBuilder.toString();
    }

    public static List<String> decoded(String str){
        List<String> strings = new ArrayList<>();
        int i = 0;
        while (i < str.length()){
            int j = i;
            while (str.charAt(j) !='#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j+1;
            j = i+ length;
            strings.add(str.substring(i, j));
            i = j;
        }


        return strings;


    }
}
