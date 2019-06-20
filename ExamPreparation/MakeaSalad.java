package ExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class MakeaSalad {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Deque<String> vegetables = new ArrayDeque<>();
        Deque<Integer> calories = new ArrayDeque<>();

        String[] line = scanner.nextLine().split(" ");
        int[] lineInts = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < line.length; i++) {
            vegetables.offer(line[i]);
        }
        for (int i = 0; i < lineInts.length ; i++) {
            calories.push(lineInts[i]);
        }
        int currantCalory = calories.pop();
        List<String> salats =new ArrayList<>();
        salats.add(currantCalory+"");

        while (!vegetables.isEmpty() && !calories.isEmpty()){

            if(currantCalory<=0){
                currantCalory = calories.pop();
                salats.add(currantCalory +"");

            }

            if (currantCalory>0){
                String currentVeg = vegetables.poll();
                switch (currentVeg){
                    case "tomato":
                        currantCalory -= 80;
                        break;
                    case "carrot":
                        currantCalory-=136;
                        break;
                    case "lettuce":
                        currantCalory-=109;
                        break;
                    case "potato":
                        currantCalory-=215;
                        break;
                }
            }

        }
//        if(currantCalory!=calories.peek()){
//            salats.add(calories.pop()+ "");
//        }

salats.stream().forEach(e-> System.out.print(e + " "));
        System.out.println();

        if(!vegetables.isEmpty()){
            vegetables.stream().forEach(e-> System.out.print(e + " "));
        }else{
            calories.stream().forEach(e-> System.out.print(e+ " "));
        }

    }

}
