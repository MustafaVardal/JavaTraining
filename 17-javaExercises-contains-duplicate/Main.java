import java.util.Arrays;
import java.util.HashSet;

public class Main {


    public static void main(String[] args) {
        int [] nums = {1,2,3,3};

        System.out.println(isDuplicate(nums));
    }


    public static boolean isDuplicate(int[] nums){
/*
        // Brute Force Technic which is using 2 pointer and visited each one of number character
        //Time: O(n^2) Space: O(1)
        for (int i = 0; i < nums.length ; i++){
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;


 */

/*
        // This is sorting technic we are using this with in 1 pointer. And this pointer will visit each ordered characters.
        // Time: O(nlog(n)) Space: O(1) O(n)
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
*/

/*
        // Using with Hashset character should be unique so we just put each and every character in a set
        // and compare it with character.
        // Time: O(n) Space:O(n)
        HashSet<Integer> seen = new HashSet<>();

        for (int num: nums){
            if (seen.contains(num)){
                return true;
            }

            seen.add(num);
        }
        return false;
*/

        // enhanced java 8...
        // Time: O(n) Space:O(n)
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}
