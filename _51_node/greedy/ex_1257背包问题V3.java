package _51_node.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class ex_1257背包问题V3 {
    /**
     * 1257 背包问题 V3
     * 3 秒  131,072 KB 80 分 5 级题
     * N个物品的体积为W1，W2......Wn（Wi为整数），与之相对应的价值为P1,P2......Pn（Pi为整数），从中选出K件物品（K <= N)，使得单位体积的价值最大。
     * 输入
     * 第1行：包括2个数N, K(1 <= K <= N <= 50000)
     * 第2 - N + 1行：每行2个数Wi, Pi（1 <= Wi, Pi <= 50000)
     * 输出
     * 输出单位体积的价值（用约分后的分数表示）。
     * 输入样例
     * 3 2
     * 2 2
     * 5 3
     * 2 1
     * 输出样例
     * 3/4
     *
     * 一开始以为是贪心，直接取pi/wi最大的那k个，然后想想不对，因为如果p1=1,p2=101,w1=1000,w2=100000,
     * 如果照这种贪心策略就取第二个，但是这样体积很大，假如当前最优的W，P还需这两个之中的一个，
     * 那么(1+P)/(1000+W)可能比(101+P)/(100000+W)更优
     *
     * 所以贪心只能保证个体最优，却不能保证全局最优
     *
     * blocks[i].w物体的价值 block[i].p物体的体积 p二分答案
     *
     * 假设p是我们要的答案，那么block[i].p*p为block[i]应该占有的价值
     * blocks[i].w - block[i].p * p 为现在与目标价值的差
     * 这个差约小说明越接近答案，根据这一位进行排序，只要前k个。记录当前总体积和总价值即可。
     *
     * 答案与每个物品有联系，存在直接的联系，而且可以经过验证答案的正确性
     *
     */
    static int n, k;
    static int ansA = 0, tA = 0;
    static int ansB = 0, tB = 0;
    static Block[] blocks = null;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        k = cin.nextInt();
        blocks = new Block[n];
        for (int i = 0; i < n; i++) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            blocks[i] = new Block(a, b, 0);
        }
        cin.close();
        double left = 0, right = 50000.0;
        for (int i = 1; i < 100; i++) {
            double mid = (left + right) / 2.0;
            if (check(mid)) {
                ansA = tA;
                ansB = tB;
                tA = tB = 0;
                left = mid;
            } else {
                ansA = tA;
                ansB = tB;
                tA = tB = 0;
                right = mid;
            }
        }
        int x = gcd(ansA, ansB);
        System.out.println(ansB / x + "/" + ansA / x);
    }

    public static boolean check(double p) {
        for (int i = 0; i < n; i++) {
            blocks[i].dis = 1.0 * blocks[i].w - blocks[i].p * p;
        }
        Arrays.sort(blocks);
        double sum = 0;
        for (int i = 0; i < k; i++) {
            tA += blocks[i].w;
            tB += blocks[i].p;
            sum += blocks[i].dis;
        }
        if (sum > 0) return true;
        return false;
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static class Block implements Comparable<Block> {
        int w;
        int p;
        double dis;

        public Block(int w, int p, double dis) {
            this.w = w;
            this.p = p;
            this.dis = dis;
        }

        @Override
        public int compareTo(Block o) {
            return dis > o.dis ? 1 : -1;
        }
    }
}
