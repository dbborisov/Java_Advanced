package difining_classes.RawData;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private List<Tire> tires;
    private Engine engine;
    private Cargo cargo;

    public Car(String model, Engine engine, Cargo cargo, List<Tire> tires) {
        this.model = model;
        this.tires = tires;
        this.engine = engine;
        this.cargo = cargo;
    }

    public String getModel() {
        return model;
    }

    public List<Tire> getTires() {
        return tires;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

}
