import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1,1,1,1,2,2,2,2,3,3,3,3,3,3};

        System.out.println(majorityElement(numbers));
    }

    public static int majorityElement(int[] nums){

        HashMap<Integer, Integer> count = new HashMap<>();

        int res = 0, maxCount=0;

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            if (count.get(num) > maxCount){
                res = num;
                maxCount = count.get(num);
            }
        }
        return res;
    }
}
