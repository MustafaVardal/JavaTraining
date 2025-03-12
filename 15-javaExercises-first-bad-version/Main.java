public class Main {


    public static void main(String[] args) {
       int n = 10;
       int firstBadVersion = 4;

       Solution solution = new Solution(firstBadVersion);

       int result = solution.findFirstBadVersion(n);

        System.out.println("First Buggy Version: " + result);
    }


}
