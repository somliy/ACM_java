package _51_node.greedy;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ex_1672 {
    /**
     * 1672 区间交
     * 1 秒  131,072 KB 40 分 4 级题
     * 按照区间左端点排序，维护一个优先队列，存放右端点
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
            if (l > o.l) return 1;
            return -1;
        }
    }
}
