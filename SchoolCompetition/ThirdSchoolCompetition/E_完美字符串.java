package SchoolCompetition.ThirdSchoolCompetition;

import java.io.*;
import java.util.Arrays;

/**
 * @Auther: zhaodong
 * @Date: 2018/12/9 13:06
 * @Description:
 */
public class E_完美字符串 {
    /**
     * Description
     *
     * 字符串主要用于编程，概念说明、函数解释、用法详述见正文，这里补充一点：字符串在存储上类似字符数组，所以它每一位的单个元素都是可以提取的，如s=“abcdefghij”，
     * 则s[1]=“a”，s[10]="j"，而字符串的零位正是它的长度，如s[0]=10（※上述功能Ansistring没有。），
     * 这可以给我们提供很多方便，如高精度运算时每一位都可以转化为数字存入数组。ls认为字符串的完美度等于它里面所有字母的完美度之和。每个字母的完美度可以由你来分配，
     * 不同字母的完美度不同，分别对应一个1-26之间的整数。ls不在乎字母大小写（也就是说字母A和a的完美度相同）。给定一个字符串，输出它的最大可能的完美度。
     * 例如：dad，你可以将26分配给d，25分配给a，这样整个字符串完美度为77。
     *
     *
     * Input
     *
     * 输入一个字符串S(S的长度 <= 10000)，S中没有除字母外的其他字符。
     *
     *
     * Output
     *
     * 由你将1-26分配给不同的字母，使得字符串S的完美度最大，输出这个完美度。
     *
     *
     * Sample Input 1
     *
     * dad
     * Sample Output 1
     *
     * 77
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in), 1 << 16));
        PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));
        cin.nextToken();
        String s = cin.sval.toLowerCase();
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
        cout.println(ans);
        cout.flush();
    }
}
