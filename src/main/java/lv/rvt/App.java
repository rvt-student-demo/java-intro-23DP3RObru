package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[10];
        for(int i=0; i<10; i++){
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int min = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
        System.out.println(max);

        
    }

}
    
    





