package difining_classes.Google;

public class Parents {
    //•	"<Name> parents <parentName> <parentBirthday>"
    private  static final String DEFAULT_EMPTY_FIELD = "";
    private String parentName;
    private String parentBirthday;

    public Parents() {
        this.parentName = DEFAULT_EMPTY_FIELD;
        this.parentBirthday = DEFAULT_EMPTY_FIELD;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentBirthday() {
        return parentBirthday;
    }

    public void setParentBirthday(String parentBirthday) {
        this.parentBirthday = parentBirthday;
    }
}
