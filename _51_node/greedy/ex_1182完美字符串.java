package _51_node.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ex_1182完美字符串 {
    /**
     * 1182 完美字符串
     * 1 秒  131,072 KB 5 分 1 级题
     * 约翰认为字符串的完美度等于它里面所有字母的完美度之和。每个字母的完美度可以由你来分配，不同字母的完美度不同，分别对应一个1-26之间的整数。
     * 约翰不在乎字母大小写（也就是说字母A和a的完美度相同）。给定一个字符串，输出它的最大可能的完美度。例如：dad，你可以将26分配给d，25分配给a，这样整个字符串完美度为77。
     * 输入
     * 输入一个字符串S(S的长度 <= 10000)，S中没有除字母外的其他字符。
     * 输出
     * 由你将1-26分配给不同的字母，使得字符串S的完美度最大，输出这个完美度。
     * 输入样例
     * dad
     * 输出样例
     * 77
     *
     * 思路：使用string存储，把26字母与0-15对应，个数存入对应下标数组中，排序即可
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine().toLowerCase();
        int[] str = new int[26];
        for (int i = 0; i < s.length(); i++) {
            str[s.charAt(i) - 'a']++;
        }
        Arrays.sort(str);
        int ans = 0;
        for (int i = 25; i >= 0; i--) {
            ans += (i + 1) * str[i];
            if (str[i] == 0) break;
        }
        System.out.println(ans);
    }
}

