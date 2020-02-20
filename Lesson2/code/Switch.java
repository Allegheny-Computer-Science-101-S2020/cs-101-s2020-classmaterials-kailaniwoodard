public class Switch {
/**
 b1 = $100, b2 = $200 -> b1 = $200, b2 = $100
*/
  public static void swap(int b1, int b2) {
    int temp = b1;
    b1 = b2;
    b2 = temp;
  }

  public static void main(String[] args) {
    int b1 = 100;
    int b2 = 200;

    System.out.println("b1 = " + b1 + " and b2 = " + b2);
    System.out.println("Initiating swap...");

    swap(b1, b2);

    System.out.println("b1 = " + b1 + " and b2 = " + b2);
  }
}
