package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/25 21:46
 * @Description:
 */
public class basic_2n皇后问题 {
    /**
     * 基础练习 2n皇后问题
     * 描述
     *
     * 给定一个n*n的棋盘，棋盘中有一些位置不能放皇后。现在要向棋盘中放入n个黑皇后和n个白皇后，使任意的两个黑皇后都不在同一行、同一列或同一条对角线上，任意的两个白皇后都不在同一行、同一列或同一条对角线上。问总共有多少种放法？n小于等于8。
     *
     *
     * 输入
     *
     * 输入描述:
     *
     * 输入的第一行为一个整数n，表示棋盘的大小。
     *
     * 接下来n行，每行n个0或1的整数，如果一个整数为1，表示对应的位置可以放皇后，如果一个整数为0，表示对应的位置不可以放皇后。
     *
     * 输入样例:
     *
     * 4
     *
     * 1 1 1 1
     *
     * 1 1 1 1
     *
     * 1 1 1 1
     *
     * 1 1 1 1
     *
     *
     * 输出
     *
     * 输出描述:
     *
     * 输出一个整数，表示总共有多少种放法。
     *
     * 输出样例:
     *
     * 2
     *
     * 思路： 搜索题，一行一行放置，放置前判断是否可行
     */
    static int n, count = 0;
    static int map[][];

    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        map = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                map[i][j] = cin.nextInt();
        Put(0, 2);
        System.out.println(count);
    }

    public static void Put(int t, int s) {
        if (t == n) {
            if (s == 2) Put(0, 3);
            else count++;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (map[t][i] != 1) continue;
            if (Check(t, i, s)) {
                map[t][i] = s;
            } else continue;
            Put(t + 1, s);
            map[t][i] = 1;
        }
        return;
    }

    public static boolean Check(int t, int i, int s) {
        for (int q = t - 1; q >= 0; q--) {
            if (map[q][i] == s) return false;
        }
        for (int q = t - 1, w = i - 1; q >= 0 && w >= 0; q--, w--) {
            if (map[q][w] == s) return false;
        }
        for (int q = t - 1, w = i + 1; q >= 0 && w <= n - 1; q--, w++) {
            if (map[q][w] == s) return false;
        }
        return true;
    }
}