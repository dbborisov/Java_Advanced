package SetAndMaps;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<String> users = new LinkedHashSet<>();
        int round = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < round; i++) {

            users.add(scanner.nextLine());

        }
        users.forEach(System.out::println);
    }
}
