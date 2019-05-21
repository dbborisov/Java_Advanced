
import java.util.*;

public class ExelFunctions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[size - 1][];
        String[] datas = scanner.nextLine().split(",\\s+");
        for (int i = 0; i < size - 1; i++) {
            String[] input = scanner.nextLine().split(",\\s+");
            matrix[i] = new String[input.length];
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input[j];
            }
        }
        String[] commandInput = scanner.nextLine().split("\\s+");
        String command = commandInput[0];
        String header = commandInput[1];
        int indexToSort = 0;
        for (int i = 0; i < datas.length; i++) {
            if (datas[i].equals(header)) {
                indexToSort = i;
                break;
            }
        }
        int finalIndexToSort = indexToSort;
        switch (command) {
            case "sort":
                print(datas);
                Arrays.stream(matrix)
                        .sorted(Comparator.comparing(e -> e[finalIndexToSort]))
                        .forEach(ExelFunctions::print);
                break;
            case "filter":
                print(datas);
                String name = commandInput[2];
                Arrays.stream(matrix).filter(e -> Arrays.asList(e).contains(name))
                        .forEach(ExelFunctions::print);
                break;
            case "hide":
                printHide(datas, finalIndexToSort);
//                Arrays.stream(matrix)
//                        .forEach(v -> printHide(v, finalIndexToSort));
                List<List<String>> lists = new ArrayList<>();
                lists.add(Arrays.asList(datas));
                for (int i = 0; i < matrix.length; i++) {
                    lists.add(Arrays.asList(matrix[i]));
                }
                lists.stream()
                        .filter(e -> !e.contains(datas[finalIndexToSort]))
                        .forEach(ExelFunctions::printList);
                break;
        }
    }

    private static void printList(List<String> mas) {
        for (int i = 0; i < mas.size(); i++) {
            if (i < mas.size() - 1) {
                System.out.print(mas.get(i) + " | ");
            } else {
                System.out.print(mas.get(i));
            }
        }
        System.out.println();
    }

    private static void printHide(String[] mas, int index) {
        for (int i = 0; i < mas.length; i++) {
            if (i != index) {
                if (i < mas.length - 1) {
                    System.out.print(mas[i] + " | ");
                } else {
                    System.out.print(mas[i]);
                }
            }
        }
        System.out.println();
    }

    private static void print(String[] mas) {
        for (int i = 0; i < mas.length; i++) {
            if (i < mas.length - 1) {
                System.out.print(mas[i] + " | ");
            } else {
                System.out.print(mas[i]);
            }
        }
        System.out.println();
    }
}