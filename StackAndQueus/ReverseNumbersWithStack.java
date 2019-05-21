package StackAndQueus;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        ArrayDeque<String> input = new ArrayDeque();

        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(e -> input.push(e));

        input.forEach(e-> System.out.print(e+" "));

    }
}
