package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/18 17:53
 * @Description:
 */
public class basic_查找整数 {
    /**
     * 基础练习 查找整数
     * 描述
     *
     * 给出一个包含n个整数的数列，问整数a在数列中的第一次出现是第几个。
     *
     *
     * 输入
     *
     * 输入描述:
     *
     * 第一行包含一个整数n。
     *
     * 第二行包含n个非负整数，为给定的数列，数列中的每个数都不大于10000。
     *
     * 第三行包含一个整数a，为待查找的数。
     *
     * 输入样例:
     *
     * 6
     *
     * 1 9 4 8 3 9
     *
     * 9
     *
     *
     * 输出
     *
     * 输出描述:
     *
     * 如果a在数列中出现了，输出它第一次出现的位置(位置从1开始编号)，否则输出-1。
     *
     * 输出样例:
     *
     * 2
     *
     * 思路： 直接找
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }
        int ans = -1;
        int x = cin.nextInt();
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                ans = i + 1;
                break;
            }
        }
        System.out.println(ans);
    }
}
