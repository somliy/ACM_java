package _51_node.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class ex_1257 {
    /**
     * 1257 背包问题 V3
     * 3 秒  131,072 KB 80 分 5 级题
     * blocks[i].w物体的价值 block[i].p物体的体积 p二分答案
     *
     * 假设p是我们要的答案，那么block[i].p*p为block[i]应该占有的价值
     * blocks[i].w - block[i].p * p 为现在与目标价值的差
     * 这个差约小说明越接近答案，根据这一位进行排序，只要前k个。记录当前总体积和总价值即可。
     *
     * 答案与每个物品有联系，存在直接的联系，而且可以经过验证答案的正确性
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
                ansA = tA;ansB = tB;tA = tB = 0;
                left = mid;
            } else {
                ansA = tA;ansB = tB;tA = tB = 0;
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
            if (dis > o.dis) return 1;
            return -1;
        }
    }
}
