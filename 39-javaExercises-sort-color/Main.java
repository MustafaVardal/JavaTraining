public class Main {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,2,2,2,0,0,0};
        sortColor(nums);
    }

    public static void sortColor(int[] nums){
        int[] count = new int[3];

        for (int num : nums) {
            count[num]++;
        }

        int index =0;
        for (int i = 0; i < 3; i++) {
            while (count[i]-- > 0){
                nums[index++] = i;
            }
        }
        for (int num : nums) {
            System.out.print(num+ ", ");
        }
    }
}
