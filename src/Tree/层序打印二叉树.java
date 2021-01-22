package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 自顶向下，一层一层的将数组遍历
 * 需要两个循环，循环嵌套
 */
public class 层序打印二叉树 {
    public int[] levelOrder(TreeNode root) {
        if (root==null){

            return new int[0];
        }
        ArrayList<TreeNode> arrayList=new ArrayList<>();
//        队列
        Queue<TreeNode> queue =new LinkedList();
        queue.add(root);
        arrayList.add(root);

//        将当前节点的下一层全部加入到arraylist中
        while (queue.size()!=0){
            TreeNode treeNode= queue.poll();
            if (treeNode.left!=null) {
                arrayList.add(treeNode.left);
                queue.add(treeNode.left);
            }
            if (treeNode.right!=null){
                arrayList.add(treeNode.right);
                queue.add(treeNode.right);
            }
        }
        int[] res=new int[arrayList.size()];
        for (int i=0;i<arrayList.size();i++){
            res[i]=arrayList.get(i).val;
        }
        return res;
    }
//层序遍历，返回数据类型不同而已
    public List<List<Integer>> levelOrder2(TreeNode root) {
        ArrayList<List<Integer>> arrayList=new ArrayList<>();
        if (root==null){
            return arrayList;
        }
//        队列
        Queue<TreeNode> queue =new LinkedList();
        queue.add(root);
//        将当前节点的下一层全部加入到arraylist中
        while (queue.size()!=0){
            int size=queue.size();
            ArrayList<Integer> arrayList1=new ArrayList<>();
            for (int i=0;i<size;i++){
                TreeNode treeNode= queue.poll();
                if (treeNode!=null)
                    arrayList1.add(treeNode.val);
                if (treeNode.left!=null) {
                    queue.add(treeNode.left);
                }
                if (treeNode.right!=null){
                    queue.add(treeNode.right);
                }
            }
            arrayList.add(arrayList1);
        }
        return arrayList;
    }
}
