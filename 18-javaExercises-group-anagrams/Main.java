import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] str = {"eat","tea"};

        System.out.println(groupAnagrams(str));

    }

    public static List<List<String>> groupAnagrams(String[] str){
        HashMap< String, List<String>> map = new HashMap<>();

        for (String string : str) {
            int[] alpha = new int[26];
            for (char c: string.toCharArray()) {
                alpha[c - 'a']++; // ascii value --> 0 and counting how many character we have.
            }
            String key = Arrays.toString(alpha);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(string);
        }
        return new ArrayList<>(map.values());

    }
}