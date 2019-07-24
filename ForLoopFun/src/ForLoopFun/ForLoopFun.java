
package ForLoopFun;

import java.util.Scanner;

public class ForLoopFun {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
     
       for (int i = 0; i < 10; i++) {
           System.out.println("I Love Java!");
       }
       System.out.println("");
       System.out.println("Enter a number and I will count up to it!");
       int userNumber = keyboard.nextInt();
       for (int i = 0; i < userNumber; i++) {
       System.out.println(i + 1);
    }
       System.out.println("");
       System.out.println("Enter a number for me to start counting from");
       int startNumber = keyboard.nextInt();
       System.out.println("Enter a number for me to stop counting at");
       int stopNumber = keyboard.nextInt();
       System.out.println("Enter a number for me to count by");
       int countBy = keyboard.nextInt();
       
       int x = startNumber;
       
       for (int i = 0; i < (stopNumber - startNumber)/ countBy + 1; i++) { 
           System.out.println(x + "");
           System.out.println("");
           x = x + countBy;
       }
       
        
       
       System.out.println(""); 
       int[]myArray = new int[10];
       for (int i = 0; i <10; i++) {
           myArray[i] = i + 1;
           System.out.print(myArray[i] + " ");
       }
       
        System.out.println(""); 
       int[]myArray2 = new int[10];
       for (int i = 0; i <10; i++) {
           myArray2[i] = i + 3;
           System.out.print(myArray2[i] + " ");
       }
       
        System.out.println(""); 
       int[]myArray3 = new int[100];
       for (int i = 0; i <100; i++) {
           myArray3[i] = i + 1;
           
           if ((i + 1) % 5 == 0) {
           System.out.print(myArray3[i] + "! "); 
           }
           else {
               System.out.print(myArray3[i] + " ");
           }
           
           
           
       }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
     }
      
      
      
     }
       
    
    

