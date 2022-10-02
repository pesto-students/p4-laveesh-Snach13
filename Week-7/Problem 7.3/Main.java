public class Main {
  public static void main(String[] args) {

    LinkedList llist = new LinkedList();

    llist.push(20);
    llist.push(4);
    llist.push(15);
    llist.push(10);

    /* Create loop for testing */
    llist.head.next.next.next.next = llist.head;

    llist.detectLoop();

  }
}
