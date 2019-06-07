package Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListofPredicates {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int range = Integer.parseInt(scanner.nextLine());
        List<Integer> nums  =Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        for (int i = 0; i < nums.size() ; i++) {
            for (int j = 1; j <=range ; j++) {
                if(j%nums.get(i) == 0 && nums.get(i)!= 1){
                    System.out.print(j+" ");
                }


            }

        }
    }
}
