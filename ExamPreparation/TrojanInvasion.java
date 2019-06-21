package ExamPreparation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class TrojanInvasion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int attacks = Integer.parseInt(scanner.nextLine());
        Deque<Integer> defense = new ArrayDeque<>();
        Deque<Integer> trojans = new ArrayDeque<>();

        int[] inDefense = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < inDefense.length; i++) {
            defense.offer(inDefense[i]);
        }



        for (int i = 1; i <= attacks &&  !defense.isEmpty(); i++) {

            int[] trojansAttack = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            for (int j = 0; j < trojansAttack.length; j++) {
                trojans.push(trojansAttack[j]);

            }

            if ( i % 3 == 0 ) {
                int newDefense = Integer.parseInt(scanner.nextLine());
                defense.offer(newDefense);
            }

            while (!defense.isEmpty() && !trojans.isEmpty()){

                int deff = defense.poll();
                int att = trojans.pop();
                int left = deff - att;

                if(left>0){
                    defense.addFirst(left);
                }else if(left<0){
                    trojans.push(Math.abs(left));
                }

            }

        }

        if(!defense.isEmpty()){
//            isDefenseWin = false;
            System.out.println("The Spartans successfully repulsed the Trojan attack.");
            System.out.println(String.format("Plates left: %s",defense.toString().replaceAll("\\]","").replaceAll("\\[","")));
        }else{
            System.out.println("The Trojans successfully destroyed the Spartan defense.");
            System.out.println(String.format("Warriors left: %s", trojans.toString().replaceAll("]", "").replaceAll("\\[", "")));

        }
    }
}
