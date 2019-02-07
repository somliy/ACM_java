package SchoolCompetition.ThirdSchoolCompetition;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2018/12/9 13:01
 * @Description:
 */
public class D_Welcome {
    /**
     * Description
     *
     * 你好！挑战者，欢迎来到潍坊大学第三届ACM编程大赛。在你看到这个题的时候，你就已将开始ACM的挑战了。现在，让我们来了解一下ACM的历史。ACM国际大学生程序设计竞赛（英文全称：ACM International Collegiate Programming Contest（简称ACM-ICPC或ICPC））是由国际计算机协会（ACM）主办的，一项旨在展示大学生创新能力、团队精神和在压力下编写程序、分析和解决问题能力的年度竞赛。经过近40年的发展，ACM国际大学生程序设计竞赛已经发展成为全球最具影响力的大学生程序设计竞赛。赛事目前由方正集团赞助。好了。。。。。。不说了，发现说了这么多好像和题意并没有太大关系。
     *
     * 现在给你两个整数ａ和ｂ，现在让你求出他们的乘积。你会发现，哇！!!!如此简单，原来ACM这么简单！！！！其实不然，出题人会让你仔仔细细读完题的。所以现在你要输出两个数的乘积减一。
     *
     * 哎（＞﹏＜）。。。。即使这样这个题依旧很简单，还是没有达到ACM的竞赛难度。就这样吧！！在写下去这个题就该变难了。
     *
     *
     * Input
     *
     * 输入的两个整数a,b在32位以内（0<=a,b<=10^9）。
     *
     *
     * Output
     *
     * 输出结果。
     *
     *
     * Sample Input 1
     *
     * 13 16
     * Sample Output 1
     *
     * 207
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long a = cin.nextLong();
        long b = cin.nextLong();
        System.out.println(a * b - 1);
    }
}
