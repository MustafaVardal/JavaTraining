public class Solution extends  VersionControl{

    public Solution(int firstBadVersion) {
        super(firstBadVersion);
    }

    public int findFirstBadVersion(int totalPointer) {


        int leftPointer = 1;
        int rightPointer = totalPointer;

        while (leftPointer <= rightPointer) {
            int mid = (rightPointer + leftPointer) / 2;

            if (isBadVersion(mid)) {
                rightPointer = mid -1;
            } else {
                leftPointer = mid +1;
            }
        }
        return leftPointer;
    }
}
