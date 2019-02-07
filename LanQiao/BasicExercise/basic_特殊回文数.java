package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/18 18:12
 * @Description:
 */
public class basic_特殊回文数 {
    /**
     * 基础练习 特殊回文数
     * 描述
     *
     * 123321是一个非常特殊的数，它从左边读和从右边读是一样的。
     *
     * 输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
     *
     *
     * 输入
     *
     * 输入描述:
     *
     * 输入一行，包含一个正整数n。
     *
     * 输入样例:
     *
     * 52
     *
     *
     * 输出
     *
     * 输出描述:
     *
     * 按从小到大的顺序输出满足条件的整数，每个整数占一行。
     *
     * 输出样例:
     *
     * 899998
     *
     * 989989
     *
     * 998899
     *
     * 思路： 直接输出
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int sum = cin.nextInt();
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if (i * 2 + j * 2 + k == sum)
                        System.out.println("" + i + j + k + j + i);
                }
            }
        }
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if (i * 2 + j * 2 + k * 2 == sum)
                        System.out.println("" + i + j + k + k + j + i);
                }
            }
        }
    }
}
