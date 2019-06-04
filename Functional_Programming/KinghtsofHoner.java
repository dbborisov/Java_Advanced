package Functional_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class KinghtsofHoner {
    public static void main(String[] args) {


        Arrays.stream(new Scanner(System.in).nextLine().split("\\s+")).forEach(str -> System.out.println("Sir " + str));
    }
}
