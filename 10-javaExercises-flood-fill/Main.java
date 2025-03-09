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
            // keep continue if this condition is observing.
        }

        image[row][column] = color;
        // change the color

        /// Deep first searching logic.
        dfs(image, row - 1, column, originalColorOfIndexes, color);
        // direction for row of upper nodes because deep first search left will initialize left.
        dfs(image, row + 1, column, originalColorOfIndexes, color);
        // direction for row of down nodes.
        dfs(image, row, column - 1, originalColorOfIndexes, color);
        // direction for node of left because this is required if you want to use dfs.
        dfs(image,row, column + 1, originalColorOfIndexes, color);
        // then check direction of node of right
    }
}
