import java.util.*;

public class RelatedDsaTopic {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3, 3, 3, 4, 4};
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            count.put(i, nums[i]);
        }
        System.out.println(count);

        for (int i = 0; i < 10; i++) {
            System.out.print(" "+count.getOrDefault(i, 0));
        }
//        System.out.println(count.getOrDefault(2, 0));
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" "+count.put(i, count.getOrDefault(i,0)));
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" "+count.put(i, count.get(i))); // double it. in an array.
        }
        System.out.println();
        /*for (int i = 0; i < nums.length; i++) {
            System.out.print(" "+count.put(i, count.remove(nums[i])));
        }*/
        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry: count.entrySet()){
            System.out.print(" "+ arr.add(new int[]{entry.getKey(), entry.getValue()}));
        }

       arr.sort((a,b) -> b[0] - a[0]);
       // arr.sort((a, b) -> a[0] - b[0]);

        System.out.println();
        // Heap sort
        PriorityQueue<Integer> p = new PriorityQueue<Integer>();
        p.add(10);
        p.add(20); // if the queue is full
        p.add(0); // .add can be exception
        p.offer(20); //.add no throwing exception

        System.out.println(p);
        System.out.println(p.peek());
        System.out.println(p);
        System.out.println(p.poll());
        System.out.println(p);
        System.out.println(p.peek());
        System.out.println(p);

        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b)->a[0] - b[0]);

        heap.offer(new int[]{2, 200});
        heap.offer(new int[]{3, 100});
        heap.offer(new int[]{4, 500});
        heap.offer(new int[]{1, 250});

        int value = heap.poll()[1];

        System.out.println("\nPriority, value will getting when we use heap.pool()[1] => " + value);


    }

    //Bucket Sort

    public static void applySort(int[] arr, int bucketSize){
        if (arr == null || arr.length ==0 || bucketSize < 0){
            return;
        }

        int minValue = arr[0];
        int maxValue = arr[0];

        for (int value : arr){
            if (value < minValue){
                minValue = value;
            } else if (value > maxValue) {
                maxValue = value;
            }
        }

        // get range to ensure goes into correct bucket.

        double range = Math.ceil((double) ((maxValue - minValue) + 1))/bucketSize;

        // create buckets - declared list of integers where each element of arrays is linked list.
        List<Integer>[] buckets = new LinkedList[bucketSize];

        for (int i = 0; i < bucketSize; i++) {
            buckets[i] = new LinkedList<>();
        }

        //insert the values into each bucket
        for (int value : arr) {
            int bucketIndex = (int) ((value - minValue)/ range);
        }

        //sort each bucket

        for (List<Integer> bucket: buckets){
            Collections.sort(bucket);
        }

        // add bucket values back into original array

        int index =0;
        for (List<Integer> bucket : buckets){
            for (int value: bucket){
                arr[index++] =value;
            }
        }
    }

}

