package lib.sjy.february.剑指offer;


import java.util.HashMap;
import java.util.Map;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树（以前根据二叉树，打印前序/中序/后续遍历，该题正好反过来问）
 * 解题：需要挖掘前序遍历和中序遍历的性质解题。
 * 知识点：
 * （1）同一颗子树的前序遍历和中序遍历的长度是相同的（拿到长度可以进行处理）
 * （2）查找根节点，直接用遍历耗时，最好使用映射保存处理。映射的key为数组的值，val为数组的位置（很关键）
 */
public class offer07_重建该二叉树 {
    static Map<Integer, Integer> inorderMap = new HashMap<>();

    public static void main(String[] args) {
        int[] preorder = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        TreeNode node = buildTree(preorder, inorder);
    }

    //利用两个打印确定左右节点的具体位置
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null) {
            return null;
        }
        //对中序遍历，进行map转换
        for (int key = 0; key < inorder.length; key++) {
            int val = inorder[key];
            inorderMap.put(key, val);
        }
        int n = preorder.length;
        return myBuildTree(preorder, inorder, 0, n - 1, 0, n - 1);
    }

    //递归处理左子树和右子树的拼接

    /**
     *
     * @param preorder 前序遍历数组
     * @param inorder 中序遍历数组
     * @param preorder_left  左边界
     * @param preorder_right 右边界
     * @param inorder_left 左边界
     * @param inorder_right 右边界
     * @return 重建的二叉树
     */
    public static TreeNode myBuildTree(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right) {
        if (preorder_left > preorder_right) {
            return null;
        }
        //前序遍历的第一个节点是根节点
        int root_pre_val = preorder[0];//对应map的key
        TreeNode root = new TreeNode(root_pre_val);

        int root_in_pos = inorderMap.get(root_pre_val);//拿到root对应inorder的坐标
        int left_in_len = root_in_pos - preorder_left; //找到左子树的长度

        //左子树数组递归拼接
        //先序遍历中「从 左边界+1 开始的 size_left_subtree」个元素
        // 就对应了
        // 中序遍历中「从 左边界 开始到 根节点定位-1」的元素
        root.left = myBuildTree(preorder,
                inorder,
                preorder_left + 1,//前序的
                preorder_left + left_in_len,
                inorder_left,
                root_in_pos - 1);

        // 先序遍历中「从 左边界+1+左子树节点数目 开始到 右边界」的元素
        // 就对应了
        // 中序遍历中「从 根节点定位+1 到 右边界」的元素
        root.right = myBuildTree(preorder,
                inorder,
                preorder_left + 1 + left_in_len,
                preorder_right,
                root_in_pos + 1,
                inorder_right
        );
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}