import java.util.*;
import java.io.*;

public class DayOne {
    

    public static void main (String[] args){
        int firstNumber = 0;
        int nextNumber = 0;
        int counter = 0;
       try {
        File file = new File("data.txt");
        Scanner reader = new Scanner(file);

        while(reader.hasNextLine()){
            
                String data = reader.nextLine();
                nextNumber = Integer.parseInt(data);
                if(nextNumber > firstNumber){
                    counter++;
                }
                firstNumber = nextNumber; 
            
            
        }
        System.out.println(counter - 1);
        reader.close();
       } catch (Exception e) {
        //TODO: handle exception
            System.out.println("Error");
       }
        
    
    }
}
