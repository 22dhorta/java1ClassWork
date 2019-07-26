 
package car;

public class CarTest {
   
    public static void main(String[] args) {
        String make1 = "Toyota";
        String model1 = "Camry";
        int year1= 1999;
        String nickName1 = "Carl";
        String color1 = "Yellow";
        int yearsOwned1 = 20;
        double miles1 = 63.497;
        
       Car car1= new Car(make1, model1, year1, nickName1, color1, yearsOwned1, miles1);
       
       System.out.println("Car 1: " + car1.getColor() + " " + car1.getMake() + " " + car1.getModel() + " from " + car1.getYear());
       System.out.println("Nickname: " + car1.getNickName() + ", " + "owned for " + car1.getYearsOwned() + " Years");
       System.out.println("Mileage: " + car1.getMiles() + " Miles");
       
       car1.turnOn();
       car1.turnOff();
       car1.turnOff();
              
    }
    
}