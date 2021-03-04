package lib.sjy.february.剑指offer;


import java.util.Stack;

/**
 * 写一个函数，输入 n（0 <= n <= 100） ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：
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
        int temp  = n;
        if (temp == 0){
            return 0;
        }else if ( temp== 1){
            return 1;
        }else{
            return fib(n - 1) + fib(n - 2);
        }
    }
}