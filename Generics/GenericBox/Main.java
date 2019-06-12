package Generics.GenericBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Box box = new Box();

        String in = "";
        while (!"END".equals(in = scanner.nextLine())) {

            String[] commands = in.split("\\s+");

            switch (commands[0]) {
                case "Add":

                    box.add(commands[1]);
                    break;
                case "Contains":
                    System.out.println(box.contains(commands[1]));
                    break;
                case "Swap":
                    box.swap(Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
                    break;
                case "Greater":
                    System.out.println(box.countGreaterThan(commands[1]));
                    break;
                case "Max":
                    box.getMax();
                    break;
                case "Min":
                    box.getMin();
                    break;
                case "Print":
                    box.print();
                    break;
                case "Sort":
                    box.setSort(box.getList());
                    break;

//•	Add <element> - Adds the given element to the end of the list
//•	Remove <index> - Removes the element at the given index
//•	Contains <element> - Prints if the list contains the given element (true or false)
//•	Swap <index> <index> - Swaps the elements at the given indexes
//•	Greater <element> - Counts the elements that are greater than the given element and prints their count
//•	Max - Prints the maximum element in the list
//•	Min - Prints the minimum element in the list
//•	Print - Prints all elements in the list, each on a separate line
//•	END - stops the reading of commands

            }


        }

    }
}
