package edu.cnm.deepdive;

public class Math {

   public static long gcd(long a, long b) {
    a = java.lang.Math.abs(a); //writing out the complete absolute value utility to avoid confusion because of our class
    b = java.lang.Math.abs(b);
    if (a == 0) { //boolean
      return b;
    } else if (b == 0) {
      return a;
    }
    while (a != b) { //if line8 or 10 prove not to be true
      if (a > b) {
        a -= b; // a = a - b;
      } else {
        b -= a;
      }  
    } 
    return a;//this is "fulfilling my promise" of returning a long in line 5        
   }         // the compiler is only looking for a value that can be interpreted as a long
}
