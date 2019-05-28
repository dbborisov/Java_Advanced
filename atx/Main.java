package atx;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("C:\\atx_logs\\atx_error.log");

        BufferedReader reader = new BufferedReader(new InputStreamReader(file));

        while (reader.read() != -1) {

            System.out.println(reader.readLine());
        }


        file.close();
        reader.close();


    }
}
