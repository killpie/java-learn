package org.lovezcy.leetcode;

/**
 * @Auther: killpie
 * @Date: 2023/7/26 22:09
 * @Description: 509 题「斐波那契数」
 */
public class 零五零九斐波那契数509 {


    public static void main(String[] args) {
        System.out.println(new 零五零九斐波那契数509().fib(0));
    }
    public int fib(int n) {
        int[] array = new int[n+1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <n+1; i++) {
            array[i] = array[i-1]+array[i-2];
        }
        return array[n];
    }

    public int fib1(int n, int[] array) {
        if (n == 1 || n == 2){
            return 1;
        }
        return array[n-1]+array[n-2];
    }
}
