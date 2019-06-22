package ExamPreparation;

import java.util.*;

public class Socks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);

        Deque<Integer> left = new ArrayDeque<>();
        Deque<Integer> right = new ArrayDeque<>();

        int[] leftLine = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] rightLine = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        List<Integer> toprint = new ArrayList<>();

        for (int i = 0; i < leftLine.length; i++) {
            left.push(leftLine[i]);
        }
        for (int i = 0; i < rightLine.length; i++) {
            right.offer(rightLine[i]);
        }
        while (!left.isEmpty()&&!right.isEmpty()){

            int leftPop = left.pop();
            int rightPoll = right.poll();

            if(leftPop == rightPoll){
                left.addFirst(rightPoll + 1);
            }else if(leftPop > rightPoll){
                toprint.add(rightPoll+leftPop);
            }else{
                right.addFirst(rightPoll);
            }

        }



        System.out.println(toprint.stream().mapToInt(Integer::byteValue).max().getAsInt());
        toprint.forEach(e-> System.out.print(e+" "));

    }
}
