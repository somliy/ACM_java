package LanQiao.BasicExercise;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/22 16:28
 * @Description:
 */
public class basic_阶乘计算 {
    /**
     * 基础练习 阶乘计算
     * 描述
     *
     * 输入一个正整数n，输出n!的值。
     *
     * 其中n!=1*2*3*…*n。
     *
     *
     * 输入
     *
     * 输入描述:
     *
     * n!可能很大，而计算机能表示的整数范围有限，需要使用高精度计算的方法。使用一个数组A来表示一个大整数a，A[0]表示a的个位，A[1]表示a的十位，依次类推。
     *
     * 将a乘以一个整数k变为将数组A的每一个元素都乘以k，请注意处理相应的进位。
     *
     * 首先将a设为1，然后乘2，乘3，当乘到n时，即得到了n!的值。
     *
     * 输入样例:
     *
     * 10
     *
     *
     * 输出
     *
     * 输出描述:
     *
     * 输入包含一个正整数n，n<=1000。
     *
     * 输出样例:
     *
     * 3628800
     *
     * 思路： java大数
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        BigDecimal ans = new BigDecimal("1");
        for(int i = 2; i <= n; i++) {
            ans = ans.multiply(new BigDecimal(i));
        }
        System.out.println(ans);
    }
}
