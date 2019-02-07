package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/22 15:35
 * @Description:
 */
public class basic_Sine之舞 {
    /**
     * 基础练习 Sine之舞
     * 描述
     *
     * 最近FJ为他的奶牛们开设了数学分析课，FJ知道若要学好这门课，必须有一个好的三角函数基本功。所以他准备和奶牛们做一个“Sine之舞”的游戏，寓教于乐，提高奶牛们的计算能力。
     *
     * 不妨设
     *
     * An=sin(1–sin(2+sin(3–sin(4+...sin(n))...)
     *
     * Sn=(...(A1+n)A2+n-1)A3+...+2)An+1
     *
     * FJ想让奶牛们计算Sn的值，请你帮助FJ打印出Sn的完整表达式，以方便奶牛们做题。
     *
     *
     * 输入
     *
     * 输入描述:
     *
     * 仅有一个数：N<201。
     *
     * 输入样例:
     *
     * 3
     *
     *
     * 输出
     *
     * 输出描述:
     *
     * 请输出相应的表达式Sn，以一个换行符结束。输出中不得含有多余的空格或换行、回车符。
     *
     * 输出样例:
     *
     * ((sin(1)+3)sin(1–sin(2))+2)sin(1–sin(2+sin(3)))+1
     *
     * 思路： 递归解决，分开解决，然后合一起即为答案
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        sn(n);
        System.out.println();
    }

    public static void an(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("sin(" + i);
            if (i < n)
                System.out.print(i % 2 == 0 ? '+' : '-');
        }
        for (int i = 1; i <= n; i++)
            System.out.print(')');
    }

    public static void sn(int n) {
        for (int i = 1; i < n; i++)
            System.out.print('(');
        for (int i = n; i >= 1; i--) {
            an(n - i + 1);
            System.out.print('+');
            System.out.print(i);
            if (i != 1) System.out.print(')');
        }
    }
}
