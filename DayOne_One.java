import java.util.*;
import java.io.*;

public class DayOne_One {
    
    public static int handleData(ArrayList<Integer> data){
        int sum1 = 0;
        int sum2 = 0;
        int counter = 0;

        for (int i = 2; i < data.size(); i++) {

            if((i+2) > data.size()){
                System.out.println("At the end: "+ (i+2) + "size: " + data.size());
                break;
            }

            
            sum1 = data.get(i) + data.get(i-1) + data.get(i-2);
            sum2 = data.get(i+1) + data.get(i) + data.get(i-1);
            
            if(sum2 > sum1){
                counter++;
            }
            System.out.println(data.get(i+1));
        }


        return counter;
    }

    public static void main (String[] args){
        ArrayList<Integer> data = new ArrayList<Integer>(); 


        int counter = 0;
        try {
            File file = new File("data.txt");
            Scanner reader = new Scanner(file);

            while(reader.hasNextLine()){
                int number = Integer.parseInt(reader.nextLine());
                data.add(number);         

            }
            reader.close();
       } catch (Exception e) {
        //TODO: handle exception
            System.out.println("Error");
       }
    
       
       System.out.println(handleData(data));
    
    }
}
