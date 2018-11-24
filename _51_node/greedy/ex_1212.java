package _51_node.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * 1212 无向图最小生成树
 */
public class ex_1212 {
    static int n, m, ans = 0;
    static int[] pre = new int[100];
    static ArrayList<Edge> edges = new ArrayList<>();


    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        m = cin.nextInt();
        for (int i = 0; i < m; i++) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            int c = cin.nextInt();
            Edge edge = new Edge(a, b, c);
            edges.add(edge);
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

    public static class Edge implements Comparable {
        int start;
        int end;
        int weight;

        public Edge(int start, int end, int weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }

        @Override
        public int compareTo(Object o) {
            if (o instanceof Edge) {
                Edge b = (Edge) o;
                if (this.weight < b.weight) {
                    return -1;
                } else if (this.weight > b.weight) {
                    return 1;
                }
            }
            return 0;
        }
    }
}
