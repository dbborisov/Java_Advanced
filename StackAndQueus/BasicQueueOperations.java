package StackAndQueus;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {



    Scanner scanner = new Scanner(System.in);

    String[] in  = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> numQueue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(e->numQueue.add(Integer.parseInt(e)));
        if(numQueue.size()-Integer.parseInt(in[1])>0) {
            for (int i = 0; i < Integer.parseInt(in[1]); i++) {
                numQueue.poll();
            }
            if (numQueue.contains(Integer.parseInt(in[2]))) {
                System.out.println("true");
            } else {
                System.out.println(Collections.min(numQueue));
            }
        }else{
            System.out.println(0);
        }

}

}
