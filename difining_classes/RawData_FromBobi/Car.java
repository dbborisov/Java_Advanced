package difining_classes.RawData_FromBobi;

import java.util.List;

public class Car {

    private List<Tire> tire;
    private Engine engine;
    private Cargo cargo;
    private String model;

    public Car(List<Tire> tire, Engine engine, Cargo cargo, String model) {
        this.tire = tire;
        this.engine = engine;
        this.cargo = cargo;
        this.model = model;
    }

    public List<Tire> getTire() {
        return tire;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public String getModel() {
        return model;
    }
}
