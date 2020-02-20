public class PrintMe {
  public static void main(String[] args) {
    int i = 0;
    while (i < 10) {
    // for (int i = 0; i < 10; i++) {
      // System.out.println(i);
      if (i % 2 == 0) {
        System.out.println(i + " = EVEN");
      } else {
        System.out.println(i + " = ODD");
      }
      i++;
    }
  }
}
