package FilesandDirectories;

import java.io.*;


public class SumLines {

    public static void main(String[] args) {


        String path = "C:\\Users\\dborisov\\IdeaProjects\\Java_Advanced";

        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\dborisov\\IdeaProjects\\Java_Advanced\\res\\input.txt"))) {

//            reader = new BufferedReader(new FileReader(String.valueOf(path + "\\src\\input.txt")));
            String line ="";
            int sum = 0;
            while ((line=reader.readLine()) != null){

                for (int i = 0; i <line.length() ; i++) {

                    sum+= line.charAt(i);
                }
                System.out.println(sum);
                sum = 0 ;

            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
