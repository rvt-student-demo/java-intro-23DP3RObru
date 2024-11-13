package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int odd = 0;
        int even = 0;
        
        Statistics statistics = new Statistics();
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
            if (input % 2 == 0){
                even = even + input;
            }
            else{
                odd = odd + input;
            }
            statistics.addNumber(input);
}
    


    System.out.println("Sum: " + statistics.sum());
    System.out.println("Even sum: " + even);
    System.out.println("Odd sum: " + odd);
}}
    
    





