package lib.sjy.february.剑指offer;

import java.util.Arrays;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * StringBuilder实现
 */
public class offer05_替换空字符串 {
    public static void main(String[] args) {
        int[][] a = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        boolean b = findNumberIn2DArray(a, 5);
        boolean c = findNumberIn2DArray(a, 17);
    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int[] lineAr = matrix[i];
            //TODO 此处要判断数组长度
            if (lineAr.length <= 0) {
                return false;
            }
            if (target < lineAr[0] || target > lineAr[lineAr.length - 1]) {
                System.out.println("行不满足 = " + Arrays.toString(lineAr));
                continue;
            }
            for (int j = 0; j < lineAr.length; j++) {
                if (target == lineAr[j]) {
                    System.out.println("有数据");
                    return true;
                }
            }
        }
        return false;
    }
}