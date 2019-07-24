
package userdata;

import java.util.Scanner;
public class UserData {

    
    public static void main(String[] args) {
        String name;
        int age;
        String Birthday;
        String favBook;
        String Hometown;
        int luckyNumber;
        double shoeSize;
        double excitement;
        String coolFact;
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "What is your name?" );
        name = keyboard.nextLine();
        System.out.println("Hi " + name + ", How old are you?");
        age = keyboard.nextInt();
        System.out.println();
        Birthday = keyboard.nextLine();
        System.out.println("Cool! When was your birthday?");
        Birthday = keyboard.nextLine();
        System.out.println("Nice! What's your favorite book?");
        favBook = keyboard.nextLine();
        System.out.println("I love that book! What is your hometown?");
        Hometown = keyboard.nextLine();
        System.out.println("Cool! What's your lucky number?");
        luckyNumber = keyboard.nextInt();
        System.out.println("What's your shoe size?");
        shoeSize = keyboard.nextDouble();
        System.out.println("On a scale from 1 to 5, how excited are you to learn java?");
        excitement = keyboard.nextDouble();
        System.out.println("Great! Can you tell me something cool about yourself?" );
        coolFact = keyboard.nextLine();
        System.out.println("Great! Can you tell me something cool about yourself?" );
        coolFact = keyboard.nextLine();
        System.out.println(name + ", Age " + age + ", was born on " + Birthday + ". From " + Hometown + ", " + name + " has lucky number " + luckyNumber + " and a shoe size of " + shoeSize + ". On a scale of 1 to 5," + name + " is this excited to learn about java: " + excitement + "! A fun fact about " + name + " is:" + coolFact);
        
        
      
        
        
      
        
        
        
    } 
    
}
