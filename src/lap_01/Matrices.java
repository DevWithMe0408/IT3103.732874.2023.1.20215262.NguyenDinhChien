package lap_01;

public class Matrices {

    public static void main(String[] args) {
        //input two matrices
        int[][] arr1 = {{1, 1, 4}, {2, 2, 3}, {3, 4, 5}};
        int[][] arr2 = {{1, 1, 4}, {2, 2, 3}, {1, 2, 4}};

        //input the column and row of these matrices
        int row = 3;
        int col = 3;
        //create another matrix to store the sum of two matrices
        int[][] sum = new int[row][col];//2 rows and 2 columns

        System.out.println("Sum of the matrices: ");
        //add & print the addition of 2 matrices
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
    }

}