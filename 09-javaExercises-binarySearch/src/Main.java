import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] nums = {1,5,4,6,9,0,7,3};
        int target = 9;

        Arrays.sort(nums);

        int findIndex = search(nums, target);

        System.out.println(findIndex);

    }

    private static int search(int[] nums, int target) {

        int left =0;
        int right = nums.length -1;

        while (left <= right){
            int midd = (left + right ) /2;

            if (nums[midd] == target){
                return midd;
            } else if (nums[midd] < target) {
                left = midd + 1;
            } else {
                right = midd -1;
            }
        }
        System.gc();
        return -1;

    }
}