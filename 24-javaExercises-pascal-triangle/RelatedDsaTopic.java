import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RelatedDsaTopic {

    public static void main(String[] args) {

        List<List<Integer>> nestedList = new ArrayList<>(); // MultiD

        nestedList.add(new ArrayList<Integer>());

        nestedList.get(0).add(0,3);
        nestedList.add(new ArrayList<Integer>(Arrays.asList(3,4,6)));
        nestedList.get(1).add(0,366);
        nestedList.get(1).add(4,576);
        nestedList.add(2, new ArrayList<Integer>(Arrays.asList(3, 84)));
        nestedList.add(new ArrayList<>(Arrays.asList(83, 6684, 776)));
        nestedList.add(new ArrayList<>(Arrays.asList(8)));
        nestedList.add(new ArrayList<>(Arrays.asList(2)));
        nestedList.get(4).addAll(Arrays.asList(9, 10, 11));
        nestedList.get(1).addAll(3, Arrays.asList(22, 1000));

        System.out.println(nestedList);

        List<List<Integer>> as = new ArrayList<>();
        int rowCount =32;
        for (int  n =0 ; n < rowCount ;n= n+2 ){
            List<Integer> row = new ArrayList<>();
            row.add(n);
            int val = 2;

            for (int k = 1; k <=n ; k++) {
                val = val * (n - k);
                row.add(val);
            }
            as.add(row);
        }

        for (List<Integer> a : as) {
            System.out.println(a);
        }



    }

}
