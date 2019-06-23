package Aexam;

import java.util.*;

@SuppressWarnings("ALL")
public class Prob01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> liquids = new ArrayDeque<>();
        Deque<Integer> items = new ArrayDeque<>();
        int[] leftLine = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] rightLine = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        List<Integer> toprint = new ArrayList<>();

        int glass = 0;
        int aluminium = 0;
        int lithium = 0;
        int carbon = 0;

        for (int i = 0; i < leftLine.length; i++) {
            liquids.offer(leftLine[i]);
        }
        for (int i = 0; i < rightLine.length; i++) {
            items.push(rightLine[i]);
        }

        while (!liquids.isEmpty() && !items.isEmpty()){
                int tempLiquid = liquids.poll();
                int tempItem = items.pop();
                int sum = tempItem+tempLiquid;

            if (sum == 25) {
                glass++;
            } else if (sum == 50) {
                aluminium++;
            } else if (sum == 75) {
                lithium++;
            } else if (sum == 100) {
                carbon++;
            }else{
                items.push((tempItem+3));
            }
        }

        if(lithium>0&&glass>0&&carbon>0&&aluminium>0){
            System.out.println("Wohoo! You succeeded in building the spaceship!");

        }else{
            System.out.println("Ugh, what a pity! You didn't have enough materials to build the spaceship.");
        }
        if(liquids.isEmpty()){
            System.out.println("Liquids left: none");
        }else{
            System.out.println(String.format("Liquids left: %s",liquids.toString().replaceAll("\\[|\\]","")));
        }
        if(items.isEmpty()){
            System.out.println("Physical items left: none");
        }else{
            System.out.println(String.format("Physical items left: %s",items.toString().replaceAll("\\[|\\]","")));
        }
        System.out.println(String.format("Aluminium: %d",aluminium));
        System.out.println(String.format("Carbon fiber: %d",carbon));
        System.out.println(String.format("Glass: %d",glass));
        System.out.println(String.format("Lithium: %d",lithium));
    }
}
