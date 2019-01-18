package ThirdSchoolCompetition;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2018/12/13 18:35
 * @Description:
 */
public class I_转圈游戏 {
    /**
     * Description
     *
     * 大家应该都玩过转圈游戏，每一种转圈的游戏都会有一定的规则。说起来这个游戏有点像循环队列和循环链表。那么此题的题意是：n 个小伙伴（编号从 0 到 n-1）围坐一圈玩游戏。按照顺时针方向给 n 个位置编号，从 0 到 n-1。最初，第 0 号小伙伴在第 0 号位置，第 1 号小伙伴在第 1 号位置，……，依此类推。
     *
     * 游戏规则如下：每一轮第 0 号位置上的小伙伴顺时针走到第 m 号位置，第 1 号位置小伙伴走到第 m+1 号位置，……，依此类推，第 n−m 号位置上的小伙伴走到第 0 号位置，第 n-m+1 号位置上的小伙伴走到第 1 号位置，……，第 n-1 号位置上的小伙伴顺时针走到第 m-1 号位置。
     *
     * 现在，一共进行了 10^k 轮，请问 x 号小伙伴最后走到了第几号位置。
     *
     *
     * Input
     *
     * 输入共 1 行，包含 4 个整数 n、m、k、x，每两个整数之间用一个空格隔开。
     *
     *
     * Output
     *
     * 输出共 1 行，包含 1 个整数，表示 10^k 轮后 x 号小伙伴所在的位置编号。
     *
     *
     * Sample Input 1
     *
     * 10 3 4 5
     * Sample Output 1
     *
     * 5
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n, m, k, x;
        n = cin.nextInt();
        m = cin.nextInt();
        k = cin.nextInt();
        x = cin.nextInt();
        System.out.println(((fastPower(10, n, k) * m % n) + x) % n);
    }

    static int fastPower(int a, int mod, int n) {
        if (n == 0) {
            return 1 % mod;
        }
        long ans = 1;
        long base = a % mod;
        while (n != 0) {
            if ((n & 1) == 1) {
                ans = (ans * base) % mod;
            }
            //为了避免超出long的范围，所以取三次模
            base = (base % mod) * (base % mod) % mod;
            n >>= 1;
        }
        return (int) ans;
    }
}
