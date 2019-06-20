package multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] line = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rows = line[0];
        int cols = line[1];

        int[][] matrix = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        int maxSum = -1;
        int maxIndexRow = -1;
        int maxIndexCol = -1;
        for (int row = 1; row < rows - 1; row++) {
            for (int col = 1; col < cols - 1; col++) {

                int currantSum = getMaxSum(matrix, row, col);
                if(maxSum<currantSum){
                    maxSum = currantSum;
                    maxIndexRow = row;
                    maxIndexCol = col;
                }
            }

        }


        System.out.println("Sum = " + maxSum);

        matrixPrint(matrix,maxIndexRow,maxIndexCol);

    }

    private static void matrixPrint(int[][] matrix, int maxIndexRow, int maxIndexCol) {
        for (int row = maxIndexRow-1; row < maxIndexRow+2; row++) {
            for (int col = maxIndexCol-1; col < maxIndexCol+2; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }

    private static int getMaxSum(int[][] matrix, int row, int col) {
        int sum = 0;

        sum += matrix[row][col];
        sum += matrix[row - 1][col];
        sum += matrix[row + 1][col];
        sum += matrix[row][col + 1];
        sum += matrix[row][col - 1];
        sum += matrix[row - 1][col - 1];
        sum += matrix[row + 1][col + 1];
        sum += matrix[row + 1][col - 1];
        sum += matrix[row - 1][col + 1];

        return sum;
    }
}
