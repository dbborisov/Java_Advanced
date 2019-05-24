package SetAndMaps;

import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        TreeSet<String> periodicTable = new TreeSet<>();

        for (int i = 0; i <num ; i++) {
            String[] val = scanner.nextLine().split("\\s+");
            for (int j = 0; j <val.length ; j++) {
                periodicTable.add(val[j]);
            }
        }
        periodicTable.forEach(e->System.out.print(e+" "));
    }
}
