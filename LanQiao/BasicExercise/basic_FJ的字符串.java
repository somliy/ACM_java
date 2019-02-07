package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/22 15:43
 * @Description:
 */
public class basic_FJ的字符串 {
    /**
     *基础练习 FJ的字符串
     * 描述
     *
     * FJ在沙盘上写了这样一些字符串：
     *
     * A1 = “A”
     *
     * A2 = “ABA”
     *
     * A3 = “ABACABA”
     *
     * A4 = “ABACABADABACABA”
     *
     * … …
     *
     * 你能找出其中的规律并写所有的数列AN吗？
     *
     *
     * 输入
     *
     * 输入描述:
     *
     * 仅有一个数：N ≤ 26。
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
     * 请输出相应的字符串AN，以一个换行符结束。输出中不得含有多余的空格或换行、回车符。
     *
     * 输出样例:
     *
     * ABACABA
     *
     * 思路： 拼接字符串即可
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        char[] ch = new char[26];
        for (int i = 0; i < 26; i++) {
            ch[i] = (char) ('A' + i);
        }
        int n = cin.nextInt();
        String ans = "A", tmp = "";
        if(n == 1) {System.out.println(ans);return;}
        for (int i = 1; i < n; i++) {
            tmp = ans;
            ans += ch[i];
            ans += tmp;
        }
        System.out.println(ans);
    }
}
