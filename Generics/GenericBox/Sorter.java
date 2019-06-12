package Generics.GenericBox;

import java.util.List;
import java.util.stream.Collectors;

public class Sorter<T> {

    public List<T> sort(List<T> list){


        return list.stream().sorted().collect(Collectors.toList());
    }
}
