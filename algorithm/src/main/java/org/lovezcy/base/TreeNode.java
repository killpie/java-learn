package org.lovezcy.base;

/**
 * @Auther: killpie
 * @Date: 2023/7/23 13:46
 * @Description: TreeNode
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val){
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
