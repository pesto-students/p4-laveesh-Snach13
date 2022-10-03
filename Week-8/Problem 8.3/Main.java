public class Main {

  // Function to print all nodes of a given level from left to right
  public static boolean printLevel(TreeNode root, int level) {
    // base case
    if (root == null) {
      return false;
    }

    if (level == 1) {
      System.out.print(root.value + " ");

      // return true if at least one node is present at a given level
      return true;
    }

    boolean left = printLevel(root.left, level - 1);
    boolean right = printLevel(root.right, level - 1);

    return left || right;
  }

  // Function to print level order traversal of a given binary tree
  public static void levelOrderTraversal(TreeNode root) {
    // start from level 1 — till the height of the tree
    int level = 1;

    // run till printLevel() returns false
    while (printLevel(root, level)) {
      level++;
    }
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(15);
    root.left = new TreeNode(10);
    root.right = new TreeNode(20);
    root.left.left = new TreeNode(8);
    root.left.right = new TreeNode(12);
    root.right.left = new TreeNode(16);
    root.right.right = new TreeNode(25);

    levelOrderTraversal(root);
  }

}
