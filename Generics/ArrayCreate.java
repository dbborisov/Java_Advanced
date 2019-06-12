package Generics;

import java.util.ArrayList;
import java.util.List;

public class ArrayCreate {
    public  static  <T> T[] create(int lenght,T item){

        List<T> t = new ArrayList<>();
        for (int i = 0; i <lenght ; i++) {
            t.add(item);
        }

        return(T[]) t.toArray();
    }
}
