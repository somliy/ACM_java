package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/18 19:55
 * @Description:
 */
public class basic_时间转换 {
    /**
     * 基础练习 时间转换
     * 描述
     *
     * 给定一个以秒为单位的时间t，要求用“<H>:<M>:<S>”的格式来表示这个时间。<H>表示时间，<M>表示分钟，而<S>表示秒，它们都是整数且没有前导的“0”。例如，若t=0，则应输出是“0:0:0”；若t=3661，则输出“1:1:1”。
     *
     *
     * 输入
     *
     * 输入描述:
     *
     * 输入只有一行，是一个整数t（0<=t<=86399）。
     *
     * 输入样例:
     *
     * 0
     *
     *
     * 输出
     *
     * 输出描述:
     *
     * 输出只有一行，是以“<H>:<M>:<S>”的格式所表示的时间，不包括引号。
     *
     * 输出样例:
     *
     * 0:0:0
     *
     * 思路： 计算输出
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int h = n / 3600;
        int m = (n - h * 3600) / 60;
        int s = n % 60;
        System.out.println(h + ":" + m + ":" + s);
    }
}
