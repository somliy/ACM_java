package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/18 17:56
 * @Description:
 */
public class basic_特殊数字 {
    /**
     * 基础练习 特殊的数字
     * 描述
     *
     * 153是一个非常特殊的数，它等于它的每位数字的立方和，即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
     *
     *
     * 输入
     *
     * 输入描述:
     *
     * 按从小到大的顺序输出满足条件的三位十进制数，每个数占一行。
     *
     * 输入样例:
     *
     *
     * 输出
     *
     * 输出描述:
     *
     * 输出样例:
     *
     * 思路： 判断每个数字即可
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        for (int i = 100; i <= 999; i++) {
            int a = i / 100;
            int b = (i - a * 100) / 10;
            int c = i % 10;
            if (a * a * a + b * b * b + c * c * c == i)
                System.out.println(i);
        }
    }
}
