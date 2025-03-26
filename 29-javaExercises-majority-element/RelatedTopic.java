import java.util.HashMap;
import java.util.Random;

public class RelatedTopic {

    public static void main(String[] args) {
        int[] nums = {3,3,3,1,1,1,1,2,2};

        int n = nums.length;
        int[] bit = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                bit[i] += (num >> i) & 1;
            }
        }

        int res =0;
        for (int i = 0; i < 32; i++) {
            if (bit[i]> n/2){
                res |= (1 << i);
            }
        }
        System.out.println(res);


        int count =0;
        for (int num : nums) {
            if (count == 0){
                res = num;
            }
            count += (num == res) ? 1: -1;
        }
        System.out.println(res);


        Random random = new Random();
        int nSize = nums.length;
        while (true){
            int candidate = nums[random.nextInt(n)];
            int count1 = 0;
            for (int num : nums) {
                if (num == candidate){
                    count1++;
                }
            }
            if (count1 > n /2){
                System.out.println(candidate);

            }

        }

    }




}
