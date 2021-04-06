package lib.sjy.february.剑指offer;


import java.util.Stack;

/**
 * 问题：青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * 问题：写一个函数，输入 n（0 <= n <= 100） ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：
 * <p>
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * <p>
 * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 * <p>
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * 示例 1：
 * <p>
 * 输入：n = 2
 * 输出：1
 * <p>
 * 示例 2：
 * <p>
 * 输入：n = 5
 * 输出：5
 * <p>
 * 斐波那契数列的定义是 f(n+1)=f(n)+f(n−1) ，生成第 n 项的做法有以下几种：
 * <p>
 * （不推荐）递归法：
 * 原理： 把 f(n) 问题的计算拆分成 f(n−1)和 f(n−2) 两个子问题的计算，并递归，以 f(0)和 f(1)为终止条件。
 * 缺点： 大量重复的递归计算，例如 f(n) 和 f(n−1)两者向下递归需要 各自计算 f(n−2) 的值。
 * 记忆化递归法：
 * 原理： 在递归法的基础上，新建一个长度为 n 的数组，用于在递归时存储 f(0) 至 f(n)的数字值，重复遇到某数字则直接从数组取用，避免了重复的递归计算。
 * 缺点： 记忆化存储需要使用 O(N) 的额外空间。
 * (推荐)动态规划：
 * 原理： 以斐波那契数列性质 f(n+1)=f(n)+f(n−1) 为转移方程。
 * 从计算效率、空间复杂度上看，动态规划是本题的最佳解法。
 */
public class offer10_斐波那契数列 {

    public static void main(String[] args) {
        System.out.println("斐波那契数列fib(" + 0 + ")=" + fib(0));
        System.out.println("斐波那契数列fib(" + 1 + ")=" + fib(1));
        System.out.println("斐波那契数列fib(" + 2 + ")=" + fib(2));
        System.out.println("斐波那契数列fib(" + 3 + ")=" + fib(3));
        System.out.println("斐波那契数列fib(" + 4 + ")=" + fib(4));
        System.out.println("斐波那契数列fib(" + 5 + ")=" + fib(5));
        System.out.println("斐波那契数列fib(" + 6 + ")=" + fib(6));
        System.out.println("斐波那契数列fib(" + 7 + ")=" + fib(7));
        System.out.println("斐波那契数列fib(" + 8 + ")=" + fib(8));
        System.out.println("斐波那契数列fib(" + 9 + ")=" + fib(9));
        System.out.println("斐波那契数列fib(" + 10 + ")=" + fib(10));
        System.out.println("斐波那契数列fib(" + 11 + ")=" + fib(11));
        System.out.println("斐波那契数列fib(" + 12 + ")=" + fib(12));
        System.out.println("斐波那契数列fib(" + 13 + ")=" + fib(13));
        System.out.println("斐波那契数列fib(" + 14 + ")=" + fib(14));
        System.out.println("斐波那契数列fib(" + 15 + ")=" + fib(15));
        System.out.println("斐波那契数列fib(" + 16 + ")=" + fib(16));
        System.out.println("斐波那契数列fib(" + 17 + ")=" + fib(17));
        System.out.println("斐波那契数列fib(" + 18 + ")=" + fib(18));
        System.out.println("斐波那契数列fib(" + 19 + ")=" + fib(19));
        System.out.println("斐波那契数列fib(" + 20 + ")=" + fib(20));
    }


    public static int fib(int n) {
        // 递归法 不推荐
//        if (n == 0) {
//            return 0;
//        } else if (n == 1) {
//            return 1;
//        } else {
//            return fib(n - 1) + fib(n - 2);
//        }

        /**
         * 动态规划解析：
         *
         *     状态定义： 设 dp为一维数组，其中 dp[i] 的值代表 斐波那契数列第 i 个数字 。
         *     转移方程： dp[i+1]=dp[i]+dp[i−1]，即对应数列定义 f(n+1)=f(n)+f(n−1)
         *     初始状态： dp[0]=0, dp[1]=1 ，即初始化前两个数字；
         *     返回值： dp[n]，即斐波那契数列的第 n 个数字。
         */
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

}