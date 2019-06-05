package Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {
        /*
        On the first line you are given a list of numbers. On the next lines you are passed different commands that you need to apply to all numbers in the list:
         "add" -> adds 1;
        "multiply" -> multiplies by 2;
         "subtract" -> subtracts 1;
        "print" -> prints all numbers on a new line. The input will end with an "end" command, after which you need to print the result.
         */

        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String in = "";

        while (!"end".equals(in=scanner.nextLine())){

            switch (in){
                case "add":
                   nums= nums.stream().map(e->++e).collect(Collectors.toList());
                    break;
                case "multiply":
                    nums = nums.stream().map(e->e=e*2).collect(Collectors.toList());
                    break;
                case "subtract":
                    nums = nums.stream().map(e->e-=1).collect(Collectors.toList());
                    break;
                case "print":
                    nums.stream().forEach(e-> System.out.print(e+" "));
                    System.out.println();
                    break;
            }


        }

    }
}
