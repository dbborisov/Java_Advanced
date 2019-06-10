package difining_classes.CarSalesman;

public class Engine {
    //An Engine has model, power, displacement and efficiency.

    private static final int DEFAULT_DISPLACEMENT = -1;
    private static final String DEFAULT_EFFICIENCY = "n/a";

    private String model;
    private String power;
    private int displacement;
    private String efficiency;

    public Engine(){
        this.displacement =DEFAULT_DISPLACEMENT;
        this.efficiency  = DEFAULT_EFFICIENCY;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }
}
