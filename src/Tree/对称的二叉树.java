package Tree;

public class 对称的二叉树 {
    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : func(root.left, root.right);
    }
    boolean func(TreeNode L , TreeNode R){
        //截至条件
        if(L == null && R == null) return true;
        if(L == null || R == null || L.val != R.val) return false;
//        递归过程
        return func(L.left, R.right) && func(L.right, R.left);
    }

}


