public class BinaryTree {

  TreeNode root;

  int maxDepth(TreeNode root) {
    // Root being null means tree doesn't exist.
    if (root == null)
      return 0;

    // Get the depth of the left and right subtree
    // using recursion.
    int leftDepth = maxDepth(root.left);
    int rightDepth = maxDepth(root.right);

    // Choose the larger one and add the root to it.
    if (leftDepth > rightDepth)
      return (leftDepth + 1);
    else
      return (rightDepth + 1);
  }

  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.root = new TreeNode(1);
    tree.root.left = new TreeNode(2);
    tree.root.right = new TreeNode(3);
    tree.root.left.left = new TreeNode(4);
    tree.root.right.left = new TreeNode(5);
    tree.root.right.right = new TreeNode(6);
    tree.root.right.right.left = new TreeNode(8);
    tree.root.right.left.right = new TreeNode(7);
    System.out.println("Max depth: " + tree.maxDepth(tree.root));
  }

}
