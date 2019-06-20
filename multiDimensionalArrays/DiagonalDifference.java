package multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];

        for (int row = 0; row < size; row++) {

            int[] values = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < size; col++) {
                matrix[col][row] = values[col];
            }
        }
        System.out.println(sumDiagonals(matrix));


    }

    private static int sumDiagonals(int[][] matrix) {

        int sumFirstDiagonal = 0;
        int sumSecondDiagonal = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                sumFirstDiagonal += matrix[row][col + row];
                break;

            }
            for (int backRow = matrix.length - 1; backRow > 0; backRow--) {
                sumSecondDiagonal += matrix[backRow - row][row];
                break;

            }
        }
        int sum = Math.abs(sumFirstDiagonal - sumSecondDiagonal);

        return sum;
    }


}

