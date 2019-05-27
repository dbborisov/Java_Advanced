package SetAndMaps;



import java.util.*;


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
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        try {
//            String[] input = scanner.nextLine().split("");
//            Map<Character, Integer> dataCount = new TreeMap<>();
//            for (int i = 0; i < input.length; i++) {
//                if (!dataCount.containsKey(input[i].charAt(0))) {
//                    dataCount.put(input[i].charAt(0), 1);
//                } else {
//                    dataCount.put(input[i].charAt(0), dataCount.get(input[i].charAt(0)) + 1);
//                }
//            }
//            dataCount.forEach((key, value) -> {
//                System.out.println(String.format("%c: %d time/s", key, value));
//            });
//        } catch (Exception ignored) {
//
//        }
//    }

