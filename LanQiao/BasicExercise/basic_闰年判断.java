package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/17 22:49
 * @Description:
 */
public class basic_闰年判断 {
    /**
     * 基础练习 闰年判断
     * 描述
     *
     * 给定一个年份，判断这一年是不是闰年。
     *
     * 当以下情况之一满足时，这一年是闰年：
     *
     * 1. 年份是4的倍数而不是100的倍数；
     *
     * 2. 年份是400的倍数。
     *
     * 其他的年份都不是闰年。
     *
     *
     * 输入
     *
     * 输入描述:
     *
     * 输入包含一个整数y，表示当前的年份。
     *
     * 输入样例:
     *
     * 2013
     *
     *
     * 输出
     *
     * 输出描述:
     *
     * 输出一行，如果给定的年份是闰年，则输出yes，否则输出no。
     *
     * 说明：当试题指定你输出一个字符串作为结果（比如本题的yes或者no，你需要严格按照试题中给定的大小写，写错大小写将不得分。
     * 输出样例:
     * no
     *
     * 思路： 已经给出判定方法了，只需判断即可
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int year = cin.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println("yes");
        else System.out.println("no");
    }

}
