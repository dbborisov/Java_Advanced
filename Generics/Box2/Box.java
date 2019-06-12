package Generics.Box2;


import java.util.List;

public class Box <T extends Comparable<T>> {


    public  T toString(T str){

        return (T) (str.getClass() + ": " + str).substring(6);
    }

    public List<T> swaper(List<T> list,String in){
        int a = Integer.parseInt(in.split("\\s+")[0]);
        int b = Integer.parseInt(in.split("\\s+")[1]);
        T swapA = list.get(a);
        T swapB = list.get(b);
        list.set(a,swapB);
        list.set(b,swapA);
        return list;

    }
    public Integer comparerInList(List<T> list,Double comparer){
        int sum = 0;
        int count = 0;

        for (int i = 0; i < list.size() ; i++) {
            sum = list.get(i).compareTo((T) comparer);
            if( sum > 0 ){
                count++;
            }

        }

        return count;
    }


}
