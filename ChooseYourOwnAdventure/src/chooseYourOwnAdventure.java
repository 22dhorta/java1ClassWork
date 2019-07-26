
 import java.util.Scanner;

public class chooseYourOwnAdventure {
    
 
    
   public static void main(String[] args) {
   
    String (Response1,Response2,Response3,Response4,Response5,Response6);  
       
       
       
   Scanner keyboard = new Scanner (System.in);
   System.out.println("You are stuck in a cave with two doors. You have to escape!");
   System.out.println("The first door holds a mighty dragon, The second door holds a massive lion!");
   System.out.println("Which beast will you go through?");
   String Response1 = keyboard.nextLine();
       if (Response1.equals("dragon")) {
           System.out.println("You defeat the dragon! You are now faced with a room full of spiders and a pit of snakes");
           System.out.println("Which way will you go?");
           Response2 = keyboard.nextLine();
           if (Response2.equals("spiders")) {
            System.out.println("You amble slowly through the room and manage to enter the next room unscathed");
            System.out.println("You meet a dashing prince and a striking princess");
            System.out.println("Who will you help?");
            Response3 = keyboard.nextLine();
                if (Response3.equals("Princess")) {
                    System.out.println("The princess turns out to be a deadly witch and she kills you!");
       }
                else if (Response3.equals("Prince")) {
                  System.out.println("The prince wants you to kill a deadly minotaur that is hiding in the caves");
                  System.out.println("Do you help him or not");
                  Response4 = keyboard.nextLine();
                    if (Response4.equals("Yes")) {
                        
                    }
                    else {
                        System.out.println("The prince has you killed for not cooperating!");
                    }
           }
   
   
   
           }
   
       }
   }
}