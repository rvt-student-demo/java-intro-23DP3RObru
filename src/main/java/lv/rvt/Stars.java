package lv.rvt;
import java.util.*;
public class Stars{
    public static void printStars(int number){
        int times = 0;
        String star = "*";
        while (times < number) {
            System.out.print(star);
            times += 1;
            
        }
        System.out.println("");
        
    }
    public static void printSquare(int size){
        int times1 = 0;
        while (times1 < size){
            printStars(size);
            times1 += 1;
        }
        
    }
    public static void main(String[] args) {
        printSquare(4);
        
    }
}