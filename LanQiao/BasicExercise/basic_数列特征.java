package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/18 17:05
 * @Description:
 */
public class basic_数列特征 {
    /**
     * 基础练习 数列特征
     * 描述
     *
     * 给出n个数，找出这n个数的最大值，最小值，和。
     *
     *
     * 输入
     *
     * 输入描述:
     *
     * 第一行为整数n，表示数的个数。
     *
     * 第二行有n个数，为给定的n个数，每个数的绝对值都小于10000。
     *
     * 输入样例:
     *
     * 5
     *
     * 1 3 -2 4 5
     *
     *
     * 输出
     *
     * 输出描述:
     *
     * 输出三行，每行一个整数。第一行表示这些数中的最大值，第二行表示这些数中的最小值，第三行表示这些数的和。
     *
     * 输出样例:
     *
     * 5
     *
     * -2
     *
     * 11
     *
     * 思路： 直接记录即可
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;
        for (int i = 1; i <= n; i++) {
            int x = cin.nextInt();
            sum += x;
            max = Math.max(max, x);
            min = Math.min(min, x);
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}
