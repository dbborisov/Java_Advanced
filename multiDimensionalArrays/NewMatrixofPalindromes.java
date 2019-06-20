package multiDimensionalArrays;

import java.util.Scanner;

public class NewMatrixofPalindromes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] in = scanner.nextLine().split("\\s+");
        int rowSize = Integer.parseInt(in[0]);
        int colSize = Integer.parseInt(in[1]);
        String[][] martrix = new String[rowSize][colSize];

        char value = 'a';
        for (int row = 0; row < rowSize ; row++) {
            for (int col = 0; col < colSize ; col++) {
                martrix[row][col] = value +"" +( (char)(value + col)) + value;
            }
            value++;
        }
        for (int row = 0; row < rowSize ; row++) {
            for (int col = 0; col < colSize; col++) {

                System.out.print(martrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
