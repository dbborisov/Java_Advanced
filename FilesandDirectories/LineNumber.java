package FilesandDirectories;

import java.io.*;

public class LineNumber {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\dborisov\\IdeaProjects\\Java_Advanced\\res\\inputLineNumbers.txt");
        File fileout = new File("C:\\Users\\dborisov\\IdeaProjects\\Java_Advanced\\res\\inputLineNumbersOut.txt");

        try(BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new PrintWriter(fileout))){

            String line = "";
            int count = 1;

            while ( (line = reader.readLine()) != null){

                writer.write(count +". " + line);
                writer.newLine();

                count++;

            }


        }catch (IOException ex ){

        }

    }


}
