package StackAndQueus;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] in  = scanner.nextLine().split("\\s+");

        int n = Integer.parseInt(in[0]);
        int s = Integer.parseInt(in[1]);
        int x = Integer.parseInt(in[2]);

        ArrayDeque<Integer> nums = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(e->nums.push(Integer.parseInt(e)));
        if(nums.size()>=n && nums.size()-s > 0) {
            for (int i = 0; i < s; i++) {

                nums.pop();
            }

            if (nums.contains(x)) {
                System.out.println("true");
            } else {
                System.out.println(nums.stream().min(Integer::compareTo).get());
            }

        }else{
            System.out.println("0");
        }

    }
}
