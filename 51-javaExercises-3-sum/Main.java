import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        int[] numbers={-1,-2,3,4,5,6};

        System.out.println(threeSum(numbers));
    }

    public static List<List<Integer>> threeSum(int[] nums){

        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0) break;

            if (i > 0 && nums[i] == nums[i -1]) continue;
            int left = i +1, right = nums.length-1;
            while (left< right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                right --;
                } else if (sum < 0) {
                    left++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left-1]){
                        left++;
                    }
                }


            }
        }
        return res;
    }
}
