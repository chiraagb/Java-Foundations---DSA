import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Before Transpose");
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println("\n\nAfter Transpose");

        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
