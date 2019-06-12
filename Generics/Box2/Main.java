package Generics.Box2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Box box = new Box();
        int lines = Integer.parseInt(scanner.nextLine());
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < lines; i++) {
           list.add(Double.parseDouble(scanner.nextLine()));

        }
        System.out.println(box.comparerInList(list,Double.parseDouble(scanner.nextLine())));

    }
}
