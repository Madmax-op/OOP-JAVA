import java.util.*;
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            leftDiagonalSum += matrix[i][i];              
            rightDiagonalSum += matrix[i][2 - i];          
        }
        System.out.println("Sum of left diagonal elements: " + leftDiagonalSum);
        System.out.println("Sum of right diagonal elements: " + rightDiagonalSum);
    }
}
