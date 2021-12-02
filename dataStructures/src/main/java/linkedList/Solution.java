package linkedList;
//import com.google.common.collect.Lists;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-08-31 10:27
 */
public class Solution {
    /**
     * 移除链表中的元素
     * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
     * 示例：
     * 给定：1-->2-->6-->3-->4-->5--6   val=6
     * 返回：1-->2-->3-->4-->5
     */
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {//头结点为空
            return null;
        }
        //头结点不为空，val的值=头结点的值
        while (head != null && head.val == val) {
            head = head.next;
        }
        //val的值在中间
        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

    }

}
