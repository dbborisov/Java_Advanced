package multiDimensionalArrays;

import java.util.Scanner;

public class FilltheMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] pattern = scanner.nextLine().split(",\\s+");

        int[][] forPrint = pattern[1].equalsIgnoreCase("A") ? matrixA(Integer.parseInt(pattern[0])) : matrixB(Integer.parseInt(pattern[0]));

        print(forPrint);
    }

    static int[][] matrixA(int size) {

        int[][] model = new int[size][size];
        int value = 1;
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                model[row][col] = value++;

            }

        }


        return model;

    }

    static int[][] matrixB(int size) {
        int[][] model = new int[size][size];
        int value = 1;

        for (int col = 0; col < size; col++) {
            if (col % 2 == 0) {

                for (int row = 0; row < size; row++) {
                    model[row][col] = value++;

                }
            } else {
                for (int row = size -1 ; row >= 0; row--) {
                    model[row][col] = value++;
                }
            }


        }
        return model;
    }
    
    static void print(int[][] forPrint){
        for (int row = 0; row < forPrint.length; row++) {
            for (int col = 0; col < forPrint.length ; col++) {
                System.out.print(forPrint[row][col] + " ");
            }
            System.out.println();
            
        }
    }
}

//    static void print(int[][] pr){
//
//        for (int i = 0; i < pr.length ; i++) {
//            for (int j = 0; i < pr.length ; i++) {
//                System.out.println();
//
//            }
//        }
//
//    }
    