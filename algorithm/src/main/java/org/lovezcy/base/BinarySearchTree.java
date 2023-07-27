package org.lovezcy.base;

/**
 * @Auther: killpie
 * @Date: 2023/7/23 13:46
 * @Description: 二叉搜索树（Binary Search Tree）类
 */
public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
    }

    public BinarySearchTree(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    /**
     * 插入节点
     * @param val
     */
    public void insert(int val){
        if (root == null){
            root = new TreeNode(val);
            return;
        }
        TreeNode cur = root;
        while (cur != null){
            if (cur.val > val){
                if (cur.left == null){
                    cur.left = new TreeNode(val);
                    return;
                }
                cur = cur.left;
            }else {
                if (cur.right == null){
                    cur.right = new TreeNode(val);
                    return;
                }
                cur = cur.right;
            }
        }
    }

    /**
     * 删除节点
     * @param val
     */
    public void delete(int val){
        TreeNode cur = root;
        TreeNode parent = null;
        while (cur != null && cur.val != val){
            parent = cur;
            if (cur.val > val){
                cur = cur.left;
            }else {
                cur = cur.right;
            }
        }
        if (cur == null){
            return;
        }
        // 要删除的节点有两个子节点
        if (cur.left != null && cur.right != null){
            TreeNode minNode = cur.right;
            TreeNode minNodeParent = cur;
            while (minNode.left != null){
                minNodeParent = minNode;
                minNode = minNode.left;
            }
            cur.val = minNode.val;
            cur = minNode;
            parent = minNodeParent;
        }
        // 删除节点是叶子节点或者仅有一个子节点
        TreeNode child;
        if (cur.left != null){
            child = cur.left;
        }else if (cur.right != null){
            child = cur.right;
        }else {
            child = null;
        }
        if (parent == null){
            root = child;
        }else if (parent.left == cur){
            parent.left = child;
        }else {
            parent.right = child;
        }
    }

    /**
     * 查找节点
     * @param val
     * @return
     */
    public TreeNode find(int val) {
        TreeNode cur = root;
        while (cur != null) {
            if (cur.val == val) {
                return cur;
            } else if (cur.val > val) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return null;
    }

    /**
     * 前序遍历, 根左右
     */
    public void preOrder() {
        System.out.println("前序遍历：");
        preOrder(root);
        System.out.println("");

    }

    public void preOrder(TreeNode node){
        if (node == null){
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * 中序遍历,左根右
     */
    public void inOrder() {
        System.out.println("中序遍历：");
        inOrder(root);
        System.out.println("");

    }


    public void inOrder(TreeNode node){
        if (node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }

    /**
     * 后序遍历,左右根
     */
    public void postOrder() {
        System.out.println("后序遍历：");
        postOrder(root);
        System.out.println("");
    }

    public void postOrder(TreeNode node){
        if (node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");
    }


}
