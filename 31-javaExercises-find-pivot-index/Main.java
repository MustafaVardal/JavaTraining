public class Main {

    public static void main(String[] args) {
        int[] nums = {2,1,-1};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums){

        int total = 0;
        for (int num : nums) {
            total += num;
        }
        int leftSum= 0;
        for (int i = 0; i < nums.length; i++) {
            int rigthSum = total - leftSum - nums[i];
            if (leftSum == rigthSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;

      /*  int n = nums.length;

        for (int i = 0; i < n; i++) {
            int leftSum= 0, rightSum=0;
            for (int l = 0; l < i; l++) {
                leftSum = leftSum + nums[l];
            }
            for (int r = i+1; r < n; r++) {
                rightSum = rightSum + nums[r];
            }
            if (leftSum == rightSum){
                return i;
            }
        }
        return -1;*/
    }
}
