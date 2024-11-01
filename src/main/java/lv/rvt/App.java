package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int prev = 0;
        String largest = ""; 
        int count = 0;
        double avg = 0;
        while (true) {
            String input = reader.nextLine();
            int length = input.length();
            if (length > prev){
                prev = length;
                largest = input;
            }

            
            if (input.equals("")) {
                break;
    }

        String[] pieces = input.split(",");
        sum = sum + Integer.valueOf(pieces[1]);
        count = count + 1;
        if (count > 0) {
            avg = (1.0 * sum / count);
        }
        
}       System.out.println("Average of the ages is " + avg);
        System.out.println("Largest name is " + largest);
    }

}
    
    





