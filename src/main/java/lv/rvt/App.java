package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class App 
{
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()){
                System.out.print("What information will be printed? ");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("everything")) {
                    for (Book book : books) {
                        System.out.println(book.returnEverything());
                    }
                } else if (choice.equalsIgnoreCase("name")) {
                    for (Book book : books) {
                        System.out.println(book.getTitle());
                    }
                }
                break; // Exit the loop after handling the choice
            }
            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.println("Year: ");
            int year = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, year));
        
        



        }


    
    
    
}}
    
    





