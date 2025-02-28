import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int[] nums = {1, 2, 3, 5, 6};
        int target = 3;

        System.out.println("Number of position when the computing is happening will be -> " + Arrays.toString(hashTableMethod(nums, target)) +
                "\nTarget -> " + target );

    }

    private static int[] hashTableMethod(int[] nums, int target) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();
        int i = 0;
        while ((i < nums.length) && (hashtable.get(nums[i]) == null)){
            hashtable.put(target - nums[i], i);
            i++;
        }
        if (i < nums.length) {
            return new int[]{hashtable.get(nums[i]), i};
        }
        return null;
    }

   /* private static int[] twoSumMoreFunctionalWay(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            var item = nums[i];
            for (int j = 0; j < nums.length; j++) {
                var item2 = nums[j];
                var sum = item + item2;
                if (sum == target) {
                    return new int[]{i, j};
                }

            }
        }
        return new int[]{};
    }*/
}


   /* public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int exist = target - nums[i];

            if (map.containsKey(exist) && map.get(exist) != i) {

                return new int[]{i, map.get(exist)};
            }
        }


        return new int[]{};
    }
}*/