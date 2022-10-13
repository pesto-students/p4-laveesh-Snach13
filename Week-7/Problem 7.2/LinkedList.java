public class LinkedList {

  public Node head;

  public void rotate(int k) {
    if (k == 0)
      return;

    Node current = head;

    int count = 1;
    while (count < k && current != null) {
      current = current.next;
      count++;
    }

    // If current is NULL, k is greater than or equal to count
    // of nodes in linked list
    if (current == null)
      return;

    Node kthNode = current;

    while (current.next != null)
      current = current.next;

    current.next = head;

    // Change head to (k+1)th node
    // head is now changed to node 50
    head = kthNode.next;

    // change next of kth node to null
    kthNode.next = null;
  }

  public void push(int new_data) {

    Node new_node = new Node(new_data);

    /* 3. Make next of new Node as head */
    new_node.next = head;

    /* 4. Move the head to point to new Node */
    head = new_node;
  }

  public void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {

    LinkedList llist = new LinkedList();

    // create a list 10->20->30->40->50->60
    for (int i = 60; i >= 10; i -= 10)
      llist.push(i);

    System.out.println("Given list");
    llist.printList();

    llist.rotate(4);

    System.out.println("Rotated Linked List");
    llist.printList();

  }

}
