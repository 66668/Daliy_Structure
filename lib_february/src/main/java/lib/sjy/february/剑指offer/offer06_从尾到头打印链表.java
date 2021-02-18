package lib.sjy.february.剑指offer;

import java.util.Stack;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 思路：用栈打印
 */
public class offer06_从尾到头打印链表 {
    public static void main(String[] args) {

    }

    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
       while (temp != null){
           stack.push(temp);
           temp = temp.next;
       }
        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0; i < size; i++) {
            print[i] = stack.pop().val;
        }
        return print;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}