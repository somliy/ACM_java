package _51_node.greedy;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ex_1672区间交 {
    /**
     *1672 区间交
     * 1 秒  131,072 KB 40 分 4 级题
     * 小A有一个含有n个非负整数的数列与m个区间，每个区间可以表示为li,ri。
     * 它想选择其中k个区间， 使得这些区间的交的那些位置所对应的数的和最大。（是指k个区间共同的交，即每个区间都包含这一段，具体可以参照样例）
     *
     * 在样例中，5个位置对应的值分别为1,2,3,4,6，那么选择[2,5]与[4,5]两个区间的区间交为[4,5]，它的值的和为10。
     * 输入
     * 第一行三个数n,k,m(1<=n<=100000,1<=k<=m<=100000)。
     * 接下来一行n个数ai，表示小A的数列(0<=ai<=10^9)。
     * 接下来m行，每行两个数li,ri，表示每个区间(1<=li<=ri<=n)。
     * 输出
     * 一行表示答案
     * 输入样例
     * 5 2 3
     * 1 2 3 4 6
     * 4 5
     * 2 5
     * 1 4
     * 输出样例
     * 10
     *
     *
     * 按照区间左端点排序，遍历
     *
     * 维护一个优先队列，存放右端点
     *
     * 队列每次size为k时，计算区间的和，队列第一个-（当前左端点-1）取最大值
     * size>k时，弹出至k个
     * 如果区间左端点>队列的值，弹出
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n, k, m, x;
        n = cin.nextInt();
        k = cin.nextInt();
        m = cin.nextInt();
        long[] sum = new long[n+1];
        PriorityQueue<Integer> q = new PriorityQueue<>();
        Pair[] pair = new Pair[m];
        for (int i = 1; i <= n; i++) {
            x = cin.nextInt();
            sum[i] = sum[i - 1] + x;
        }
        for (int i = 0; i < m; i++) {
            pair[i] = new Pair(cin.nextInt(), cin.nextInt());
        }
        Arrays.sort(pair);
        long ans = 0;
        for (int i = 0; i < m; i++) {
            q.add(pair[i].r);
            while (!q.isEmpty()) { //剔除没有相交区域的
                if (q.peek() < pair[i].l) q.poll();
                else break;
            }
            while (q.size() > k) q.poll();//去除小区间
            if (q.size() == k) ans = Math.max(ans, sum[q.peek()] - sum[pair[i].l-1]);
        }
        System.out.println(ans);
    }

    static class Pair implements Comparable<Pair> {
        int l;
        int r;

        public Pair(int l, int r) {
            this.l = l;
            this.r = r;
        }

        @Override
        public int compareTo(Pair o) {
            return l > o.l ? 1 : -1;
        }
    }
}
