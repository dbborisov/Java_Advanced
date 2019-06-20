package multiDimensionalArrays;

import java.util.Scanner;

public class NewFilltheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] in = scanner.nextLine().split(", ");

        Integer size = Integer.parseInt(in[0]);
        String type = in[1];

        int[][] matrix = new int[size][size];

        if (type.equals("A")) {
            int value = 1;
            for (int col = 0; col < size; col++) {
                for (int row = 0; row < size; row++) {
                    matrix[col][row] = value;
                    value++;
                }
            }
        } else {
            int value = 1;
            for (int col = 0; col < size; col++) {
            if (col % 2 == 0) {
                    for (int row = 0; row < size; row++) {
                        matrix[col][row] = value;
                        value++;
                    }
                } else {
                    for (int row = size - 1; row >= 0; row--) {

                        matrix[col][row] = value;
                        value++;
                    }
                }
            }
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[col][row] + " ");
            }
            System.out.println();
        }

    }
}
