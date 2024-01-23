public class Array_2D {
    public static void main(String[] args) {
        int[][] matrix = new int[5][3];

        // set
        matrix[3][2] = 91;
        System.out.println(matrix[3][2]);

        // get - by default every value is zero
        System.out.println(matrix[2][1]);

        // col length
        System.out.println(matrix[0].length);

        // row length
        System.out.println(matrix.length);

        // traversal
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }






    }
}
