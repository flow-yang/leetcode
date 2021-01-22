package Tree;

/**
 * 若当前节点是最近公共祖先，则返回当前节点
 * 若当前节点下不包含其中一个或节点则返回空
 *
 * 递归：确定好截至条件
 * 确定号递归的逻辑公式
 */
public class 二叉树的最近公共祖先 {
    public static void main(String[] args) {

    }
   public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q) {
//        结束条件
        if (root == null || root == p || root == q) {
            return root;
        }
//        递归
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return root;
    }
}
