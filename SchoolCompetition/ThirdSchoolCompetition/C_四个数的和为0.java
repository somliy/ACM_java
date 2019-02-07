package SchoolCompetition.ThirdSchoolCompetition;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2018/12/9 12:59
 * @Description:
 */
public class C_四个数的和为0 {
    /**
     * Description
     * <p>
     * 计算机想必大家都知道，但是你们知道计算机科学之父吗？那就让我来介绍一下吧！艾伦·麦席森·图灵（Alan Mathison Turing，1912年6月23日－1954年6月7日），
     * 英国数学家、逻辑学家，被称为计算机科学之父，人工智能之父。1931年图灵进入剑桥大学国王学院，毕业后到美国普林斯顿大学攻读博士学位，
     * 第二次世界大战爆发后回到剑桥，后曾协助军方破解德国的著名密码系统Enigma，帮助盟军取得了二战的胜利。2013年12月24日
     * ，在英国司法大臣克里斯·格雷灵（Chris Grayling）的要求下，英国女王向图灵颁发了皇家赦免。
     * 英国司法大臣宣布，“图灵的晚年生活因为其同性取向（同性恋。。。。哇！贼恐怖o(≧口≦)o）而被迫蒙上了一层阴影，我们认为当时的判决是不公的，
     * 这种歧视现象现在也已经遭到了废除。为此，女王决定为这位伟人送上赦免，以此向其致敬。”图灵是可敬的是他开启了计算机的时代，所以我们要感谢他。
     * 在此让我们对图灵致以最高的敬意。好了致敬完了图灵，那就让我们来做一道题吧！世界四大数学家之一的高斯7岁的时候就能很快算出1-100和。
     *
     * 问题来了，给你N个整数，你来判断一下是否能够选出4个数，他们的和为0，可以则输出"Yes"，否则输出"No"。
     *
     * Input
     *
     * 第1行，1个数N，N为数组的长度(4 <= N <= 1000)
     * 第2 - N + 1行：A[i]（-10^9 <= A[i] <= 10^9)
     *
     * Output
     *
     * 如果可以选出4个数，使得他们的和为0，则输出"Yes"，否则输出"No"。
     *
     * Sample Input 1
     *
     * 5
     * -1
     * 1
     * -5
     * 2
     * 4
     * Sample Output 1
     *
     * Yes
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n, ca = 0;
        n = cin.nextInt();
        int[] a = new int[n];
        int[] b = new int[n * (n - 1) / 2];

        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                b[ca] = a[i] + a[j];
                ca++;
            }
        }
        int l = 0, r = ca - 1, flag = 0;
        Arrays.sort(b);
        while (l < r) {
            if (b[l] + b[r] > 0) r--;
            else if (b[l] + b[r] < 0) l++;
            else {
                flag = 1;
                break;
            }
        }
        if (flag == 1) System.out.println("Yes");
        else System.out.println("No");
    }
}
