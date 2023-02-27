import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
//    Given the root of a binary tree, return the inorder traversal of its nodes' values.

    public static void main(String[] args) {

    }

      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res);
        return res;
    }
    public void dfs(TreeNode n, List<Integer> res) {
        if(n == null) {return;}

        dfs(n.left, res);
        res.add(n.val);
        dfs(n.right, res);
    }
}
