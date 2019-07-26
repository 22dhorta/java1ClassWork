package Calculator;


import java.util.Scanner;

public class Numbers {
     public static void main( String[] args ) {
        
  Scanner keyboard = new Scanner (System.in);
      
  double num1, num2;
  char Operator;
  double answer = 0.0;
  
  
  System.out.println("Enter '1' to see your operator options, press anything else to continue");
  int enter = keyboard.nextInt();
  if (enter == 1) {
      System.out.println("Addition (+): Adding two numbers together");
      System.out.println("Subtraction (-): Subtracts the first number from the second number");
      System.out.println("Multiplication (*): Multiply two numbers together");
      System.out.println("Division (/): Divide the first number by the second number");
      System.out.println("Exponent (^): Raise the first number to the power of the second number");
      System.out.println("Modulus (%): Gives you the remainder of dividing the first number by the second number");
      System.out.println("    Ex. 6 % 4 = the remainder of 6/4 or 2.");
      System.out.println("Factorial (!): Multiplies a number by each whole number below it down to one");
      System.out.println("    Ex. 5! = 5 * 4 * 3 * 2 * 1");
       }
  else { }
  System.out.println("Enter first number:");
  num1 = keyboard.nextDouble();
  System.out.println("Enter second number:");
  num2 = keyboard.nextDouble();
  System.out.println("What operation do you want done?");
  Operator = keyboard.next().charAt(0);
  
   
  switch (Operator) {
      case '+': answer = num1 + num2;
      break;
      case '-': answer = num1 - num2;
      break;
      case '*': answer = num1 * num2;
      break;
      case '/': answer = num1 / num2;
      break;
      case '^': answer = Math.pow(num1,num2);
      break;
      case '%': answer = num1 % num2;
      break;
     
  }
  
  System.out.println(num1 + " " + Operator + " " + num2 + " = " + answer);
  

      
      
  }
  
  
  
  
  
  
     }





