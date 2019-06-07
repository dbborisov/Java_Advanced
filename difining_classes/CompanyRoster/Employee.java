package difining_classes.CompanyRoster;

import java.util.List;

public class Employee {

    private static final String EMAIL_DEF_VALUE = "n/a";
    private static final int AGE_DEF_VALUE = -1;

    private String name;
    private Double salary;
    private String email;
    private int age;


    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
        this.email = Employee.EMAIL_DEF_VALUE;
        this.age = Employee.AGE_DEF_VALUE;
    }

    public Employee(String name, Double salary, String email) {
        this(name,salary);
        this.email = email;

    }
    public Employee(String name, Double salary, int age) {
        this(name,salary);
        this.age = age;

    }
    public Employee(String name, Double salary,String email,int age){

        this(name,salary,email);
        this.age = age;
    }

    public double getSalary(){
        return this.salary;
    }
    public String getInfo(){
        return String.format("%s %.2f %s %d",this.name,this.salary,this.email,this.age);
    }

    public String getName() {
        return name;
    }
}
