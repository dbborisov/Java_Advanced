package difining_classes.RawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
//"<Model> <EngineSpeed> <EnginePower> <CargoWeight> <CargoType> <Tire1Pressure> <Tire1Age> <Tire2Pressure> <Tire2Age> <Tire3Pressure> <Tire3Age>

      List<Car> cars = new ArrayList<>();
        for (int i = 0; i < lines; i++) {

            String[] carInput = scanner.nextLine().split("\\s+");
            String model = carInput[0];
            int engineSpeed = Integer.parseInt(carInput[1]);
            int enginePower = Integer.parseInt(carInput[2]);
            int cargoWeight = Integer.parseInt(carInput[3]);
            String cargoType = carInput[4];
            List<Tire> tires = new ArrayList<>();
            for (int j = 5; j <carInput.length ; j+=2) {
                Tire tire = new Tire();

                double tirePresure = Double.parseDouble(carInput[j]);
                int tireAge = Integer.parseInt(carInput[j+1]);
                tire.setTirePressure(tirePresure);
                tire.setTireAge(tireAge);
                tires.add(tire);

            }
            Engine engine = new Engine();
            engine.setSpeed(engineSpeed);
            engine.setPower(enginePower);
            Cargo cargo = new Cargo();
            cargo.setWeight(cargoWeight);
            cargo.setCargoType(cargoType);
            Car oneCar = new Car(model,engine,cargo,tires);
            cars.add(oneCar);
        }

        String input = scanner.nextLine();

        cars.stream().forEach(car ->{
            if(input.equals("fragile")){
            List<Tire> tireList = car.getTires();
                for (int i = 0; i <tireList.size() ; i++) {
                    if(tireList.get(i).getTirePressure()< 1){
                        System.out.println(car.getModel());
                        break;
                    }
                }
            }else if (input.equals("flamable") && car.getEngine().getPower() > 250){

                System.out.println(car.getModel());
            }
        });

    }
}
