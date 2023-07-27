package org.lovezcy.base;

import org.junit.Before;
import org.junit.Test;
import org.lovezcy.Main;

import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: killpie
 * @Date: 2023/7/23 14:02
 * @Description: BinarySearchTree测试类
 */
public class BinarySearchTreeTest {

    BinarySearchTree binarySearchTree = new BinarySearchTree();
    BinarySearchTree smallBinarySearchTree = new BinarySearchTree();

    /**
     * 构造一个树
     */

    @Before
    public void constructTree(){
        binarySearchTree.insert(5);
        binarySearchTree.insert(3);
        binarySearchTree.insert(7);
        binarySearchTree.insert(2);
        binarySearchTree.insert(4);
        binarySearchTree.insert(6);
        binarySearchTree.insert(8);
        binarySearchTree.insert(1);
        binarySearchTree.insert(9);
        binarySearchTree.insert(10);
        binarySearchTree.insert(11);
        binarySearchTree.insert(12);

        smallBinarySearchTree.insert(1);
        smallBinarySearchTree.insert(5);


    }

    /**
     * 单测
     */
    @Test
    public void traverse() {
        binarySearchTree.preOrder();
        binarySearchTree.inOrder();
        binarySearchTree.postOrder();
    }

    /**
     * 计算树的高度
     */

    @Test
    public void depth(){
        preOrder(binarySearchTree.getRoot());
        System.out.println(res);
    }

    int res = 0;
    int depth = 0;

    public void preOrder(TreeNode node){
        if (node == null){
            res = Math.max(res,depth);
            return;
        }
        depth++;
        preOrder(node.left);
        preOrder(node.right);
        depth--;
    }

    @Test
    public void preorderTraverseTest(){
        List<Integer>  list = preorderTraverse(binarySearchTree.getRoot());
        list.stream()
                .forEach(System.out::print);
    }

    // 返回前序遍历结果
    List<Integer> preorderTraverse(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root == null){
            return list;
        }
        list.add(root.val);
        list.addAll(preorderTraverse(root.left));
        list.addAll(preorderTraverse(root.right));
        return list;
    }

    @Test
    public void testDiameterOfBinaryTree(){
        int diameter = diameterOfBinaryTree(smallBinarySearchTree.getRoot());
        System.out.println(diameter);
    }


    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null){
            return 0;
        }
        diameter(root);
        return diameter;
    }

    int diameter = 0;//记录两个节点的最长长度
    /**
     * 记录一棵树两个节点最长的距离
     */
    int diameter(TreeNode root) {
        if (root == null){
            return 0;
        }

        int left = diameter(root.left);
        int right = diameter(root.right);
        diameter = Math.max(left+right,diameter);

        return Math.max(left,right)+1;
    }


    /**
     * 计算树的最大深度
     */

    int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left,right)+1;
    }

    @Test
    public void testMaxDepth(){
        int depth = maxDepth(smallBinarySearchTree.getRoot());
        System.out.println(depth);
    }



}
