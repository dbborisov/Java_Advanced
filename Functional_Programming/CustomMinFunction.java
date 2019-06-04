package Functional_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CustomMinFunction {
    public static void main(String[] args) {


        /*
            Write a simple program that reads a set of numbers from the console and finds the smallest of the numbers using a simple Function<Integer[], Integer> .
         */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println(Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).min().getAsInt());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
