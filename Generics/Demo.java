package Generics;

import java.util.List;

public class Demo <T>{

    private List<T> element;

    public Demo(List<T> element) {
        this.element = element;
    }
}
