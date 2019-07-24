package mathoperations;

public class MathOperations {
     public static void main( String[] args ) {
         int p,q,r,s,t,u,y,o,x,z,e,d,h,j;
          double a,b,c;
          String first, second, together;
 
          p = 8;
          q = 25;
          y = 17;
          o = 407865;
          d = 64;
          h = 98;
          j = 46;
          
         System.out.println( "p is " + p + ", q is " + q );
 
         r = p + q;
         System.out.println( "p+q is " + r );
         s = p - q;
         System.out.println( "p-q is " + s );
         t = p+q*3;
         System.out.println( "p+q*3 is " + t );
         u = q / 2;
         System.out.println( "q/2 is " + u );
        
        a = 1.1;
         System.out.println( "a is " + a );
         b = a*a;
         System.out.println( "a*a is " + b );
         c = b / 2;
         System.out.println( "b/2 is " + c );
         
         System.out.println("y is " + y + ", o is " + o);
         System.out.println("d is " + d + ", h is " + h + " and j is " + j);
         x = y/2+o*2-h*r;
         System.out.println("y/2+o*2-s*r is " + x);
         z = y-o+d/3;
         System.out.println("y-o+t/3 is " + z);
         e = j+o/23*y;
         System.out.println("p+o/23*y is " + e );
    
         
         
         
         System.out.println();

         first = "peanut butter and";
         second = " jelly";
         together = first + second;
         System.out.println( together );
     }
}