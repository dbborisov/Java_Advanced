package Generics.GenericBox;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Box<T extends Comparable<T>> {

    private List<T> list;
    private Sorter<T> sort;

    public Box(){
        this.list = new ArrayList<>();
    }


    public void add(String in){
        this.list.add((T)in);
    }
    public void remove(int index){
        this.list.remove(index);
    }

    public boolean contains(String in){
        boolean isContaind = false;
        if(this.list.contains((T) in)){
            isContaind=true;
        }
        return isContaind;
    }

    public void swap(int a, int b){
        T storA = this.list.get(a);
        T storB = this.list.get(b);
        this.list.set(a,storB);
        this.list.set(b,storA);
    }

    public int countGreaterThan(String test){
        int count = 0;
        int sum = 0;

        for (int i = 0; i < this.list.size(); i++) {
            sum = this.list.get(i).compareTo((T)test);
            if(sum > 0){
                count++;
            }
        }


        return count;
    }

    public void getMax(){
        T max = this.list.stream().max((e1,e2) -> e1.compareTo(e2)).get();
        System.out.println(max);
    }

    public void getMin(){
        T min = this.list.stream().min((e1,e2) -> e1.compareTo(e2)).get();
        System.out.println(min);
    }

    public void print(){
        this.list.forEach(System.out::println);
    }

    public List<T> getList() {
        return list;
    }

    public void setSort(List<T> list){
        this.sort = new Sorter<>();
      this.list = sort.sort(list);
    }
    //•	void add(T element)
    //•	T remove(int index)
    //•	boolean contains(T element)
    //•	void swap(int index, int index)
    //•	int countGreaterThan(T element)
    //•	T getMax()
    //•	T getMin()

}
