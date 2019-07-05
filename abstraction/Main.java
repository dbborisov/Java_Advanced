package abstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        CardRank[] suits = CardRank.values();
//
//        System.out.println("Card Ranks:");
//        for (int i = 0; i <suits.length; i++) {
//
//            System.out.println(String.format("Ordinal value: %d; Name value: %s",suits[i].ordinal(),suits[i]));
//        }

        Scanner scanner = new Scanner(System.in);

        String cardPower = scanner.nextLine();
        String cardType = scanner.nextLine();


        int sum = CardRank.valueOf(cardPower).getValue() + CardSuit.valueOf(cardType).getValue();

        System.out.println(String.format("Card name: %s of %s; Card power: %d",cardPower,cardType,sum));

    }
}
