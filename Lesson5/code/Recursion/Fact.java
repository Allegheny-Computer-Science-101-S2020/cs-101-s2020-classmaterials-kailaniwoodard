import java.util.Scanner;

/** Class to demonstrate factorial examples.
*/
public class Fact {

  /** Method to display factorials.
  */
  public static int factorial(int num) {
    int fact = 0;
    for(int i = num; i > 0; i--) {
      if (i == num) {
        fact = num;
      } else {
        fact *= i;
      }
    }
    return fact;
  }

  /** Method to calculate sum.
  */
  public static int sum(int num) {
    int sum = 0;
    for(int i = num; i > 0; i--) {
      if (i == num) {
        sum = num;
      } else {
        sum += i;
      }
    }
    return sum;
  }

  /** Main method for the Fact class.
  */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /*
    System.out.println("What number would you like to display the factorial of?");
    int number = sc.nextInt();
    System.out.println("The factorial (" + number + "!) of " + number + " is:");
    System.out.println(factorial(number));
    */
    System.out.println(sum(10));
  }
}
