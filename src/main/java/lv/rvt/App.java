package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {
        Account newaccount = new Account("New account", 0.00);
Account matthewaccount = new Account("Matthews account", 1000.00);

System.out.println("Initial state");
System.out.println(newaccount);
System.out.println(matthewaccount);

matthewaccount.withdraw(100);
System.out.println("The balance of Matthews account is now: " + matthewaccount.balance());
newaccount.deposit(100);
System.out.println("The balance of the new account is now: " + newaccount.balance());

System.out.println("End state");
System.out.println(matthewaccount);
System.out.println(newaccount);
}}
    
    





