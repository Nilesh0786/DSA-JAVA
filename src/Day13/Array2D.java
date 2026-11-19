package Day13;
import java.util.Scanner;
public class Array2D {
    static int maximum(int[][] arr){
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];

                }
            }
        }return max;
    }
    static int minimum(int[][] arr){
        int min=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];

                }
            }
        }return min;
    }







    static void main() {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter the value for row[" + i + "][" + j + "] : ");
                 matrix [i][j] = sc.nextInt();
                // int b = sc.nextInt();
            }
            }
        int max = maximum(matrix);
        int min = minimum(matrix);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);

            // = new int[3][3];
            // int [][] matrix={{1,2,3},{4,5,6,7},{8,9,10,11,12},{13,14,15}};
          int flag=0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                flag+=matrix[i][j];

                }System.out.println();
            }System.out.println("Sum"+flag);


    }
}
