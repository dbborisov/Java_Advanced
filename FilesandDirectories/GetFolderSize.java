package FilesandDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GetFolderSize {
    public static void main(String[] args) {

        try {
            System.out.println(String.format("Folder size: %s", Files.getFileStore(Paths.get("C:\\Users\\dborisov\\IdeaProjects\\Java_Advanced\\res\\Exercises Resources"))));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
