package ExamPreparation;

import java.util.*;

public class NewMakeASalad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<String> queueVeg = new ArrayDeque<>();
        Deque<Integer> stackCalori = new ArrayDeque<>();
        List<String> salad = new ArrayList<>();

        String[] veg = scanner.nextLine().split(" ");
        int[] cal = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < veg.length; i++) {
            queueVeg.offer(veg[i]);
        }
        for (int i = 0; i < cal.length; i++) {
            stackCalori.push(cal[i]);
        }

        while (!stackCalori.isEmpty() && !queueVeg.isEmpty()) {


            int cPop = stackCalori.pop();
            salad.add(cPop + "");

            while (cPop > 0 && !queueVeg.isEmpty()) {
                String vPop = queueVeg.poll();
                switch (vPop) {
                    case "tomato": //80
                        cPop -= 80;
                        break;
                    case "potato"://215
                        cPop -= 215;
                        break;
                    case "carrot"://136
                        cPop -= 136;
                        break;
                    case "lettuce"://109
                        cPop -= 109;
                        break;
                }


            }
        }
        salad.forEach(e-> System.out.print(e+" "));
        System.out.println();
        if(!queueVeg.isEmpty()){
            queueVeg.forEach(e-> System.out.print(e+" "));
        }else if(!stackCalori.isEmpty()){
            stackCalori.forEach(e-> System.out.print(e+" "));
        }

    }
}
