package SetAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Double> resurse = new LinkedHashMap<>();

        String in ="";
        while (!"stop".equals(in=scanner.nextLine())){

            if(!resurse.containsKey(in)){
                resurse.put(in,Double.parseDouble(scanner.nextLine()));
            }else{
                resurse.put(in,resurse.get(in)+Double.parseDouble(scanner.nextLine()));
            }

        }

        resurse.forEach((key, value) -> System.out.println(String.format("%s -> %.0f", key, value)));

    }
}
