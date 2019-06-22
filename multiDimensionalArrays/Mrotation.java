package multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mrotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rotation = scanner.nextLine().split("\\(|\\)");
        List<String> list = new ArrayList<>();
        int count = 0;
        int maxInputLenght = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("END")) {
                break;
            }
            list.add(input);
            if (input.length() > maxInputLenght) {
                maxInputLenght = input.length();
            }
            count++;
        }
        char[][] matrix = new char[count][maxInputLenght];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j < list.get(i).length()) {
                    matrix[i][j] = list.get(i).charAt(j);
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }
        int rotationToInt = Integer.parseInt(rotation[1]) % 360;
        if (rotationToInt == 270) {
            for (int i = maxInputLenght - 1; i >= 0; i--) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[j][i]);
                }
                System.out.println();
            }
        } else if (rotationToInt == 180) {
            for (int i = matrix.length - 1; i >= 0; i--) {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        } else if (rotationToInt == 90) {
            for (int i = 0; i < maxInputLenght; i++) {
                for (int j = matrix.length - 1; j >= 0; j--) {
                    System.out.print(matrix[j][i]);
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        }
    }
}
