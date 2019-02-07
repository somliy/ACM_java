package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/22 15:00
 * @Description:
 */
public class basic_数的读法 {
    /**
     * 基础练习 数的读法
     * 描述
     *
     * Tom教授正在给研究生讲授一门关于基因的课程，有一件事情让他颇为头疼：一条染色体上有成千上万个碱基对，它们从0开始编号，到几百万，几千万，甚至上亿。
     *
     * 比如说，在对学生讲解第1234567009号位置上的碱基时，光看着数字是很难准确的念出来的。
     *
     * 所以，他迫切地需要一个系统，然后当他输入12 3456 7009时，会给出相应的念法：
     *
     * 十二亿三千四百五十六万七千零九
     *
     * 用汉语拼音表示为
     *
     * shi er yi san qian si bai wu shi liu wan qi qian ling jiu
     *
     * 这样他只需要照着念就可以了。
     *
     * 你的任务是帮他设计这样一个系统：给定一个阿拉伯数字串，你帮他按照中文读写的规范转为汉语拼音字串，相邻的两个音节用一个空格符格开。
     *
     * 注意必须严格按照规范，比如说“10010”读作“yi wan ling yi shi”而不是“yi wan ling shi”，“100000”读作“shi wan”而不是“yi shi wan”，“2000”读作“er qian”而不是“liang qian”。
     *
     *
     * 输入
     *
     * 输入描述:
     *
     * 有一个数字串，数值大小不超过2,000,000,000。
     *
     * 输入样例:
     *
     * 1234567009
     *
     *
     * 输出
     *
     * 输出描述:
     *
     * 是一个由小写英文字母，逗号和空格组成的字符串，表示该数的英文读法。
     *
     * 输出样例:
     *
     * shi er yi san qian si bai wu shi liu wan qi qian ling jiu
     *
     * 思路： 按照题意拼凑即可
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        solve(n);
    }

    private static void solve(int n) {
        String[] c = {"ling ", "yi ", "er ", "san ", "si ", "wu ", "liu ", "qi ", "ba ", "jiu "};
        String[] d = {"", "shi ", "bai ", "qian ", "wan ", "shi ", "bai ", "qian ", "yi ", "shi ", "bai "};
        String str = n + "";
        String buffer = new String();
        boolean flag = true;
        int i, j;
        for (i = 0; i < str.length(); i++) {
            for (j = 0; j <= 9; j++)
                if (str.charAt(i) == j + '0')
                    break;
            if ((str.length() + 2) % 4 == 0 && i == 0 && j == 1) {
                buffer += d[str.length() - i - 1];
            } else if (i != str.length() - 1 && j == 0) {
                if (flag) {
                    buffer += c[j];
                    flag = false;
                }
            } else if (i == str.length() - 1 && j == 0) {
                if (!flag) buffer = buffer.substring(0, buffer.length() - 5);
            } else {
                buffer += c[j] + d[str.length() - i - 1];
                flag = true;
            }
        }
        System.out.println(buffer);
    }
}
