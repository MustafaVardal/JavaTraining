import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,5,1,2,3,5,6,7,8};
        System.out.println(longestConsecutive(nums));

    }

    public static int longestConsecutive(int[] nums){
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longest =0;

        for (int num : numSet) {
            if (!numSet.contains(num-1)){
                int length =1;
                while (numSet.contains(num + length)){
                    length++;
                }
                longest =Math.max(longest ,length);
            }
        }
        return longest;
    }
}
