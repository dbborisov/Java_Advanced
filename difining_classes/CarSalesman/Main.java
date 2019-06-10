package difining_classes.CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        List<Engine> engines = new ArrayList<>();
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < num ; i++) {
        String[] engenOptions = scanner.nextLine().split("\\s+"); //"<Model> <Power> <Displacement> <Efficiency>"
            Engine engine = new Engine();
            engine.setModel(engenOptions[0]);
            engine.setPower(engenOptions[1]);
        switch (engenOptions.length){
            case 3:
                if(engenOptions[2].matches("[0-9]+")){
                    engine.setDisplacement(Integer.parseInt(engenOptions[2]));
                }else {
                    engine.setEfficiency(engenOptions[2]);
                }
                break;
            case 4:
                engine.setDisplacement(Integer.parseInt(engenOptions[2]));
                engine.setEfficiency(engenOptions[3]);
                break;
        }
        engines.add(engine);
        }

        //"<Model> <Engine> <Weight> <Color>", where the engine in the format will be the model of an existing Engine.

        num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num ; i++) {
            String[] carOptions = scanner.nextLine().split("\\s+");
            Car car ;
            int indexOfEngen = -1;
            for (int il = 0; il < engines.size(); il++) {

               if( engines.get(il).getModel().equals(carOptions[1])){
                   indexOfEngen = il;
               }

            }
            if(carOptions.length==4){

                car = new Car(carOptions[0],carOptions[1],Integer.parseInt(carOptions[2]),carOptions[3],engines.get(indexOfEngen));

            }else if (carOptions.length==3){
                if(carOptions[2].matches("[0-9]+")) {
                    car = new Car(carOptions[0], carOptions[1], Integer.parseInt(carOptions[2]), engines.get(indexOfEngen));
                }else{
                    car = new Car(carOptions[0], carOptions[1], carOptions[2], engines.get(indexOfEngen));
                }
            }else{

                    car = new Car(carOptions[0], carOptions[1], engines.get(indexOfEngen));

            }
            cars.add(car);

        }
        cars.forEach(e-> Car.toString(e));



    }
}
