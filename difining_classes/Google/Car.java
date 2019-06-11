package difining_classes.Google;

public class Car {
    //•	"<Name> car <carModel> <carSpeed>"

    private  static final String DEFAULT_EMPTY_FIELD = "";
    private String carModel;
    private String carSpeed;

    public Car() {
        this.carModel = DEFAULT_EMPTY_FIELD;
        this.carSpeed = DEFAULT_EMPTY_FIELD;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(String carSpeed) {
        this.carSpeed = carSpeed;
    }
}
