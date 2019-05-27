package SetAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int cardA = 14;
        int cardK = 13;
        int cardQ = 12;
        int cardJ = 11;
        int powerS = 4;
        int powerH = 3;
        int powerD = 2;
        int powerC = 1;
        Map<String,Integer> playerResult = new LinkedHashMap<>();

        String in = "";
        while (!"JOKER".contains(in = scanner.nextLine())) {
            String[] cmd = in.split(": ");

            String name = cmd[0];
            LinkedHashSet<String> unic = new LinkedHashSet<>();
                    Arrays.stream(cmd[1].split(",\\s+")).forEach(e-> unic.add(e));
            String[] numCards = unic.toString().replace("]","").replace("[","").split(",\\s+");

            int sum = 0;

            for (int i = 0; i < numCards.length; i++) {


                if (numCards[i].contains("A") || numCards[i].contains("K") || numCards[i].contains("Q") || numCards[i].contains("J")) {
                    String[] findSum = numCards[i].split("");

                    switch (findSum[0]) {
                        case "A":
                            sum = cardA;
                            break;
                        case "K":
                            sum = cardK;
                            break;
                        case "Q":
                            sum = cardQ;
                            break;
                        case "J":
                            sum = cardJ;
                            break;
                    }
                    switch (findSum[1]) {
                        case "S":
                            sum *= powerS;
                            break;
                        case "H":
                            sum *= powerH;
                            break;
                        case "D":
                            sum *= powerD;
                            break;
                        case "C":
                            sum *= powerC;
                            break;
                    }


                } else {
                    sum = numCards[i].length()==2 ?  Integer.parseInt(numCards[i].substring(0,1)) : Integer.parseInt(numCards[i].substring(0,2));

                    switch (numCards[i].substring(numCards[i].length()-1)) {
                        case "S":
                            sum *= powerS;
                            break;
                        case "H":
                            sum *= powerH;
                            break;
                        case "D":
                            sum *= powerD;
                            break;
                        case "C":
                            sum *= powerC;
                            break;
                    }

                }
                if(!playerResult.containsKey(name)){
                    playerResult.put(name,sum);

                }else{
                    playerResult.put(name,playerResult.get(name)+sum);
                }
                sum=0;


            }

        }
        playerResult.forEach((k,v)-> System.out.println(String.format("%s: %d",k,v)));
    }
}
