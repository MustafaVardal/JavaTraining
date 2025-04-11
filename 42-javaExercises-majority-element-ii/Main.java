import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,7,7,8};

        System.out.println(majorityElement(nums).toString());

    }


    public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) +1);
        }
        List<Integer> res = new ArrayList<>();
        for (int key: map.keySet()){
            if (map.get(key) > nums.length /3){
                res.add(key);
            }
        }
        return res;
    }
}
