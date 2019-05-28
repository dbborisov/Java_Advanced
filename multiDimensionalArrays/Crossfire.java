package multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] size = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::new).toArray();

        String[][] matrix = new String[size[0]][size[1]];
        int count =1;

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col <matrix.length ; col++) {
               matrix[row][col]=count + " ";
                count++;

            }
//            System.out.println();

        }

        String in;
        while (!"Nuke it from orbit".equals(in =scanner.nextLine())) {
            String[] cmd = in.split("\\s+");
            int row = Integer.parseInt(cmd[0]);
            int col = Integer.parseInt(cmd[1]);
            int radius = Integer.parseInt(cmd[2]);

            String centerDetonation =matrix[row][col];

            for (int i = 0; i < size[0] ; i++) {
                if(i==col){
                    continue;
                }
            }

            System.out.println(matrix[row][col]);
        }

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col <matrix.length ; col++) {
                System.out.print(matrix[row][col] );

            }
            System.out.println();

        }

    }
}
