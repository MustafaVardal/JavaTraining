import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {5,2,3,1};
        System.out.println(Arrays.toString(sortArray(arr)));
    }

    public static int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftPart = new int[n1];
        int[] rightPart = new int[n2];

        System.arraycopy(arr, left, leftPart, 0, n1);
        System.arraycopy(arr, mid + 1, rightPart, 0, n2);
        int p1 =0, p2=0, writeInd= left;
        while (p1 < n1 && p2 < n2 ){
            if (leftPart[p1] <= rightPart[p2]){
                arr[writeInd++] = leftPart[p1++];
            }else {
                arr[writeInd++] = rightPart[p2++];
            }
        }
        while (p1< n1){
            arr[writeInd++] = leftPart[p1++];
        }
        while (p2<n2){
            arr[writeInd++] = rightPart[p2++];
        }

    }
}
