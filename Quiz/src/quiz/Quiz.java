
package quiz;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int rightAnswers = 0;
        
        System.out.println("Here comes a quiz. No cheating!");
        
        System.out.println("Question 1: What is the capital of California?");
        System.out.println("\tA) San Francisco");
        System.out.println("\tB) Sacramento");
        System.out.println("\tC) Los Angeles");
        System.out.println("\tD) San Jose");
        String answer1 = keyboard.nextLine();
        if (answer1.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the capital is actually Sacramento!");
        }
        
        
        System.out.println("Your score is " + rightAnswers + " out of 1 question.");
        
        System.out.println("Question 2: If 3x−y=12, what is the value of 8^x/2^y?");
        System.out.println("\tA) 2^12");
        System.out.println("\tB) 4^4");
        System.out.println("\tC) 8^2");
        System.out.println("\tD) The answer acnnot be determined with the current information ");
        String answer2 = keyboard.nextLine();
        if (answer2.equals("A")) {
            System.out.println("You are right!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the answer is 2^12!");
        }
        
        
        System.out.println("Your score is " + rightAnswers + " out of 2 questions.");
        
        System.out.println("Question 3: What is a boolean?");
        System.out.println("\tA) A variable that evaluates for true or false");
        System.out.println("\tB) An interminable line of code");
        System.out.println("\tC) An inescapable void of darkness and pain");
        System.out.println("\tD) a true or false");
        String answer3 = keyboard.nextLine();
        if (answer3.equals("A"))  {
            System.out.println("You are correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the right answer is A!");
        }
        
        System.out.println("Your score is " + rightAnswers + " out of 3 questions.");
        
        System.out.println("Question 4: How many breeds of dog exist in the world today?");
        System.out.println("\tA) 459");
        System.out.println("\tB) 345987");
        System.out.println("\tC) 360");
        System.out.println("\tD) 190");
        String answer4 = keyboard.nextLine();
        if (answer4.equals("C"))  {
            System.out.println("You are correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the right answer was 360!");
        }
        
         System.out.println("Your score is " + rightAnswers + " out of 4 questions.");
        
        System.out.println("Question 5: What is 2 + 2?");
        System.out.println("\tA) Window");
        System.out.println("\tB) 5");
        System.out.println("\tC) 3");
        System.out.println("\tD) 4");
        String answer5 = keyboard.nextLine();
        if (answer5.equals("D"))  {
            System.out.println("You are correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the answer was 2!");
        }
        
         System.out.println("Your score is " + rightAnswers + " out of 5 questions.");
         
           System.out.println("Question 6: What is the human population?");
        System.out.println("\tA) 6 Billion");
        System.out.println("\tB) 7 Billion");
        System.out.println("\tC) 8 Billion");
        System.out.println("\tD) 100 Million");
        String answer6 = keyboard.nextLine();
        if (answer6.equals("C"))  {
            System.out.println("You are correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the answer was 8 Billion!");
        }
        
         System.out.println("Your score is " + rightAnswers + " out of 6 questions.");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
        
        
    }
    

