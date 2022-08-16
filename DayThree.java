import java.util.*;
import java.io.*;

public class DayThree {
    
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("data3.txt");
        System.out.println("file read");
        Scanner reader = new Scanner(file);
        ArrayList<ArrayList<Integer>> data = new ArrayList<ArrayList<Integer>>(); 
        int fileLength = 0;
        int[] dataLine = new int[12];
        int[] answerArray = new int[12];
        StringBuilder sb = new StringBuilder();

        while (reader.hasNextLine()) {

            String line = reader.nextLine();
            char[] charArray= line.toCharArray();
            
            for (int i = 0; i < charArray.length; i++) {

                dataLine[i] = Character.digit(charArray[i], 10);
                if(dataLine[i] == 1){
                    answerArray[i] = answerArray[i] + 1;  
                }
            } 
            
            fileLength++;
          
        }

        for (int i = 0; i < answerArray.length; i++) {
            if(answerArray[i] > fileLength/2){
                sb.append("1");

            }
            else{
                sb.append("0");
            }
        }

        

        System.out.println(sb.toString());
          

        reader.close();
    }
}
