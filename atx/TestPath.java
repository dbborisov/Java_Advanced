package atx;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TestPath {

    public static void main(String[] args) throws IOException {
        if(!Files.exists(Paths.get("c:\\atx_log\\in.log"))){
            Path path = Paths.get("c:\\atx_log\\");
            Files.createFile(path);
        }
        Path inPath = Paths.get("C:\\atx_logs\\atx_error.log");

        Path outPath = Paths.get("C:\\atx_logs\\output.txt");


        List<String> lines = Files.readAllLines(inPath);

        Files.write(outPath, lines);
        Files.exists(inPath);
    }
}
