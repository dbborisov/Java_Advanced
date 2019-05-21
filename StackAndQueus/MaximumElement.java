package StackAndQueus;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque nums = new ArrayDeque();
        for (int i = 0; i < n ; i++) {
            String[] in  = scanner.nextLine().split("\\s+");
            if(in[0].equals("1")){
                nums.push(Integer.parseInt(in[1]));

            }else if(in[0].equals("2")){
                if(nums.size()>0){
                    nums.pop();
                }

            }else{
                System.out.println(Collections.max(nums));

            }
        }


    }
}
