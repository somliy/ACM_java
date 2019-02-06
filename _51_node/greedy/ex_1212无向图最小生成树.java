package _51_node.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex_1212无向图最小生成树 {
    /**
     * 1212 无向图最小生成树
     * 1 秒  131,072 KB 0 分 基础题
     * N个点M条边的无向连通图，每条边有一个权值，求该图的最小生成树。
     * 输入
     * 第1行：2个数N,M中间用空格分隔，N为点的数量，M为边的数量。（2 <= N <= 1000, 1 <= M <= 50000)
     * 第2 - M + 1行：每行3个数S E W，分别表示M条边的2个顶点及权值。(1 <= S, E <= N，1 <= W <= 10000)
     * 输出
     * 输出最小生成树的所有边的权值之和。
     * 输入样例
     * 9 14
     * 1 2 4
     * 2 3 8
     * 3 4 7
     * 4 5 9
     * 5 6 10
     * 6 7 2
     * 7 8 1
     * 8 9 7
     * 2 8 11
     * 3 9 2
     * 7 9 6
     * 3 6 4
     * 4 6 14
     * 1 8 8
     * 输出样例
     * 37
     *
     * 思路：最小生成树模板题
     */
    static int n, m, ans = 0;
    static int[] pre = new int[1005];
    static ArrayList<Edge> edges = new ArrayList<>();

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        m = cin.nextInt();
        for (int i = 0; i < m; i++) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            int c = cin.nextInt();
            edges.add(new Edge(a, b, c));
        }
        kruskal();
        System.out.println(ans);
    }

    public static void kruskal() {
        for (int i = 1; i <= n; i++) {
            pre[i] = i;
        }
        Collections.sort(edges);
        for (Edge edge : edges) {
            int x = find(edge.start);
            int y = find(edge.end);
            if (x != y) {
                pre[x] = y;
                ans += edge.weight;
            }
        }
    }

    public static int find(int x) {
        return pre[x] == x ? x : find(pre[x]);
    }

    public static class Edge implements Comparable<Edge> {
        int start;
        int end;
        int weight;

        public Edge(int start, int end, int weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return weight > o.weight ? 1 : -1;
        }
    }
}
