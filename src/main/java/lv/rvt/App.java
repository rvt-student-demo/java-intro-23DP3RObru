package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Statistics statistics = new Statistics();
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
            statistics.addNumber(input);



        
        
    }
    System.out.println("Sum: " + statistics.sum());
}}
    
    





