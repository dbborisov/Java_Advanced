package ExamPreparation;

import java.util.*;

public class ClubParty {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int capacity = Integer.parseInt(scanner.nextLine());
        String[] line = scanner.nextLine().split("\\s+");

        Deque<String> halls = new ArrayDeque<>();

        List<Integer> peoples = new ArrayList<>();

        for (int i = line.length - 1; i >= 0; i--) {

            if (line[i].matches("[0-9]+")) {
                peoples.add(Integer.parseInt(line[i]));
            } else {
                halls.offer(line[i]);
            }

        }

        int sumReservations = peoples.stream().mapToInt(e -> e).sum();
        List<Integer> toPrint = new ArrayList<>();
        int temp = 0;

        String currentHall = "";
        int indexHalls = halls.size();
        for (int i = 0; i < indexHalls; i++) {
            currentHall = halls.poll();
            int sumNow = 0;
            for (int j = 0; j < peoples.size(); j++) {
                if (peoples.get(j) + sumNow < capacity) {
                    sumNow += peoples.get(j);
                    toPrint.add(peoples.get(j));
//                    peoples.remove(j);

                } else if (peoples.get(j) + sumNow > capacity) {

                    int currentReservations = peoples.get(i);
                    temp = (currentReservations + sumNow) - capacity;
                    toPrint.add(peoples.get(j));
//                    peoples.remove(j);
                }else if(sumNow + peoples.get(j) == capacity){
                    toPrint.add(peoples.get(j));
                    peoples.removeAll(toPrint);
                    toPrint.clear();
                    sumNow=0;
                }
                if(sumNow  == capacity) {
                    toPrint.add(peoples.get(j));
//                    peoples.remove(j);
                    System.out.println(currentHall + " -> " + toPrint.toString().replaceAll("\\[", "").replaceAll("\\]", ""));
                    peoples.removeAll(toPrint);
                    toPrint.clear();
                    sumNow=0;
                }
            }

        }

        System.out.println();
    }
}
