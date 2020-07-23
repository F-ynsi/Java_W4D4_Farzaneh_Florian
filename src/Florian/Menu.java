package Florian;
import java.util.*;
public class Menu {


    public static void main(String[] args) {
        System.out.println("-----------------------------------------------");
        System.out.println("|                                             |");
        System.out.println("|                                             |");
        System.out.println("|                  Welcome                    |");
        System.out.println("|                                             |");
        System.out.println("|                                             |");
        System.out.println("-----------------------------------------------");

       Scanner scan = new Scanner(System.in);
       System.out.println("Make a Selection:");
       System.out.println("Menu Point print 1");
       System.out.println("Menu Point print 2");
       System.out.println("Menu Point print 3");
       System.out.println("Menu Point print 4");
       System.out.println("Menu Point print 5");

       int menuScan = scan.nextInt();

       switch(menuScan){
           case 1:
               System.out.println("you take 1");
               break;
           case 2:
               System.out.println("you take 2");
               break;
           case 3:
               System.out.println("you take 3");
               break;
           case 4:
               System.out.println("you take 4");
               break;
           case 5:
               System.out.println("you take 5");
       }
    }
}
