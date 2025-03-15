import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,3,3,3,4,4,4};
        int k = 2;

        System.out.println(Arrays.toString(topFrequent(arr, k)));
    }

    private static int[] topFrequent(int[] arr, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[arr.length +1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>(); // create a bucket size.
        }

        for (int num : arr) {
            count.put(num, count.getOrDefault(num, 0)+1); // getting keys and values variables per number and repeating times.
        }                           // for using bucket frequency as a unique number.

        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }                                       // add number for frequency of bucket size for categorizing each bucket size.

        int[] res = new int[k];
        int index =0;
        for (int i = freq.length - 1; i > 0 && index < k ; i--) {
            for (int n : freq[i]) { // dynamic program logics.
                res[index++] = n;
                if (index == k){
                    return res;
                }
            }
        }


        return res;
    }




    /*private static int[] topFrequent(int[] arr, int k) {

        HashMap<Integer, Integer> count = new HashMap<>();

        for (int num : arr) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        // this is getting biggest values.
        // but the problem what if values are equals number of recurrences.
        // (if they are counting 1 times as a unique iter there is no problem for this edge case.)

        for (Map.Entry<Integer, Integer> entry : count.entrySet()){
            heap.offer(new int[]{entry.getValue(), entry.getKey()});
            if (heap.size() > k){
                heap.poll();
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
           res[i] = heap.poll()[1]; // less priority value get it.
        }

        return res;
    }*/




    /*public static int[] topFrequent(int[] nums, int k){
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num,0) + 1);
        }

        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()){
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        arr.sort((a,b) -> b[0] - a[0]);

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr.get(i)[1];
        }
        return res;
    }*/
}
