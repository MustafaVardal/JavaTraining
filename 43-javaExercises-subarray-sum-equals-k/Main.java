import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};

        int  k=2;

        int result= subarraySum(nums, k);
        System.out.println(result);

    }


    public static int subarraySum(int[] nums, int k){

        int res =0,  curSum=0;

        Map<Integer, Integer> prefixSums = new HashMap<>();

        prefixSums.put(0,1);

        for (int num : nums) {
            curSum += num;

            int diff = curSum - k;

            res += prefixSums.getOrDefault(diff, 0);
            prefixSums.put(curSum, prefixSums.getOrDefault(curSum, 0) + 1);
        }

        return res;
    }
}
