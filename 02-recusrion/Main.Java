// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  private static long[] fibonCache;
  
  public static void main(String[] args) {

    System.out.println(factorial(5));          
    // System.out.println(fibonacci(8));
    // System.out.println(mystery("hellothere"));

  }

// Example 1: Recursive method to calculate factorial
// 5x4x3x2x1
// factorial(5)
    //  5 * factorial(4)
    //      4 * factorial(3) 
    //          3 * factorial(2)
    //              2 * factorial(1)
          

  public static int factorial(int n) {
      // Base case: If n is 0 or 1, return 1
      if (n == 0 || n == 1) {
          return 1;
      }
      // Recursive case: n * factorial(n - 1)
      else {
          return n * factorial(n - 1);
      }
  }

  // Example 2: Recursive method to calculate a fibonacci number
  public static int fibonacci(int n) {
    if(n<=1)
      return n;
    return fibonacci(n-1) + fibonacci(n-2);
    
  }

                 fibonacci(5)

      fibonacci(4)                     +    fibonacci (3)

     fib(3)+fib(2)                 +         fib(2)+fib(1)

fib(2)+fib(1) + fib(1)+fib(0)      +        fib(1)+fib(0) 

fib(1)+fib(0) 





  // Example 3: Recursive method to reverse a string
  public static String mystery(String s) {
    int N = s.length();
    if(N<=1) return s;
    String a = s.substring(0,N/2);
    System.out.println(a);
    String b = s.substring(N/2,N);
    System.out.println(b);
    return mystery(b) + mystery(a);
  }

  
}


