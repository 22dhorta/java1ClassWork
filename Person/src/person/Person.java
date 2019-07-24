
package person;

public class Person {
    static int age = 15;
    static double height = 1.76;
    public static String firstName = "Diego";
    public static String lastName = "Horta";
    boolean isAStudent = true;
    public static String hobby = "playing guitar";
    public static String pastime = "reading";
   
    public static void main(String[] args) {
        System.out.println("My name is " + firstName + " " + lastName);
        System.out.println("I am " + age + " years old");
        System.out.println("I am " + height + " meters tall");
        System.out.println("I love " + hobby + " and I also do a lot of " + pastime );
        
    }
    
}
