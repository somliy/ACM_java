package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/18 17:01
 * @Description:
 */
public class basic_字母图形 {
    /**
     * 基础练习 字母图形
     * 描述
     *
     * 利用字母可以组成一些美丽的图形，下面给出了一个例子：
     *
     * ABCDEFG
     *
     * BABCDEF
     *
     * CBABCDE
     *
     * DCBABCD
     *
     * EDCBABC
     *
     * 这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。
     *
     *
     * 输入
     *
     * 输入描述:
     *
     * 输入一行，包含两个整数n和m，分别表示你要输出的图形的行数的列数。
     *
     * 输入样例:
     *
     * 5 7
     *
     *
     * 输出
     *
     * 输出描述:
     *
     * 输出n行，每个m个字符，为你的图形。
     *
     * 输出样例:
     *
     * ABCDEFG
     *
     * BABCDEF
     *
     * CBABCDE
     *
     * DCBABCD
     *
     * EDCBABC
     *
     *
     * 思路： 初始化把字符串规定好，输出对应的段即可
     * @param args
     */
    public static void main(String[] args) {
        char[] str = new char[51];
        for (int i = 0; i < 26; i++) {
            str[25 + i] = str[25 - i] = (char) ('A' + i);
        }
        Scanner cin = new Scanner(System.in);
        String string = String.valueOf(str);
        int n = cin.nextInt();
        int m = cin.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(string.substring(25 - i, 25 - i + m));
        }
    }
}
