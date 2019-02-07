package SchoolCompetition.ThirdSchoolCompetition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

/**
 * @Auther: zhaodong
 * @Date: 2018/12/23 10:57
 * @Description:
 */
public class J_寻找道路 {
    /**
     * Description
     *
     * 图论〔Graph Theory〕是数学的一个分支。它以图为研究对象。图论中的图是由若干给定的点及连接两点的线所构成的图形，
     * 这种图形通常用来描述某些事物之间的某种特定关系，用点代表事物，用连接两点的线表示相应两个事物间具有这种关系。图论本身是应用数学的一部份，
     * 因此，历史上图论曾经被好多位数学家各自独立地建立过。关于图论的文字记载最早出现在欧拉1736年的论著中，他所考虑的原始问题有很强的实际背景。
     * 那么在有向图 G 中，每条边的长度均为 1 ，现给定起点和终点，你能否在图中找一条从起点到终点的路径，使得该路径满足以下条件：
     *
     * 路径上的所有点的出边所指向的点都直接或间接与终点连通。
     * 在满足条件 1 的情况下使路径最短。
     * 注意：图 G 中可能存在重边和自环，题目保证终点没有出边。
     *
     * 请你输出符合条件的路径的长度。
     *
     *
     * Input
     *
     * 第一行有两个用一个空格隔开的整数 n 和 m ，表示图有 n 个点和 m 条边。
     *
     * 接下来的 m 行每行 2 个整数 x, y ，之间用一个空格隔开，表示有一条边从点 x 指向点 y 。
     *
     * 最后一行有两个用一个空格隔开的整数 s, t ，表示起点为 s ，终点为 t 。
     *
     *
     * Output
     *
     * 输出只有一行，包含一个整数，表示满足题目描述的最短路径的长度。如果这样的路径不存在，输出 -1 。
     *
     * Sample Input 1
     *
     * 3 2
     * 1 2
     * 2 1
     * 1 3
     * Sample Output 1
     *
     * -1
     * Sample Input 2
     *
     * 6 6
     * 1 2
     * 1 3
     * 2 6
     * 2 5
     * 4 5
     * 3 4
     * 1 5
     * Sample Output 2
     *
     * 3
     *
     *
     * 输入输出流优化，
     * vector数组创建需要对每一个new一个对象
     *
     * 思路 ： 两次搜索即可
     */
    static int maxn = 10000 + 5;
    static Vector<Integer>[] v = new Vector[maxn];
    static int[] ans = new int[maxn];
    static boolean[] first = new boolean[maxn];
    static boolean[] second = new boolean[maxn];

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < maxn; i++) v[i] = new Vector<>();
        Queue<Integer> q = new LinkedList<>();
        StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in), 1 << 16));
        cin.nextToken();
        int n = (int) cin.nval;
        cin.nextToken();
        int m = (int) cin.nval;
        cin.nextToken();
        for (int i = 1; i <= m; i++) {
            int x = (int) cin.nval;
            cin.nextToken();
            int y = (int) cin.nval;
            cin.nextToken();
            if (x == y) continue;
            v[y].add(x);
        }
        int st = (int) cin.nval;
        cin.nextToken();
        int ed = (int) cin.nval;
        first[ed] = true;
        q.offer(ed);
        while (!q.isEmpty()) {
            int now = q.poll();
            for (int i = 0, j = v[now].size(); i < j; i++) {
                if (!first[v[now].get(i)]) {
                    first[v[now].get(i)] = true;
                    q.offer(v[now].get(i));
                }
            }
        }
        second = Arrays.copyOf(first, first.length);
        for (int i = 1; i <= n; i++) {
            if (!first[i])
                for (int j = 0, k = v[i].size(); j < k; j++) {
                    if (second[v[i].get(j)])
                        second[v[i].get(j)] = false;
                }
        }
        q.offer(ed);
        while (!q.isEmpty()) {
            int now = q.poll();
            for (int i = 0, j = v[now].size(); i < j; i++) {
                if (second[v[now].get(i)]) {
                    q.offer(v[now].get(i));
                    second[v[now].get(i)] = false;
                    ans[v[now].get(i)] = ans[now] + 1;
                }
            }
        }
        if (ans[st] == 0) System.out.println("-1");
        else System.out.println(ans[st]);
    }
}
