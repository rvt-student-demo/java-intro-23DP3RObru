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

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Ievadi savu vārdu: ");
        // String vards = scanner.nextLine();
        // System.out.println("Sveiks " + vards + "!");
        // System.out.println("Ievadi savu uzvārdu: ");
        // String uzvards = scanner.nextLine();
        // System.out.println("Ievadi savu grupu: ");
        // String grupa = scanner.nextLine();
        // System.out.println("Students: " + vards +" "+ uzvards +", Grupa: "+ grupa);

        // Reading Different Variable Types from User
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Write text and press enter ");
        // String text = scanner.nextLine();
        // System.out.println("You wrote " + text);

    //     Scanner scanner = new Scanner(System.in);
        

    // System.out.println("Ievadi pirmo skaitli:");
    // int first = Integer.valueOf(scanner.nextLine());
    // System.out.println("Ievadi otro skaitli:");
    // int second = Integer.valueOf(scanner.nextLine());
    // double div = ((double) second / first );
    // int sum = (first+second);
    // int minus = (first-second);
    // int reiz = (first*second);
    // double dal = ((double) first / second);
    // System.out.println(first + "+" + second +"="+ sum);
    // System.out.println(first + "-" + second +"="+ minus);
    // System.out.println(first + "x" + second +"="+ reiz);
    // System.out.println(first + "/" + second +"="+ dal);
    // System.out.println("Vidējais:"+div);
        
        // int productCount = Integer.valueOf("20");
        // productCount = productCount + 99;



        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi ātrumu: ");
        int number = Integer.valueOf(scanner.nextLine());
        if (number > 120) {
            System.out.println("Speeding ticket!");
        }

    }

}
