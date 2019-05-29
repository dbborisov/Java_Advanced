package FilesandDirectories;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class MergeTwoFiles {
    public static void main(String[] args) {
        Path path1 = Paths.get("C:\\Users\\dborisov\\IdeaProjects\\Java_Advanced\\res\\inputOne.txt");
        Path path2 = Paths.get("C:\\Users\\dborisov\\IdeaProjects\\Java_Advanced\\res\\inputTwo.txt");
        Path path3 = Paths.get("C:\\Users\\dborisov\\IdeaProjects\\Java_Advanced\\res\\outOneTwo.txt");


        try(BufferedWriter writer = new BufferedWriter(new PrintWriter(path3.toString()))) {
           List<String> m = Files.readAllLines(path1);
           List<String> m2 = Files.readAllLines(path2);
            for (int i = 0; i <m.size() ; i++) {
                writer.write(m.get(i));
                writer.newLine();
            }
            for (int i = 0; i <m2.size() ; i++) {
                writer.write(m2.get(i));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
