package LanQiao.BasicExercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/18 18:31
 * @Description:
 */
public class basic_数列排序 {
    /**
     * 基础练习 数列排序
     * 描述
     *
     * 给定一个长度为n的数列，将这个数列按从小到大的顺序排列。1<=n<=200
     *
     *
     * 输入
     *
     * 输入描述:
     *
     * 第一行为一个整数n。
     *
     * 第二行包含n个整数，为待排序的数，每个整数的绝对值小于10000。
     *
     * 输入样例:
     *
     * 5
     *
     * 8 3 6 4 9
     *
     *
     * 输出
     *
     * 输出描述:
     *
     * 输出一行，按从小到大的顺序输出排序后的数列。
     *
     * 输出样例:
     *
     * 3 4 6 8 9
     *
     * 思路： 排序
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (i != n - 1) System.out.print(arr[i] + " ");
            else System.out.println(arr[i]);
        }
    }

}
