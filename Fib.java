import java.lang.Math;

/** 
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1
  
  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /** 
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
      if(n == 2 || n == 1) return 1;
      else return fib_recurrence(n-1) + fib_recurrence(n-2);
    }
     /* These are class methods because they do not require any other class 
    */


    /** 
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
      long nthFib = 0;
      long afterNthFib = 1;
      long temp;
      for(int currentFibNum = 0; currentFibNum < n; currentFibNum++){
        temp = nthFib;
        nthFib = afterNthFib;
        afterNthFib += temp;
      }

      return nthFib;
    }
    /* Time complexity:
       Consider the size of the problem to be ...
       
       As the proxy for the time required, count the amount of additions done
       
       Then cost of the the recurrence algorithm
       grows linearlly
       as the size of the problem increases,
       because to find the nth fibonacci number, we must add n numbers
     */


    /** 
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
        return (Math.pow((1 + Math.sqrt(5))/2,n) - Math.pow((1 - Math.sqrt(5))/2,n)) / Math.sqrt(5);
    }
    /* Time complexity:
       Consider the size of the problem to be the 
       
       As the proxy for the time required, count the amount of operations done in the formula
       
       Then cost of the the recurrence algorithm
       grows at a linear rate
       as the size of the problem increases,
       because aan exponential multiplication is linear, since it requires multiplying a number by itself a certain amount of times.
     */
}
