package difining_classes.Google;

public class Children {
    //•	"<Name> children <childName> <childBirthday>"

    private  static final String DEFAULT_EMPTY_FIELD = "";
    private  String childName;
    private  String childBirthday;

    public Children() {
        this.childName = DEFAULT_EMPTY_FIELD;
        this.childBirthday = DEFAULT_EMPTY_FIELD;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getChildBirthday() {
        return childBirthday;
    }

    public void setChildBirthday(String childBirthday) {
        this.childBirthday = childBirthday;
    }
}
