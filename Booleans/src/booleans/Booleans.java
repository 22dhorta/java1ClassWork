
package booleans;

public class Booleans {

   
    public static void main(String[] args) {
        int x,y,h,i;
        boolean a,b,c,d,e,f,g;
        String s1;
        String s2;
        String s3;
        x=3;
        y=4;
//        == means equal to
        a= x==y;
//        != means not equal to
        b= x!=y;
//        > means greater than
        c= x>y;
//        < means lesser than
        d= x<y;
//        >= means greater than or equal to
        e= x>=y;
//        <= means lesser than or equal to
        f= x<=y;
        System.out.println(x + " is equal to " + y + ": " + a);
        System.out.println(x + " is not equal to " + y + ": " + b);
        System.out.println(x + " is greater than " + y + ": " + c);
        System.out.println(x + " is less than " + y + ": " + d);
        System.out.println(x + " is greater than or equal to " + y + ": " + e);
        System.out.println(x + " is less than or equal to " + y + ": " + f);
        
        
        
        x=8;
        y=9;
        a= x==y;
        b= x!=y;
        c= x>y;
        d= x<y;
        e= x>=y;
        f= x<=y;
        System.out.println(x + " is equal to " + y + ": " + a);
        System.out.println(x + " is not equal to " + y + ": " + b);
        System.out.println(x + " is greater than " + y + ": " + c);
        System.out.println(x + " is less than " + y + ": " + d);
        System.out.println(x + " is greater than or equal to " + y + ": " + e);
        System.out.println(x + " is less than or equal to " + y + ": " + f);
        
       s1 = "Good Morning.";
       s2 = "Hi There!";
       s3 = "Howdy, partner!";
       g = s1.equals(s2);
       h = s2.compareTo(s1);
       i = s2.compareTo(s3);
       
       System.out.println(s1 + " is equal to " + s2 + ": " + g);
       System.out.println(s2 + " is " + h + " spaces from " + s1);
       System.out.println(s2 + " is " + i + " spaces from " + s3);
    }
    
}
