package difining_classes.PokemonTrainer;


import java.util.*;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String in = "";

        Map<String, Trainer> trainers = new LinkedHashMap<>();

        while (!"Tournament".equals(in = scanner.nextLine())) {
            String[] data = in.split("\\s+");
            String trainarName = data[0];

            String pokemonName = data[1];
            String pokemonElement = data[2];
            int pokemonHealth = Integer.parseInt(data[3]);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            if (!trainers.containsKey(trainarName)) {
                trainers.put(trainarName, new Trainer(trainarName));
                trainers.get(trainarName).setPokemonList(pokemon);
            } else {
                trainers.get(trainarName).setPokemonList(pokemon);
            }

        }
        while (!"End".contains(in = scanner.nextLine())) {

            switch (in) {
                case "Fire":
                    trainers.entrySet().stream().forEach(e -> {
                        int index = e.getValue().getPokemonList().size();
                        boolean isHaveElement = false;
                        for (int i = 0; i < index; i++) {
                            if (e.getValue().getPokemonList().get(i).getElement().equals("Fire")) {
                                isHaveElement = true;
                            }
                        }
                        if (isHaveElement) {
                            e.getValue().setBadges(e.getValue().getBadges() + 1);
                        } else {

                            for (int i = 0; i < index ; i++) {
                                e.getValue().getPokemonList().get(i).setHealth(e.getValue().getPokemonList().get(i).getHealth()-10);
                            }
                        }

                    });
                    break;
                case "Water":
                    trainers.entrySet().stream().forEach(e -> {
                        int index = e.getValue().getPokemonList().size();
                        boolean isHaveElement = false;
                        for (int i = 0; i < index; i++) {
                            if (e.getValue().getPokemonList().get(i).getElement().equals("Water")) {
                                isHaveElement = true;
                            }
                        }
                        if (isHaveElement) {
                            e.getValue().setBadges(e.getValue().getBadges() + 1);
                        } else {

                            for (int i = 0; i < index ; i++) {
                                e.getValue().getPokemonList().get(i).setHealth(e.getValue().getPokemonList().get(i).getHealth()-10);
                            }
                        }

                    });
                    break;
                case "Electricity":
                    trainers.entrySet().stream().forEach(e -> {
                        int index = e.getValue().getPokemonList().size();
                        boolean isHaveElement = false;
                        for (int i = 0; i < index; i++) {
                            if (e.getValue().getPokemonList().get(i).getElement().equals("Electricity")) {
                                isHaveElement = true;
                            }
                        }
                        if (isHaveElement) {
                            e.getValue().setBadges(e.getValue().getBadges() + 1);
                        } else {

                            for (int i = 0; i < index ; i++) {
                                e.getValue().getPokemonList().get(i).setHealth(e.getValue().getPokemonList().get(i).getHealth()-10);
                            }
                        }

                    });
                    break;
            }

        }
        trainers.values().stream().forEach(e->{
            int size = e.getPokemonList().size();
            for (int i = size -1; i >= 0 ; i--) {

                if(e.getPokemonList().get(i).getHealth()<=0){
                    e.getPokemonList().remove(i);
                }
            }
        });



        Stream<Map.Entry<String, Trainer>> sorted = trainers.entrySet().stream().sorted((e2, e1) -> {
            int sum = Integer.compare(e1.getValue().getBadges(), e2.getValue().getBadges());
            if(sum==0){

            }
            return sum;
        });
        sorted.forEach(e -> {

            System.out.println("" + e.getKey() + " " + e.getValue().getBadges() + " " + e.getValue().getPokemonList().size());

        });


    }
}

