import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        String s = "}{";


        System.out.println(s+ "\n"+ "Is it valid ? " +"\n" + s + " -> " + isValid(s));

    }


    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (char c: s.toCharArray()){
            if (map.containsValue(c)){
                stack.push(c);
            } else if (map.containsKey(c)) {
                if (stack.isEmpty() || map.get(c) != stack.pop()){
                    return false;
                }

            }
        }

        return stack.isEmpty();
    }

}

