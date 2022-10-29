public class LinkedList {

  public Node head;

  /* Inserts a new Node at front of the list. */
  public void push(int data) {

    Node new_node = new Node(data);
    new_node.next = head;
    head = new_node;
  }

  // Traverse linked list using two pointers
  // Move one pointer(slow_p) by one and another pointer(fast_p) by two.
  // If these pointers meet at the same node then there is a loop.
  // If pointers do not meet then linked list doesn’t have a loop.

  public void detectLoop() {
    Node slow_p = head, fast_p = head;
    int flag = 0;
    while (slow_p != null && fast_p != null
        && fast_p.next != null) {
      slow_p = slow_p.next;
      fast_p = fast_p.next.next;
      if (slow_p == fast_p) {
        flag = 1;
        break;
      }
    }
    if (flag == 1)
      System.out.println("Loop found");
    else
      System.out.println("Loop not found");
  }

}
