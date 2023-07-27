package org.lovezcy.leetcode;

/**
 * @Auther: killpie
 * @Date: 2023/7/13 23:06
 * <a href="https://leetcode.cn/problems/merge-two-sorted-lists/">21. 合并两个有序链表</a>
 * @Description: 21. 合并两个有序链表
 */
class 零零二一合并两个有序链表21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list2==null){
            return list1;
        }
        if (list1 == null){
            return list2;
        }


        ListNode source = null;
        ListNode target = null;
        //遍历source插入target, 头节点小为target
        if (list1.val <= list2.val){
            source = list2;
            target = list1;
        }else {
            source = list1;
            target = list2;
        }


        ListNode head = target;


        //将list1插入到list2中
        ListNode preNode = null;
        while (source!=null){
            while (target!=null){
                if (source==null){
                    break;
                }
                if ( source.val < target.val){
                    ListNode sourceTemp = source;
                    ListNode sourceNext = source.next;
                    if (preNode != null){
                        preNode.next = sourceTemp;
                        sourceTemp.next = target;
                    }
                    source = sourceNext;

                }else {
                    preNode = target;
                    target = target.next;
                }

            }
            //再次场景下余下的list1都比list2大
            if (source!=null){
                preNode.next = source;
                break;
            }
        }
       return head;
    }

    public static void main(String[] args) {
        ListNode listNode1 = buildListNode1();
        ListNode listNode2 = buildListNode2();

        ListNode listNode = new 零零二一合并两个有序链表21().mergeTwoLists(listNode1, listNode2);

        //打印listNode
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    //构造一个长度为4的链表
    public static ListNode buildListNode1(){
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(5);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        return listNode;
    }

    public static ListNode buildListNode2(){
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(5);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        return listNode;
    }
}


