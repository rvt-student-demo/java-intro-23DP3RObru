package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<>();
        System.out.println("Ievadi vardus: ");
        wordList.add(scanner.nextLine());
        wordList.add(scanner.nextLine());
        wordList.add(scanner.nextLine());
        wordList.add(scanner.nextLine());
        System.out.println(wordList.get(2));
    }





}

