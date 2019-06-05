package Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames {
    public static void main(String[] args) {

        /*
        Write a predicate. Its goal is to check a name for its length and to return true if the names length is less or equal the passed integer.
         You will be given an integer that represents the length you have to use.
         On the second line you will be given a string array with some names. Print the names, passing the condition in the predicate.
         */

        Scanner scanner  = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        Predicate<String> isLenghtLess = e -> e.length() <= lenght ;
        names.stream().filter(e -> isLenghtLess.test(e)).forEach(System.out::println);

    }
}
