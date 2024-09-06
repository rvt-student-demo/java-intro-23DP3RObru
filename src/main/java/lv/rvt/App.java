package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        // Make your first Hello World app!
        
        // Komentārs
        // VSCode keybind: Ctrl +
        
        // String name = "John";
        // int age = 20;
        // boolean isOnline = false;
        // System.out.println(name);
        // System.out.println(age);
        // System.out.println(isOnline);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi savu vārdu: ");
        String vards = scanner.nextLine();
        System.out.println("Sveiks " + vards + "!");
        System.out.println("Ievadi savu uzvārdu: ");
        String uzvards = scanner.nextLine();
        System.out.println("Ievadi savu grupu: ");
        String grupa = scanner.nextLine();
        System.out.println("Students: " + vards +" "+ uzvards +", Grupa: "+ grupa);


    }

}
