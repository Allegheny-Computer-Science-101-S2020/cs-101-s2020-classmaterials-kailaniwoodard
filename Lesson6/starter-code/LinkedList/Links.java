public class Links extends Node {
  private Node head;
  private int size;

  /** Constructor for the Links class.
  */
  public Links() {
    head = null;
    size = 0;
  }

  /** Method to insert nodes.
  */
  public void insertNode(int index, int data) { // integer index refers to position
    if (index < 0)
    System.out.println("node cannot be inserted");
    else {
      int currentIndex = 1;
      Node current = head;
      while(current != null && index > currentIndex) {
        current = current.getNext();
        currentIndex++;
      }
    Node temp = new Node(data);
    if (index == 0){
      // Insert Node at the front
      temp.setNext(head);
      head = temp;
    } else {
      // Insert Node at given position
      temp.setNext(current.getNext());
      current.setNext(temp);
    }
    size++;
  }
}

  public void displayNodes() {
    if (size < 1) {
      //index not valid
      System.out.println("list is empty");
    }
    else{
      Node current = head;
      while(current != null){
        System.out.print(current.getData() + "->");
        current = current.getNext();
      }
      System.out.print("\n");
    }
  }

  public void removeNode(int data) {
    Node current = head;
    if (current.getData() == data) {
      // Remove the head node
      head = current.getNext();
    } else {
      // Remove a node in any other position that the head
      while (current != null && current.getNext().getData() != data) {
      // while current element is not null and next element is not equal to given data parameter
        current = current.getNext();
      }
      current.setNext(current.getNext().getNext());
    }
    size--;
  }

  public boolean findNode(int data) {
    Node current = head;
    while (current != null && current.getNext().getData() != data) {
      current = current.getNext();
    }
    if (current.getNext().getData() == data) {
      return true;
    } else {
      return false;
    }
  }
}
