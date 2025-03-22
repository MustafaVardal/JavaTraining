public class Main {

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3,4,4,5,5};
        int val =4;
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val){
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val){
                nums[index] = nums[i];
                index++;
            }
        }

        return index;


    }
}
