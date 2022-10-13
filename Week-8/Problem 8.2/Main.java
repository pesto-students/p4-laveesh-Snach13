public class Main {

  public static void main(String args[]) {
    BinaryTree tree = new BinaryTree();
    tree.root = new TreeNode(4);
    tree.root.left = new TreeNode(2);
    tree.root.right = new TreeNode(5);
    tree.root.left.left = new TreeNode(1);
    tree.root.left.right = new TreeNode(3);

    // Function call
    if (tree.isBST())
      System.out.println("IS BST");
    else
      System.out.println("Not a BST");
  }
}
