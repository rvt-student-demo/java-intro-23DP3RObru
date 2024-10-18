package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers separated by spaces: ");
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
        String[] parts = input.split(" ");
        for (String part : parts) {
            numbers.add(Integer.parseInt(part));
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("The sum of the numbers is: " + sum);
    }





}}

