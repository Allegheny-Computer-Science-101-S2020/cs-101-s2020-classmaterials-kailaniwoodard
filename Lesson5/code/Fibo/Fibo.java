import java.util.Arrays;
import java.util.Scanner;

/** Class to demonstrate the fibonacci effect with the rabbit example.
*
* @author Kai'lani Woodard
*
*/
public class Fibo {
  /** Main class for Fibo.
  */
  public static void main (String[] args) {
    // Create scanner class to get user input
    Scanner sc = new Scanner(System.in);
    // Prompt user for month amount
    System.out.println("Please enter the amount of months:");
    int months = sc.nextInt(); // Save value to integer months
    int fib[] = new int[months]; // Make fib[] length equal to integer months

    // For loop to determine values within fib[]
    for (int i = 0; i < months; i++) {
      switch (i) {
        case 0:
          fib[i] = 1;
          break;
        case 1:
          fib[i] = i;
          break;
        default:
          fib[i] = fib[i-1] + fib[i-2];
          break;
      }
    }
    // Print fib[] to the console
    System.out.println(Arrays.toString(fib));
  }
}
