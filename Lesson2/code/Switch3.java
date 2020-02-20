public class Switch3 {
/**
 b1 = $100, b2 = $200 -> b1 = $200, b2 = $100
*/
  int box1;
  int box2;

  public Switch3(int b1, int b2) {
    box1 = b1;
    box2 = b2;
  }

  public int getBox1() {
    return box1;
  }

  public void setBox1(int num) {
    box1 = num;
  }

  public int getBox2() {
    return box2;
  }

  public void setBox2(int num) {
    box2 = num;
  }

  public void swap(Switch3 obj) {
    int temp = getBox1();
    setBox1(getBox2());
    setBox2(temp);
  }

  public static void main(String[] args) {
    int b1 = 100;
    int b2 = 200;

    Switch3 obj = new Switch3(b1, b2);

    obj.swap(obj);

    System.out.println("b1 = " + obj.getBox1() + " and b2 = " + obj.getBox2());
  }
}
