import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RelatedTopic {

    public static void main(String[] args) {


        // if there is no greater element than -1;
        // we are only looking right side of each value. If there is no greater element then write -1;

        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> seen = new HashSet<>();
        int[] nums1 = {1,2,3,4,5,6};
        int[] nums2 = {2,6,4};

        for (int i = 0; i < nums1.length; i++) {
            for (int j = nums2.length-1; j >=0 ; j--) {
                if (nums2[j] == nums1[i]){
                    map.put(i,nums1[i]);
                }else {
                    seen.add(map.getOrDefault(nums1[i], -1));
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
