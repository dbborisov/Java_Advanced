package MapAndSet;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> in = Arrays.stream(scanner.nextLine().split("")).map(Integer::parseInt).collect(Collectors.toCollection(TreeSet::new));
        in.stream().count();
    }
}
