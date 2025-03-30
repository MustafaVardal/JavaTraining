import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        NumArray numArray = new NumArray(new int[]{1,2,3,4,5,6});
        numArray.sumRange(0,5);
        System.out.println(Arrays.toString(numArray.prefix));
    }
}

class NumArray{
    public int[] prefix;

    public NumArray(int[] nums) {
        prefix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i+1] = prefix[i] + nums[i];
        }
    }

    public int sumRange(int left, int right){
        return prefix[right +1] - prefix[left];
    }


}
