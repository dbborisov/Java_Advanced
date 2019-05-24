package SetAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class SetsofElements {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String in[] = scanner.nextLine().split("\\s+");
        int a = Integer.parseInt(in[0]);
        int b = Integer.parseInt(in[1]);
        LinkedHashSet<String> first = new LinkedHashSet<>();
        LinkedHashSet<String> second = new LinkedHashSet<>();

        for (int i = 0; i < a; i++) {
            String val = scanner.nextLine();
            first.add(val) ;
        }
        for (int i = 0; i < b ; i++) {
            String val = scanner.nextLine();
            second.add(val) ;
        }

        boolean isFirstBiger = first.size() > second.size();

        if(isFirstBiger){
            for (int i = 0; i <first.size() ; i++) {

                if(second.contains(first.toArray()[i])){
                    System.out.print(first.toArray()[i]+ " ");
                }
            }
        }else{
            for (int i = 0; i <second.size() ; i++) {

                if(first.contains(second.toArray()[i])){
                    System.out.print(second.toArray()[i]+ " ");
                }
            }
        }

    }
}
