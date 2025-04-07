import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] sumMat = new int[][]{{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        NumMatrix numMatrix = new NumMatrix(sumMat);
        numMatrix.sumRegion(2, 1, 4, 3);
        numMatrix.sumRegion(1, 1, 2, 2);
        numMatrix.sumRegion(1, 2, 2, 4);

    }
}
