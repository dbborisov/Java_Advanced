package SetAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String,String> nameMail = new LinkedHashMap<>();

        String in = "";


        while (!"stop".equals(in=scanner.nextLine())){

            String mail = scanner.nextLine().toLowerCase();

            if(mail.contains("us")||mail.contains("uk")||mail.contains("com")){
                continue;
            }else{
                nameMail.put(in,mail);
            }
        }
        nameMail.forEach((key, value) -> System.out.println(String.format("%s -> %s", key, value)));
    }
}
