package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/22 11:20
 * @Description:
 */
public class basic_矩阵乘法 {
    /**
     * 基础练习 矩阵乘法
     * 描述
     *
     * 给定一个N阶矩阵A，输出A的M次幂（M是非负整数）
     *
     * 例如：
     *
     * A =
     *
     * 1 2
     *
     * 3 4
     *
     * A的2次幂
     *
     * 7 10
     *
     * 15 22
     *
     *
     * 输入
     *
     * 输入描述:
     *
     * 第一行是一个正整数N、M（1<=N<=30, 0<=M<=5），表示矩阵A的阶数和要求的幂数
     *
     * 接下来N行，每行N个绝对值不超过10的非负整数，描述矩阵A的值
     *
     * 输入样例:
     *
     * 2 2
     *
     * 1 2
     *
     * 3 4
     *
     *
     * 输出
     *
     * 输出描述:
     *
     * 输出共N行，每行N个整数，表示A的M次幂所对应的矩阵。相邻的数之间用一个空格隔开
     *
     * 输出样例:
     *
     * 7 10
     *
     * 15 22
     *
     * 思路： 矩阵快速幂模板题
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        long[][] a = new long[n][n];
        long[][] res = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = cin.nextLong();
            }
        }
        res = mut(m, n, a);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
                if (j == n - 1) System.out.println();
            }
        }
    }

    public static long[][] mut(int k, int n, long[][] A) {
        long[][] res = new long[n][n];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                if (i == j) {
                    res[i][j] = 1;
                } else {
                    res[i][j] = 0;
                }
            }
        }
        while (k != 0) {
            if ((k & 1) == 1) res = f(res, A);
            k >>= 1;
            A = f(A, A);
        }
        return res;
    }

    public static long[][] f(long[][] A, long[][] B) {
        long res[][] = new long[A.length][B.length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    res[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return res;
    }
}
