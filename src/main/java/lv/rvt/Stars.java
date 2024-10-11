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

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }
}