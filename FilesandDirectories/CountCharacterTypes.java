package FilesandDirectories;

import java.io.*;

public class CountCharacterTypes {
    public static void main(String[] args) {


        File file = new File("C:\\Users\\dborisov\\IdeaProjects\\Java_Advanced\\res\\input.txt");
        File fileout = new File("C:\\Users\\dborisov\\IdeaProjects\\Java_Advanced\\res\\output.txt");
        String line = "";
        int vowels =0;
        int consonants =0;
        int punctuation =0;


        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedWriter writter = new BufferedWriter(new PrintWriter(fileout))){
            while ((line =reader.readLine())!=null ){
                for (int i = 0; i <line.length() ; i++) {
                    if(line.charAt(i)== 32){
                        continue;
                    }

                    if(line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o' || line.charAt(i) == 'u' ) {  //•	a, e, i, o, u
                        vowels++;
                    }else if(line.charAt(i) == '!' || line.charAt(i) == ',' || line.charAt(i) == '.' || line.charAt(i) == '?' || line.charAt(i) == 'u'){ // (!,.?)
                        punctuation++;
                    }else{ // others
                        consonants++;
                    }

                }



            }
            writter.write(String.format("Vowels: %d%nConsonants: %d%nPunctuation: %d%n",vowels,consonants,punctuation));
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
