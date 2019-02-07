package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/18 19:59
 * @Description:
 */
public class basic_字符串对比 {
    /**
     * 基础练习 字符串对比
     * 描述
     *
     * 给定两个仅由大写字母或小写字母组成的字符串(长度介于1到10之间)，它们之间的关系是以下4中情况之一：
     *
     * 1：两个字符串长度不等。比如 Beijing 和 Hebei
     *
     * 2：两个字符串不仅长度相等，而且相应位置上的字符完全一致(区分大小写)，比如 Beijing 和 Beijing
     *
     * 3：两个字符串长度相等，相应位置上的字符仅在不区分大小写的前提下才能达到完全一致（也就是说，它并不满足情况2）。比如 beijing 和 BEIjing
     *
     * 4：两个字符串长度相等，但是即使是不区分大小写也不能使这两个字符串一致。比如 Beijing 和 Nanjing
     *
     * 编程判断输入的两个字符串之间的关系属于这四类中的哪一类，给出所属的类的编号。
     *
     *
     * 输入
     *
     * 输入描述:
     *
     * 包括两行，每行都是一个字符串
     *
     * 输入样例:
     *
     * BEIjing
     *
     *  beiJing
     *
     * 输出
     *
     * 输出描述:
     *
     * 仅有一个数字，表明这两个字符串的关系编号
     *
     * 输出样例:
     *
     * 3
     *
     * 思路： 利用库函数
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str1 = cin.nextLine();
        String str2 = cin.nextLine();
        if (str1.length() != str2.length()) System.out.println(1);
        else if (str1.equals(str2)) System.out.println(2);
        else if (str1.toLowerCase().equals(str2.toLowerCase())) System.out.println(3);
        else System.out.println(4);
    }
}
