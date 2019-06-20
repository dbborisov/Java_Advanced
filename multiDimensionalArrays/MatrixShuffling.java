package multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        int row = Integer.parseInt(line[0]);
        int col = Integer.parseInt(line[1]);

        String[][] matrix = new String[row][col];
        for (int r = 0; r < row; r++) {
            matrix[r] = scanner.nextLine().split(" ");
        }
        String cmd = "";

        while (!"END".equals(cmd = scanner.nextLine())) {
            line = cmd.split(" ");

            if (cmd.contains("swap") && line.length == 5) {
                int rowFirst = Integer.parseInt(line[1]);
                int colFirst = Integer.parseInt(line[2]);
                int rowSecond = Integer.parseInt(line[3]);
                int colSecond = Integer.parseInt(line[4]);

                if (isInBound(matrix, rowFirst, colFirst) && isInBound(matrix, rowSecond, colSecond)) {

                    String temp = matrix[rowFirst][colFirst];
                    matrix[rowFirst][colFirst] = matrix[rowSecond][colSecond];
                    matrix[rowSecond][colSecond] = temp;
                   printMatrix(matrix,row,col);

                } else {
                    System.out.println("Invalid input!");
                }

            } else {
                System.out.println("Invalid input!");
            }


        }

    }

    private static void printMatrix(String[][] matrix, int row, int col) {
        for (int r = 0; r < row ; r++) {
            for (int c = 0; c <col ; c++) {
                System.out.print(matrix[r][c]+ " ");
            }
            System.out.println();
        }
    }

    private static boolean isInBound(String[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && matrix[row].length > col;
    }
}
