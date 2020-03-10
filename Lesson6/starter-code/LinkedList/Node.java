public class Node {
  private int data;
  private Node next;
  protected Node(){} // default constructor

  /** Constructor for the Node class.
  */
  protected Node(int data) {
    this.data = data;
    this.next = null;
  }

  /** Accessor method for data.
  */
  protected int getData(){
    return this.data;
  }

  /** Accessor method for next.
  */
  protected Node getNext(){
    return this.next;
  }

  /** Mutator method for data.
  */
  protected void setData(int data){
    this.data = data;
  }

  /** Mutator method for next.
  */
  protected void setNext(Node next){
    this.next = next;
  }

}
