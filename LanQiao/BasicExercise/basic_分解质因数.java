package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/22 11:05
 * @Description:
 */
public class basic_分解质因数 {
    /**
     * 基础练习 分解质因数
     * 描述
     *
     * 求出区间[a,b]中所有整数的质因数分解。
     *
     *
     * 输入
     *
     * 输入描述:
     *
     * 输入两个整数a，b。
     *
     * 输入样例:
     *
     * 3 10
     *
     *
     * 输出
     *
     * 输出描述:
     *
     * 每行输出一个数的分解，形如k=a1*a2*a3...(a1<=a2<=a3...，k也是从小到大的)(具体可看样例)
     *
     * 输出样例:
     *
     * 3=3
     *
     * 4=2*2
     *
     * 5=5
     *
     * 6=2*3
     *
     * 7=7
     *
     * 8=2*2*2
     *
     * 9=3*3
     *
     * 10=2*5
     *
     * 思路： 除尽后换下一个数
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        for (int i = a; i <= b; i++) {
            solve(i);
        }
    }

    public static void solve(int n) {
        int x = n;
        System.out.print(n + "=");
        for (int i = 2; i <= x; i++) {
            while (x % i == 0) {
                if (n == x) System.out.print(i);
                else System.out.print("*" + i);
                x /= i;
            }
        }
        System.out.println();
    }
}
