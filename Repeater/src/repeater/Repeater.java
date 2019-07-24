
package repeater;

import java.util.Scanner;

public class Repeater {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.print( "Type something, and I will repeat it as many times as you want: " );
       String message = keyboard.nextLine();
       System.out.println("How many times do you want it repeated?");
       int input = keyboard.nextInt();
       
       System.out.println("Here we go!");
       int count = 0;
       int number = 1;
       while (count < input) {
           System.out.println(number + "." + message);
           count ++;
           number ++;
       }
    }
    
}
