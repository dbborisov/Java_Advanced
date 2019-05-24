package SetAndMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanne = new Scanner(System.in);



        Map<String,String> phoneBook = new HashMap<>();
        String in = "";
        while (!"search".equals(in = scanne.nextLine())){
            String[] nameAndNum = in.split("-");
            if(!phoneBook.containsKey(nameAndNum[0])){
                phoneBook.put(nameAndNum[0],nameAndNum[1]);
            }else {
                phoneBook.put(nameAndNum[0],nameAndNum[1]);
            }
        }
        in="";
        while (!"stop".equalsIgnoreCase(in=scanne.nextLine())){
            if(phoneBook.containsKey(in)){
                System.out.println(String.format("%s -> %s",in,phoneBook.get(in)));
            }else{
                System.out.println(String.format("Contact %s does not exist.",in));
            }
        }

    }
}
