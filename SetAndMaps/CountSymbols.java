package SetAndMaps;



import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] in = scanner.nextLine().split("");

        Map<String,Integer> word = new LinkedHashMap<>();

        for (int i = 0; i <in.length ; i++) {

            if(!word.containsKey(in[i])){
                word.put(in[i],1);
            }else{
                word.put(in[i],word.get(in[i])+1);
            }

        }
        word.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(e->{
            System.out.println(String.format("%s: %d time/s",e.getKey(),e.getValue()));
        });
    }
}
