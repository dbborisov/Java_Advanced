package FilesandDirectories;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {
File fileMatcher = new File("C:\\Users\\dborisov\\IdeaProjects\\Java_Advanced\\res\\words.txt");
File file = new File("C:\\Users\\dborisov\\IdeaProjects\\Java_Advanced\\res\\text.txt");
File fileout = new File("C:\\Users\\dborisov\\IdeaProjects\\Java_Advanced\\res\\wordsOut.txt");

        try(BufferedReader reader = new BufferedReader(new FileReader(file));
        BufferedWriter writer = new BufferedWriter(new PrintWriter(fileout))){


            Map <String , Integer> countWords = new LinkedHashMap<>();
            String[] match = new BufferedReader(new FileReader(fileMatcher)).readLine().split("\\s+");
            for (int i = 0; i < match.length; i++) {
                countWords.put(match[i],0);
            }


            String txt = "";
            List<String> word  = new ArrayList<>();
            while ((txt = reader.readLine()) != null){
                word = Arrays.stream(txt.toLowerCase().split("\\s+")).collect(Collectors.toList());

                for (int i = 0; i <word.size() ; i++) {
                    if(!countWords.containsKey(word.get(i).toLowerCase())){
                        continue;
                    }else{
                        countWords.put(word.get(i),countWords.get(word.get(i))+1);
                    }
                }
                countWords.forEach((key,value)-> {
                    try {
                        writer.write(String.format("%s - %d%n",key,value));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });


            }


        }catch (IOException ex){

        }


    }
}
