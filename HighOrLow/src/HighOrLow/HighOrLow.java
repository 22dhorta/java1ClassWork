
package HighOrLow;

import java.util.Scanner;

public class HighOrLow {

    public static void main(String[] args) {
 
        int randomNumber = (int)(Math.random() * 100 + 1);
         Scanner keyboard = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100, Guess a number and I will tell you if mine is higher or lower.");
      
         boolean answerCorrect = false;
        
        while (answerCorrect != true) {
        System.out.println("Make your guess!");
    int userNumber = keyboard.nextInt();
        if (userNumber > randomNumber) {
          
        System.out.println("Your guess was higher than my number!");
        }
        else if(userNumber < randomNumber) {
        System.out.println("Your guess was lower than my number!");
        }
        else {
            System.out.println("You guessed my number!");
      break;
        }
        
     
        }
        
       
        
        }
        
        
        
        
        
        
        
              }
        
        
   
    

