package Functional_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ConsumerPrint {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            Arrays.stream(reader.readLine().split("\\s+")).forEach(x-> System.out.println(x));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
