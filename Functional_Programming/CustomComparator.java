package Functional_Programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> in = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> left =in.stream().filter(e->e%2==0).sorted().collect(Collectors.toList());
        List<Integer> rigth =in.stream().filter(e->e%2!=0).sorted().collect(Collectors.toList());
        List<Integer> all = left;
        all.addAll(rigth);
        all.stream().forEach(e -> System.out.print(e + " " ));


    }
}
