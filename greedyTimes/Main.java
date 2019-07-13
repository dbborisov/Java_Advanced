//
//package greedyTimes;
//
//import java.util.Collection;
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class box.Main {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        long capacity = Long.parseLong(scanner.nextLine());
//        String[] items = scanner.nextLine().split("\\s+");
//
//        Bag torba = new Bag(0,0,0);
//
////        long gold = 0;
////        long gem = 0;
////        long money = 0;
//
//        for (int i = 0; i < items.length; i += 2) {
//            String name = items[i];
//            long count = Long.parseLong(items[i + 1]);
//
//            String currentItem = "";
//
//            if (name.length() == 3) {
//                currentItem = "Cash";
//            } else if (name.toLowerCase().endsWith("gem")) {
//                currentItem = "Gem";
//            } else if (name.toLowerCase().equals("gold")) {
//                currentItem = "Gold";
//            }
//
//            if (currentItem.equals("")) {
//                continue;
//            } else if (capacity < torba.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + count) {
//                continue;
//            }
//
//            switch (currentItem) {
//                case "Gem":
//                    if (!torba.containsKey(currentItem)) {
//                        if (torba.containsKey("Gold")) {
//                            if (count > torba.get("Gold").values().stream().mapToLong(e -> e).sum()) {
//                                continue;
//                            }
//                        } else {
//                            continue;
//                        }
//                    } else if (torba.get(currentItem).values().stream().mapToLong(e -> e).sum() + count > torba.get("Gold").values().stream().mapToLong(e -> e).sum()) {
//                        continue;
//                    }
//                    break;
//                case "Cash":
//                    if (!torba.containsKey(currentItem)) {
//                        if (torba.containsKey("Gem")) {
//                            if (count > torba.get("Gold").values().stream().mapToLong(e -> e).sum()) {
//                                continue;
//                            }
//                        } else {
//                            continue;
//                        }
//                    } else if (torba.get(currentItem).values().stream().mapToLong(e -> e).sum() + count > torba.get("Gem").values().stream().mapToLong(e -> e).sum()) {
//                        continue;
//                    }
//                    break;
//            }
//
//            if (!torba.containsKey(currentItem)) {
//                torba.put((currentItem), new LinkedHashMap<String, Long>());
//            }
//
//            if (!torba.get(currentItem).containsKey(name)) {
//                torba.get(currentItem).put(name, 0L);
//            }
//
//
//            torba.get(currentItem).put(name, torba.get(currentItem).get(name) + count);
//            if (currentItem.equals("Gold")) {
//                gold += count;
//            } else if (currentItem.equals("Gem")) {
//                gem += count;
//            } else if (currentItem.equals("Cash")) {
//                money += count;
//            }
//        }
//
//        for (Map.Entry<String, LinkedHashMap<String, Long>> x : torba.entrySet()) {
//            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();
//
//            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));
//
//            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));
//
//        }
//    }
//}