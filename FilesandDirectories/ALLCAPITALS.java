package FilesandDirectories;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ALLCAPITALS {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\dborisov\\IdeaProjects\\Java_Advanced\\res\\input.txt");
        File fileout = new File("C:\\Users\\dborisov\\IdeaProjects\\Java_Advanced\\res\\output.txt");
        String line = "";


        try (BufferedReader reader = new BufferedReader(new FileReader(file));
        BufferedWriter writter = new BufferedWriter(new PrintWriter(fileout))){
            while ((line =reader.readLine())!=null ){
                writter.write(line.toUpperCase());
                writter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
