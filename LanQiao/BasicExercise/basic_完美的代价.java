package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/22 14:46
 * @Description:
 */
public class basic_完美的代价 {
    /**
     * 基础练习 完美的代价
     * 描述
     *
     * 回文串，是一种特殊的字符串，它从左往右读和从右往左读是一样的。小龙龙认为回文串才是完美的。现在给你一个串，它不一定是回文的，请你计算最少的交换次数使得该串变成一个完美的回文串。
     *
     * 交换的定义是：交换两个相邻的字符
     *
     * 例如mamad
     *
     * 第一次交换 ad : mamda
     *
     * 第二次交换 md : madma
     *
     * 第三次交换 ma : madam (回文！完美！)
     *
     *
     * 输入
     *
     * 输入描述:
     *
     * 第一行是一个整数N，表示接下来的字符串的长度(N <= 8000)
     *
     * 第二行是一个字符串，长度为N.只包含小写字母
     *
     * 输入样例:
     *
     * 5
     *
     * mamad
     *
     *
     * 输出
     *
     * 输出描述:
     *
     * 如果可能，输出最少的交换次数。
     *
     * 否则输出Impossible
     *
     * 输出样例:
     *
     * 3
     *
     * 思路： 从左向右遍历，对于每一个遍历，从右端开始寻找最近的与之相同的字母，计算出距离，
     *        这里要需要改变原来的顺序，即移动产生的变化，
     *        注意循环终止条件，若为奇数长度，有两个无法匹配直接退出，
     *                         若为偶数长度，有一个退出循环
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n, flag = 0, ans = 0, index = 0;
        n = Integer.valueOf(cin.nextLine());
        char[] str = cin.nextLine().toCharArray();
        int len = n - 1;
        for (int i = 0; i < len; i++) {
            for (int j = len; j >= 0; j--) {
                if (j == i) {
                    flag++;
                    if (n % 2 == 0 || flag > 1) {
                        System.out.println("Impossible");
                        return;
                    }
                    index = n / 2 - i;
                    break;
                } else if (str[j] == str[i]) {
                    ans += len - j;
                    for (int k = j; k < len; k++) {
                        str[k] = str[k + 1];
                    }
                    str[len] = str[i];
                    len--;
                    break;
                }
            }
        }
        System.out.println(ans + index);
    }
}
