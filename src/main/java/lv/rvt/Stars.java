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
    public static void printTriangle(int size){
        int times1 = 1;
        while (times1 <= size){
            int times2 = size - (size - 1);
            printStars(times2 * times1);
            times1 += 1;
        }
        
    }
    public static void main(String[] args) {
        printTriangle(4);
        
    }
}