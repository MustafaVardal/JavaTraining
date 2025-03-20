import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int n = 0; n < numRows; n++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            int val = 1;
            for (int k = 1; k <=n ; k++) {
                val = val * (n - k + 1 ) / k;
                row.add(val);
            }
            res.add(row);
        }
        return res;
    }
}
