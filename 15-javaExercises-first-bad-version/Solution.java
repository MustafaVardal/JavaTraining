public class Solution extends  VersionControl{

    public Solution(int firstBadVersion) {
        super(firstBadVersion);
    }

    public int findFirstBadVersion(int totalPointer) {

        int leftPointer = 0;
        int rightPointer = totalPointer;

        while (rightPointer - leftPointer > 1) {
            int mid = (rightPointer + leftPointer) / 2;

            if (isBadVersion(mid)) {
                rightPointer = mid;
            } else {
                leftPointer = mid;
            }
        }
        return rightPointer;
    }
}
