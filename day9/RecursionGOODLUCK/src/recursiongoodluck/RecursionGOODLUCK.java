/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursiongoodluck;

/**
 *
 * @author kevinmccarthy
 */
public class RecursionGOODLUCK {
  // f(f(f(a))) --- a = 20    
  //f(a) = 5 + a

  // f(f(f(20))) --- f(f(25))

  // f(25) = 5 + 25 = 30

  // f(30_ = 5 + 30 = 35  

  // f(f(f(20))) --- f(f(25)) ---- f(30) --- 35


  // 5+4+3+2+1; is the summation of 5
  // 7+6+5+4+3+2+1; is the summation of 7 

  public static int Summation(int n) {
    // Base Case: WE ARE AT THE END
    if (n <=0) {
      return 0;
      // Recursive Case: KEEP GOING
    } else {
      // 3 + Summation (2)
      // 3 + 2 + Summation(1)
      // 3 + 2 + 1 + Summation(0)
      // 3 + 2 + 1 + 0 = 6
      return n + Summation(n-1);
    }
  }

  public static int Factorial(int n) {
    // Base Case:
    if (n <=1) {
      return 1;
    }
    // Recursive Case:
    else {
      // 4 * Factorial(3)
      // 4 * 3 * Factorial(2)
      // 4 * 3 * 2 * Factorial(1)
      // 4 * 3 * 2 * 1
      return n * Factorial(n - 1); 
    }
  }
  public static int Exponentitation(int n, int p) {
    // Base Case:
    if (p <=0) {
      return 1;
    } 
    // Recursive Case:
    else {
      // 5 * Exponentitation(5,2)
      // 5 * 5 * Exponentitation(5,1)
      // 5 * 5 * 5 * Exponentation(5,0)
      // 5 * 5 * 5 * 1;;
      return n * Exponentitation(n, p-1);
    } 
  }
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    System.out.println(Summation(3));
    System.out.println(Summation(25));
    System.out.println(Factorial(4));
    System.out.println(Exponentitation(5,3));
  }
}
