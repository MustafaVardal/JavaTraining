import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String a = "asdasdadsa  adsad sadsa   ";
        List<Character> notEmpty = new ArrayList<>();
        int count=0;
        for (int i = a.length()-1; i>=0; i--){

            if (a.charAt(i) != ' '){
                notEmpty.add(a.charAt(i));
                count++;
            } else if (count > 0){
                break;
            }
        }
        System.out.println(notEmpty.size());
    }
}
