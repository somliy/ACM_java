package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/17 22:59
 * @Description:
 */
public class basic_十六进制转十进制 {
    /**
     * 基础练习 十六进制转十进制
     * 描述
     *
     * 从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
     *
     * 注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
     *
     *
     * 输入
     *
     * 输入描述:
     *
     * 输入样例:
     *
     * FFFF
     *
     *
     * 输出
     *
     * 输出描述:
     *
     * 输出样例:
     *
     * 65535
     *
     * 思路： 利用库函数
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        Long ans = Long.parseLong(str, 16);
        System.out.println(ans);
    }
}
