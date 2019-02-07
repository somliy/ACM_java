package SchoolCompetition.ThirdSchoolCompetition;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2018/12/9 13:23
 * @Description:
 */
public class H_小可爱分块 {
    /**
     * Description
     *
     * 小可爱特别喜欢分块，于是，她就把Kirito_Rivaille刚刚买来的序列分开了，但是Kirito_Rivaille把她打了一顿。
     * Kirito_Rivaille 有一个长度为n的序列，而小可爱由于不开心，所以她不希望看到任何一个长度>=k的子串中，
     * 子串内的所有元素的gcd>1所以小可爱现在要钦定这个序列上某些位置为1，其他的位置，可能是任何正整数。 现在她想知道，她至少需要钦定多少个位置是1，
     * 才能使所有长度>=k的所有子串，子串的gcd=1
     *
     *
     * Input
     *
     * 一行两个数n,k，表示序列长度，和要求的最小子串长度。
     *
     *
     * Output
     *
     * 一行一个整数表示答案
     *
     *
     * Sample Input 1
     *
     * 1 1
     * Sample Output 1
     *
     * 1
     * Hint
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long n = cin.nextLong();
        long k = cin.nextLong();
        System.out.println(n / k);
    }
}
