import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7};
        int target = 7;

        System.out.println((Arrays.toString(twoSum(numbers, target))));
        System.out.println(Arrays.toString(twoSumMap(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target){

        int left =0;
        int right = numbers.length - 1;

        while (left < right){
            int curSum = numbers[left] + numbers[right];

            if (curSum > target){
                right--;
            } else if (curSum < target) {
                left++;
            } else {
                return new int[] {left+1,right+1};
            }
        }
        return new int[0];
    }

    public static int[] twoSumMap(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)){
                return new int[] {map.get(temp), i + 1};
            }
            map.put(nums[i], i+1);

        }
        return new int[0];

    }
}
