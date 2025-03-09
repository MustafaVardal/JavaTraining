public class Main {

    public static void main(String[] args) {

        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int columns = 1;
        int rows = 1;
        int color = 2;

        System.out.println("Image: ");
        printMatrix(image);


        int[][] result= floodFill(image, columns, rows, color);
        System.out.println("\nModified image: ");
        printMatrix(result);

    }

    private static void printMatrix(int[][] result) {
        for (int[] row: result){
            for (int cell: row){
                System.out.print(cell + " ");
            }
            System.out.println();
        }

    }


    public static int[][] floodFill(int[][] image, int row, int column, int color) {

        int rowsOfImageIndex = image.length;
        int columnsOfImageIndex = image[0].length;

        // convert2DTo1DIndexOfArray 1d array will use to provide to check point of column and row as a matrix.
        int originalColorOfIndexes = image[row][column];

        // if this is not equal with color. Validation will be cancelled
        if (color == originalColorOfIndexes) {
            return image;
        }

        dfs(image, row, column, originalColorOfIndexes, color);
        return image;

    }

    private static void dfs(int[][] image, int row, int column, int originalColorOfIndexes, int color) {

        if (row < 0 || column < 0
                || row == image.length || column == image[0].length
                || image[row][column] != originalColorOfIndexes) {

            return;
        }

        image[row][column] = color;
        // initial image indexes.(first node for stack logics(fifo) push and pop)

        /// Deep first searching logic.
        dfs(image, row - 1, column, originalColorOfIndexes, color);
        // first left node will finish and keep with left until row become an equal with image of row of length.
        // until row become an equal with image of row of length.
        dfs(image, row + 1, column, originalColorOfIndexes, color);
        // second left to right nodes will be finished until row become an equal with image of row of length.
        // until row become an equal with image of row of length.
        dfs(image, row, column - 1, originalColorOfIndexes, color);
        // after finished left nodes. then start with first of right nodes and keep continue with other left nodes.
        // Until row become an equal with image of row of length.
        dfs(image,row, column + 1, originalColorOfIndexes, color);
        // after finished right of left nodes, let's start process for right to right nodes.
        // Until row become an equal with image of row of length.
    }
}
