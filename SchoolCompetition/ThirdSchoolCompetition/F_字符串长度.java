package SchoolCompetition.ThirdSchoolCompetition;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2018/12/9 13:12
 * @Description:
 */
public class F_字符串长度 {
    /**
     * Description
     *
     * 有时候，像“localization”或“internationalization”这样的单词太长了，以至于在一篇文章中多次使用它们是相当烦人的。
     * 让我们考虑一个单词太长，如果它的长度严格超过10个字符。所有太长的单词都应该用一个特殊的缩写代替。
     * 这个缩写是这样写的:我们写下一个单词的第一个字母和最后一个字母，在它们之间我们写下第一个字母和最后一个字母之间的字母数。
     * 这个数字是十进制的，不包含任何前导零。因此，“localization”将拼写为“l10n”，“internationalization”将拼写为“i18n”。
     * 建议您将使用缩写词更改单词的过程自动化。这样的话，太长的单词应该被缩写代替，不太长的单词不应该有任何变化。
     *
     *
     * Input
     *
     * 第一行包含一个整数n (1≤n≤100)。下面n行每一行都包含一个单词。所有单词由小写拉丁字母组成，长度从1到100个字符。
     *
     *
     * Output
     *
     * 打印n行。第i行应该包含从输入数据替换第i个单词的结果。
     *
     *
     * Sample Input 1
     *
     * 4
     * word
     * localization
     * internationalization
     * pneumonoultramicroscopicsilicovolcanoconiosis
     * Sample Output 1
     *
     * word
     * l10n
     * i18n
     * p43s
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        String str = cin.nextLine();
        for (int i = 0; i < n; i++) {
            str = cin.nextLine();
            if (str.length() <= 10) {
                System.out.println(str);
            } else {
                System.out.println(str.charAt(0) + "" + (str.length() - 2) + "" + str.charAt(str.length() - 1));
            }
        }
    }
}
