package Functional_Programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        String n = scanner.nextLine();
        List<Integer> nums = Arrays.stream(n.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Collections.reverse(nums);
        int b =Integer.parseInt(scanner.nextLine());
        nums.stream().filter(e->e%b!=0).forEach(e-> System.out.print(e + " "));


    }
}
