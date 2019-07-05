package trafficlight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

       BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));;

        String[] input = scanner.readLine().split(" ");

        int  n  = Integer.parseInt(scanner.readLine());
        TrafficLight[] lights = new TrafficLight[input.length];

        for (int i = 0; i <input.length; i++) {
            lights[i] =TrafficLight.valueOf(input[i]);
        }
        TrafficLight[] index = TrafficLight.values();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <lights.length; j++) {

                if(lights[j].ordinal() == 2){
                    lights[j] = TrafficLight.RED;
                }else{
                    lights[j] = index[lights[j].ordinal()+1];
                }


                System.out.print(lights[j]+ " ");
            }
            System.out.println();
        }

    }
}
