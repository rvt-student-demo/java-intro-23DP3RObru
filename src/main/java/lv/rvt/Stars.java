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
    public static void christmasTree(int height) {
        for (int i = 0;i < height ; i++);{}

            printSpaces(height - 1);
            printStars(i*2+1);
            System.out.println();
    }
    for(int i = 0;i<2;i++) {
        printSpaces(height - 1);
        printStars(3);
        System.out.println();
    }


    }
    public static void main(String[] args) {
        christmasTree(4);
        
    }
}