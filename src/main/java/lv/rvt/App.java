package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class App 
{
    public static void main(String[] args) {
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println("Paul: The card has a balnce of "+paulsCard+" euros");
        System.out.println("Matt: The card has a balnce of "+mattsCard+" euros");
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        System.out.println("Paul: The card has a balnce of "+paulsCard+" euros");
        System.out.println("Matt: The card has a balnce of "+mattsCard+" euros");
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        System.out.println("Paul: The card has a balnce of "+paulsCard+" euros");
        System.out.println("Matt: The card has a balnce of "+mattsCard+" euros");

    
    
    }
}
    
    





