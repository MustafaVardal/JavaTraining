import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        int[] nums1 = {2,3,4,5,6};
        int[] nums2 = {3,4,5,6};


        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2){

        HashMap<Integer, Integer> indexNum1 = new HashMap<>();
       int i =0;
        for (int num : nums1) {
            indexNum1.put(num,i);
            i++;
        }

        int[] res = new int[nums1.length];
        for (int j = 0; j < res.length; j++) {
            res[j]= -1;
        }

        Stack<Integer> stack = new Stack<>();

        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()){
                int val = stack.pop();
                int idx = indexNum1.get(val);
                res[idx] = num;
            }
            if (indexNum1.containsKey(num)){
                stack.push(num);
            }
        }
        return res;

        /*Arrays.fill(res,-1);

        for (int k = 0; k < nums2.length; k++) {
            if (!indexNum1.containsKey(nums2[k])){
                continue;
            }
            for (int j = k+1 ; j < nums2.length ; j++) {
                if (nums2[j] > nums2[k]){
                    int index = indexNum1.get(nums2[k]);
                    res[index] = nums2[j];
                    break;
                }
            }
        }
        return res;*/
    }
}
