package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers, -1 to end: ");
        while (true) {
            
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("-1")) {
                break;
            }
            numbers.add(Integer.parseInt(input));
            

        }
        System.out.println(numbers);        }
        
    }
    
    





