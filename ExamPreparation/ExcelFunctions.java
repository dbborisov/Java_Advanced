package ExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExcelFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        List<List<String>> matrix = new ArrayList<>();
        for (int row = 0; row < size; row++) {
            matrix.add(new ArrayList<>());
            matrix.get(row).addAll(Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList()));
        }
        String[] command = scanner.nextLine().split(" ");

        if (command[0].equals("hide")) {
            int index = matrix.get(0).indexOf(command[1]);
            for (int row = 0; row < matrix.size(); row++) {
                matrix.get(row).remove(index);
            }
        } else if (command[0].equals("sort")) {
            int index = matrix.get(0).indexOf(command[1]);
            System.out.println(matrix.get(0).stream().collect(Collectors.joining(" | ")));
            matrix = matrix.stream().filter(e->!e.get(0).contains("name")).sorted((e1,e2)->e1.get(index).compareTo(e2.get(index))).collect(Collectors.toList());

        }else if(command[0].equals("filter")){
            int index = matrix.get(0).indexOf(command[1]);
            System.out.println(matrix.get(0).stream().collect(Collectors.joining(" | ")));
            matrix = matrix.stream().filter(e->e.get(index).equals(command[2])).collect(Collectors.toList());

        }
        printMatrix(matrix);
    }

    public static void printMatrix(List<List<String>> matrix) {
        for (int row = 0; row < matrix.size(); row++) {
            System.out.println(matrix.get(row).stream().collect(Collectors.joining(" | ")));
//            for (int col = 0; col < matrix.get(row).size(); col++) {
//                System.out.print(matrix.get(row).get(col));
//            }
//            System.out.println();
        }
    }
}
