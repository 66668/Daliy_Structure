package lib.sjy.february.剑指offer;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树（以前根据二叉树，打印前序/中序/后续遍历，该题正好反过来问）
 * 解题：需要挖掘前序遍历和中序遍历的性质解题。
 * 知识点：
 * （1）同一颗子树的前序遍历和中序遍历的长度是相同的（拿到长度可以进行处理）
 * （2）查找根节点，直接用遍历耗时，最好使用映射保存处理。映射的key为数组的值，val为数组的位置（很关键）
 */
public class offer09_用两个栈实现队列 {
    public static void main(String[] args) {
    }
}

class CQueue {
    Stack<Integer> stack1;//执行插入操作
    Stack<Integer> stack2;//执行删除操作

    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (!stack2.isEmpty()) { //stack2有数据，就删除
            return stack2.pop();
        } else if (stack2.isEmpty() && !stack1.isEmpty()) {//stack2没有数据，但是satck1有数据，将satck1所有数据转移给stack2,然后stack2执行删除操作
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        } else if (stack2.isEmpty() && stack1.isEmpty()) {
            return -1;
        }
        return -1;
    }
}