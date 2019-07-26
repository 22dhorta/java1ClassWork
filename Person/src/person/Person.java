
package person;

public class Person {
    static int age;
    static double height;
    public static String firstName, phoneNumber, lastName;
    boolean isAStudent = true;
    
    
    public Person(String newFirstName, String newLastName, String newPhoneNumber){
    firstName = newFirstName;
    lastName = newLastName;
    phoneNumber = newPhoneNumber;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        Person.firstName = firstName;
    }
    
    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        Person.lastName = lastName;
    }
    
    public static String getPhoneNumber() {
        return phoneNumber;
    }

    public static void setPhoneNumber(String phoneNumber) {
        Person.phoneNumber = phoneNumber;
    }
    
    
 
}
    

    
    
                
    
    
    
    
    
    
    
    

