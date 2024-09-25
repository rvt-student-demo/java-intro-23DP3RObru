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



        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Ievadi ātrumu: ");
        // int number = Integer.valueOf(scanner.nextLine());
        // if (number > 120) {
        //     System.out.println("Speeding ticket!");
        // }




        // Scanner scanner = new Scanner(System.in);
    //     System.out.println("Enter Grade (0-100): ");
    //     int grade = Integer.valueOf(scanner.nextLine());
    //     if (grade < 0) {
    //         System.out.println("Impossible.");
    //     }
    //     else if (grade => 0 && grade <= 49) {
    //         System.out.println("Failed.");

    //     }
    //     else if (grade => 50 && grade <= 59) {
    //         System.out.println("Grade: 1");

    //     }
    //     else if (grade => 60 && grade <= 69) {
    //         System.out.println("Grade: 2");
    //     }
    //     else if (grade => 70 && grade <= 80) {
    //         System.out.println("Grade: 3");
    //     }
    //     else if (grade => 80 && grade <= 90) {
    //         System.out.println("Grade: 4");
    //     }
    //     else if (grade => 90 && grade < 100) {
    //         System.out.println("Grade: 5");
    //     }
    //     else {
    //         System.out.println("Incredible!");
    //     }
    // }
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter gift price: ");
    int gift = Integer.valueOf(scanner.nextLine());
    if (gift > 4999 && gift < 25000) {
        int gifttax = (int) (gift + 100+ (gift-5000)*0.08);
        System.out.println("The total price of the gift with tax is- " + gifttax);
    }
    else if (gift > 25000 && gift < 55001) {
        int gifttax = (int) (gift + 1700+ (gift-25000)*0.1);
        System.out.println("The total price of the gift with tax is- " + gifttax);

    }
    else if (gift > 55000 && gift < 200001) {
        int gifttax = (int) (gift + 4700+ (gift-50000)*0.12);
        System.out.println("The total price of the gift with tax is- " + gifttax);

    }
    else if (gift > 200000 && gift < 1000001) {
        int gifttax = (int) (gift + 22100+ (gift-200000)*0.15);
        System.out.println("The total price of the gift with tax is- " + gifttax);
    }
    else if (gift > 1000001) {
        int gifttax = (int) (gift + 142100+ (gift-1000000)*0.17);
        System.out.println("The total price of the gift with tax is- " + gifttax);
    }
    else if (gift < 5000) {
        System.out.println("No tax!");
    }
}
}
