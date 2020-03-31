package com.jike.time.space.class3;


import java.util.List;

/**
 * 206. 反转链表
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL等同于
 * NULL<-1<-2<-3<-4<-5
 */
public class LinkedListReverseTiMu {

    //链表单节点
    public class ListNode {
        int val;//节点数据
        ListNode next;//下个节点的指针

        //constructor
        public ListNode(int val) {
            this.val = val;
        }
    }


    public class Solution {

        /**
         * TODO:没怎么看懂有时间再来钻研
         * 按照递归的方式：反转链表解法2
         */
        public ListNode reverseListByDiGui(ListNode head){
            if (head==null||head.next==null) return head;
            ListNode p = reverseListByDiGui(head.next);
            head.next.next = head;
            head.next = null;
            return p;
        }

        /**
         * 反转链表默写5
         */
        public ListNode reverseList5(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;

            while (curr != null) {
                ListNode nextTemp = curr.next;
                curr.next = prev;

                //准备下次循环的数据
                prev = curr;
                curr = nextTemp;
            }

            return prev;
        }


        /**
         * 0 ms	38.2 MB
         * 反转链表默写4
         */
        public ListNode reverseList4(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;

            while (curr != null) {
                ListNode nextTemp = curr.next;
                curr.next = prev;

                //下循环前的准备
                prev = curr;
                curr = nextTemp;
            }
            return prev;
        }


        /**
         * 反转链表默写3
         */
        public ListNode reverseList3(ListNode head) {

            ListNode prev = null;
            ListNode curr = head;
            //每个当前节点的循环操作
            while (curr != null) {
                ListNode nextTemp = curr.next;
                curr.next = prev;//TODO：核心操作

                //TODO：下次循环前的准备
                prev = curr;
                curr = nextTemp;
            }
            return prev;
        }

        /**
         * 反转链表默写2
         */
        public ListNode reverseList2(ListNode head) {//head是头结点
            ListNode prev = null;
            ListNode curr = head;
            while (curr != null) {
                ListNode nextTemp = curr.next;
                curr.next = prev;//TODO：核心操作，将指针指向上一节点

                //下一循环前的准备
                prev = curr;
                curr = nextTemp;
            }

            return prev;
        }


        /**
         * 反转链表默写1
         */
        public ListNode reverseList1(ListNode head) {
            //当前传过来的节点head是头结点，那么上一个节点prev理所当然是null
            ListNode prev = null;
            ListNode curr = head;//当前节点
            while (curr != null) {//当前curr节点为null就是尾结点了，直接返回前也是尾结点prev
                ListNode nextTemp = curr.next;//将下一节点保存起来，因为当前节点的下一节点地址即将发生变化

                curr.next = prev;
                //TODO：当前节点的事情已经完成

                //TODO：接下来为下一次循环做准备
                prev = curr;
                curr = nextTemp;
            }
            //TODO：返回的是链表中的头个节点，在反转前是尾结点
            return prev;
        }


        /**
         * 反转链表
         */
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;//存储上一个元素
            ListNode curr = head;//存储当前元素
            while (curr != null) {
                ListNode nextTemp = curr.next;
                curr.next = prev;//将下一个元素指向之前的上一个元素（反转操作）
                prev = curr;//将上一个元素指向当前
                curr = nextTemp;
            }
            //返回之前的上一个元素
            return prev;
        }
    }
}
