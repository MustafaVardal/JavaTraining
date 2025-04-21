public class Main {

    public static void main(String[] args) {
        int[]nums= {1,1,2,2,3,3,4,5,6};

        System.out.println("With duplicate: ");
        for (int num : nums) {
            System.out.printf(num +" ");
        }
        int a= removeDuplicates(nums);
        System.out.println("\nWithout duplicate: ");
        System.out.println(a);
    }

    public static int removeDuplicates(int[] nums){
        int n = nums.length;
        int l = 0;
        int r = 0;
        while (r < n){
            nums[l] = nums[r];
            while (r < n && nums[r] == nums[l]){
                r++;
            }
            l++;
        }
        return l;
    }
}
