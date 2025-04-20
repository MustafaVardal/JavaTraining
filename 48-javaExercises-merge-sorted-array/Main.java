public class Main {


    public static void main(String[] args) {

        int[] numbers1 = {1,2,3,0,0,0};
        int[] numbers2 = {2,5,6};

        int m = 3;
        int n = 3;

        int new1= merge(numbers1, m, numbers2, n);
        System.out.println(new1);


    }

    public static int merge(int[] nums1, int m, int[] nums2, int n) {


        int last = m + n - 1;
        int i = m - 1, j = n - 1;


        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[last--] = nums1[i--];
            } else {
                nums1[last--] = nums2[j--];
            }
        }

        return nums1[last];
    }

}


