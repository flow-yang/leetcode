package Tree;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *1 先找到数组中间位置的索引，以这个位置为根节点划分二叉树
 *2 左右子树再按照来进行划分。可尝试用递归法
 */
public class 最小高度树 {


    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8};
        TreeNode treeNode=sortedArrayToBST(nums);
        System.out.println(treeNode);

    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length==0)
        {
            return null;
        }
        if (nums.length==1)
        {
            return new TreeNode(nums[0]);
        }
        //数组中间值
        int med;
        int left;
        int right;
//        初始化数组的左右指针和中间指针
        left=0;
        right=nums.length;
        med=(left+right)/2;
        System.out.println(nums[med]);
        if (left<right) {
//        设置左子树
            new TreeNode(nums[med]).left = sortedArrayToBST(Arrays.copyOfRange(nums, left, med));
//        设置右子树
            new TreeNode(nums[med]).right = sortedArrayToBST(Arrays.copyOfRange(nums, med + 1, right));

        }
        return new TreeNode(nums[med]);
    }
























//        ArrayList<Integer> e = new ArrayList<Integer>();
//        ArrayList<Integer> o  = new ArrayList<Integer>();
//        TreeNode root;
//
////        将数组按索引的奇偶划分
//        for (int i=0;i<nums.length;i++){
//            if (i%2==0){ //even
//                e.add(nums[i]);
//            }else {
//                o.add(nums[i]);
//            }
//        }
//        med=(e.size()-1)/2;
//        root=new TreeNode(e.get(med));
//        for (int i=1;i<e.size()-1;i++){
////            左子树
//            if (i<med) {
//                new TreeNode(e.get(i)).left = new TreeNode(e.get(i - 1));
////                偶数的索引链接到右边
//                new TreeNode(e.get(i-1)).right=new TreeNode(o.get(i));
//            }
//            else if (i==med){
//                new TreeNode(e.get(i)).left = new TreeNode(e.get(i - 1));
//                new TreeNode(e.get(i)).right=new TreeNode(e.get(i+1));
//            }
//            else {
//                new TreeNode(e.get(i)).right=new TreeNode(e.get(i+1));
////                偶数的链接到左边
//                if (e.size()>o.size()) {
//                    new TreeNode(e.get(i)).left = new TreeNode(o.get(i));
//                }
//            }
//        }
////        添加索引为偶数的数组
//        for (int i=0;i<o.size();i++){
//            if (i<med){
//
//            }
//        }

}


class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
