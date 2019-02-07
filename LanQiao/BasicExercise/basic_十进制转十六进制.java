package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/17 22:50
 * @Description:
 */
public class basic_十进制转十六进制 {
    /**
     * 基础练习 十进制转十六进制
     * 描述
     *
     * 十六进制数是在程序设计时经常要使用到的一种整数的表示方式。它有0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F共16个符号，分别表示十进制数的0至15。十六进制的计数方法是满16进1，所以十进制数16在十六进制中是10，而十进制的17在十六进制中是11，以此类推，十进制的30在十六进制中是1E。
     *
     * 给出一个非负整数，将它表示成十六进制的形式。
     *
     *
     * 输入
     *
     * 输入描述:
     *
     * 输入包含一个非负整数a，表示要转换的数。0<=a<=2147483647
     *
     * 输入样例:
     *
     * 30
     *
     *
     * 输出
     *
     * 输出描述:
     *
     * 输出这个整数的16进制表示
     *
     * 输出样例:
     *
     * 1E
     *
     * 思路： 直接利用库函数
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.println(Integer.toHexString(n).toUpperCase());
    }
}
