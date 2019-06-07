package difining_classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        List<Person>  personList = new ArrayList<>();

        int num = Integer.parseInt(reader.readLine());

        for (int i = 0; i < num ; i++) {
            Person person = new Person();
            String[] in = reader.readLine().split("\\s+");
            person.age =Integer.parseInt(in[1]);
            person.name = in[0];
            personList.add(person);


        }

        personList.stream().filter(e -> e.age > 30).sorted(Comparator.comparing(e -> e.name) /* same as (e1,e2)->e1.name.compareTo(e2.name)*/)
                .forEach(e-> System.out.println(String.format("%s - %d",e.name,e.age)));


    }
}
