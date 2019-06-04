package Functional_Programming;

        import java.util.Arrays;

        import java.util.Scanner;
        import java.util.function.Function;

public class Custom_minFunction {
    public static void main(String[] args) {

        Function<int[],Integer> small = arr ->{

            int minimal = Arrays.stream(arr).min().getAsInt();
            return minimal;
        };
        System.out.println(small.apply(Arrays.stream(new Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray()));
    }
}
