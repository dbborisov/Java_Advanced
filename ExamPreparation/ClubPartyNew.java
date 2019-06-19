package ExamPreparation;

import java.util.*;

public class ClubPartyNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());

        String[] hallsAndPerson = scanner.nextLine().split("\\s+");
        List<Integer> reservations = new ArrayList<>();
        Deque<String> halls = new ArrayDeque<>();
        int capacityNow = 0;
        for (int i = hallsAndPerson.length -1; i >=0 ; i--) {



            if(hallsAndPerson[i].matches("[0-9]+")){
                if(halls.isEmpty()){
                    continue;
                }
                int reservationNow = Integer.parseInt(hallsAndPerson[i]);
                if(capacityNow+reservationNow <= capacity){
                    capacityNow+=reservationNow;
                    reservations.add(reservationNow);
                }else if (capacityNow+reservationNow > capacity){
                    String hall = halls.pop();
                    System.out.println(String.format("%s -> %s",hall,reservations.toString().replaceAll("\\]","").replace("[","")));
                    reservations.clear();
                    capacityNow = 0;
                    i++;

                }
//                if(!halls.isEmpty() && capacityNow==0 && reservationNow <= capacity){
//
//                        capacityNow += reservationNow;
//                        reservations.add(reservationNow);
//
//                }
            }else{
                halls.add(hallsAndPerson[i]);
            }


        }

    }
}
