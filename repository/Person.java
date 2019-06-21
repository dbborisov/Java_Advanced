package repository;

import java.util.LinkedHashMap;
import java.util.Map;

public class Person {
    private String name;
    private int age;
    private String birthDate;

    public Person(String name, int age, String birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("Name: %s%n,",this.name+"Age: %d%n",this.age+"Birthday: %s%n",this.birthDate);
    }

}
