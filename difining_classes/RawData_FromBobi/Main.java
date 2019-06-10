package difining_classes.RawData_FromBobi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        List<Car> map = new ArrayList<>();
        for (int i = 0; i < lines; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            List<Tire> tires = new ArrayList<>();
            for (int j = 5; j < tokens.length; j += 2) {
                Tire tire = new Tire();
                double tirePressure = Double.parseDouble(tokens[j]);
                int tireAge = Integer.parseInt(tokens[j + 1]);
                tire.setTireAge(tireAge);
                tire.setTirePressure(tirePressure);
                tires.add(tire);
            }
            Engine engine = new Engine();
            engine.setEnginePower(enginePower);
            engine.setEngineSpeed(engineSpeed);
            Cargo cargo = new Cargo();
            cargo.setCardoType(cargoType);
            cargo.setCardoWeight(cargoWeight);
            Car car = new Car(tires, engine, cargo, model);
            map.add(car);
        }
        String input = scanner.nextLine();
        map.forEach(pr -> {
            String cargoType = pr.getCargo().getCardoType();
            if (input.equals("flamable")) {
                if (pr.getEngine().getEnginePower() > 250 && cargoType.equals("flamable")) {
                    System.out.println(pr.getModel());
                }
            } else if (input.equals("fragile")) {
                if (cargoType.equals("fragile")) {
                    List<Tire> list = pr.getTire();
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getTirePressure() < 1) {
                            System.out.println(pr.getModel());
                            break;
                        }
                    }
                }
            }
        });
    }
}
