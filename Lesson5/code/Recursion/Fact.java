import java.util.Scanner;

/** Class to demonstrate factorial examples.
*/
public class Fact {

  /** Method to display factorials.
  */
  public static int factorial(int num) {
    if (num <= 1) {
      return 1;
    }
    return num * factorial(num-1);
  }

  /** Method to calculate sum.
  */
  public static int sum(int num) {
    if (num <= 0) {
      return 0;
    }
    return num + sum(num-1);
  }

  /** Main method for the Fact class.
  */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("What number would you like to display the factorial of?");
    int number = sc.nextInt();
    System.out.println("The factorial (" + number + "!) of " + number + " is:");
    System.out.println(factorial(number));

    //System.out.println(sum(20));
    // Stack follows LIFO (last in, first out)
  }
}
