package multiDimensionalArrays;

import java.util.*;
import java.util.stream.Collectors;

public class StringMatrixRotation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int a = Integer.parseInt(scanner.nextLine().substring(7).replace(")", ""));
        List<String> input = new ArrayList<>();
        String in = "";

        while (!"END".equals(in = scanner.nextLine())) {

            input.add(in);
        }
        int bigLength = Integer.MIN_VALUE;
        for (int i = 0; i < input.size(); i++) {
            if (bigLength < input.get(i).length()) {
                bigLength = input.get(i).length();

            }

        }

        int rows = input.size();
        int cols = bigLength;
        String[][] matrix = new String[rows][cols];

        for (int r = 0; r < rows; r++) {
            String loader = input.get(r);
            for (int c = 0; c < cols; c++) {
                if (loader.length() - 1 >= c) {
                    matrix[r][c] = loader.charAt(c) + "";
                } else {
                    matrix[r][c] = "";
                }
            }
        }
        String[][] matrixToPrint = new String[cols][rows];
        switch ((a / 90) % 4) {
            case 0:
                System.out.println("same");
                break;
            case 1:
                for (int col = 0; col < cols; col++) {
                    for (int row = 0; row < rows; row++) {

                        matrixToPrint[col][row]=matrix[row][col];

                    }
                }

                break;

            case 2:
                System.out.println("180");
                break;
            case 3:
                System.out.println("270"); //revers

                break;

        }


        printMatrix(matrixToPrint);

        System.out.println();

    }

    private static void printMatrix(String[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }
}
