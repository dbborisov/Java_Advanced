package difining_classes.CarSalesman;

import java.util.List;

public class Car {

    //A Car has a model, engine, weight and color

    private  static final int DEFAULT_WEIGHT = -1;
    private  static final String DEFAULT_COLOR = "n/a";


    private String model;
    private String engine;
    private int weight;
    private String color;
    private Engine engineIn;

    public Car(String model, String engine,Engine engineIn) {
        this.model = model;
        this.engine = engine;
        this.engineIn=engineIn;
        this.weight = DEFAULT_WEIGHT;
        this.color = DEFAULT_COLOR;
    }

    public Car (String model,String engine,int weight, Engine engineIn){
        this(model,engine,engineIn);
        this.weight = weight;

    }
    public Car (String model,String engine,String color, Engine engineIn){
        this(model,engine,engineIn);
        this.color = color;

    }

    public Car(String model, String engine, int weight, String color, Engine engineIn) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
        this.engineIn = engineIn;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engin) {
        this.engine = engin;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public static void toString(Car car){


            String carModel = car.getModel();
            String engenModel = car.getEngine();
            String engenPower = car.engineIn.getPower();
            String engenDisplac ="";
            if(car.engineIn.getDisplacement() == -1){
                engenDisplac ="n/a";
            }else{
                engenDisplac =car.engineIn.getDisplacement()+"";
            }
            String engineEfficiency = car.engineIn.getEfficiency();
            String carWeight = "";
            if(car.weight==-1){
                carWeight ="n/a";
            }else{
                carWeight = car.weight +"";
            }
            String carColor = car.color;




            System.out.println(String.format("%s:%n" +
                            "%s:%n" +
                            "Power: %s%n" +
                            "Displacement: %s%n" +
                            "Efficiency: %s%n" +
                            "Weight: %s%n" +
                            "Color: %s",
                    carModel,
                    engenModel,
                    engenPower,
                    engenDisplac,
                    engineEfficiency,
                    carWeight,
                    carColor));


//FordFocus:
        //V4-33:
        //Power: 140
        //Displacement: 28
        //Efficiency: B
        //Weight: 1300
        //Color: Silver
    }
}
