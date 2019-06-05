package Functional_Programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {

        /*
        Write a program which is using  a custom function (written by you) to find the smallest integer in a sequence of integers.
         The input could have more than one space.
         Your task is to collect the integers from the console, find the smallest one and print its index (if more than one such elements exist, print the index of the rightmost one).
         */

        Scanner scanner = new Scanner( System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>,Integer> indexOfTheSmallestNum = Collections::min;  // is the same as aList -> Collections.min(aList)

        System.out.println(list.lastIndexOf(indexOfTheSmallestNum.apply(list)));
    }
}
