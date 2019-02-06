package _51_node.greedy;

import java.util.*;

public class ex_1191消灭兔子 {
    /**
     * 1191 消灭兔子
     * 1 秒  131,072 KB 40 分 4 级题
     * 有N只兔子，每只有一个血量B[i]，需要用箭杀死免子。有M种不同类型的箭可以选择，每种箭对兔子的伤害值分别为D[i]，价格为P[i](1 <= i <= M)。假设每种箭只能使用一次，每只免子也只能被射一次，计算要消灭地图上的所有兔子最少需要多少Q币。如不能杀死所有兔子，请输出No Solution。
     * 特别说明：1、当箭的伤害值大于等于兔子的血量时，能将兔子杀死；2、血量B[i]，箭的伤害值D[i]，箭的价格P[i]，均小于等于100000。
     * 输入
     * 第1行：两个整数N，M，中间用空格分隔（1 <= N, M <= 50000），分别表示兔子的个数和箭的种类。
     * 第2 - N + 1行：每行1个正整数(共N行)，表示兔子的血量B[i]（1 <= B[i] <= 100000）。
     * 第N + 2 - N + M + 1行：每行2个正整数(共M行)，中间用空格分隔，表示箭所能造成的伤害值D[i]，和需要花费的Q币P[i]（1 <= D[i], P[i] <= 100000）。
     * 输出
     * 输出最少需要多少Q币才能消灭所有的兔子。如果不能杀死所有兔子，请输出"No Solution"。
     * 输入样例
     * 3 3
     * 1
     * 2
     * 3
     * 2 1
     * 3 2
     * 4 3
     * 输出样例
     * 6
     *
     * 思路：兔子血量从小到大排序
     *       箭伤害从大到小排序
     *       优先队列箭的花费从小到大排序
     *
     *       兔子从血量大的开始循环
     *          对于每一只兔子，匹配箭，合适的箭加入队列
     *          每一只兔子匹配队列最上面的箭，从队列中取出，记录结果中
     *
     *       队列不清空，因为伤害大的箭可以杀死血量少的兔子，反之不行，
     *       所以每次取队列顶端就可以了
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        if (n > m) {
            System.out.println("No Solution");
            return;
        }
        int[] rabbit = new int[n];
        Arrow[] a = new Arrow[m];
        long ans = 0;
        Queue<Arrow> q = new PriorityQueue<Arrow>(m, new Comparator<Arrow>() {
            @Override
            public int compare(Arrow o1, Arrow o2) {
                return o1.cost - o2.cost;
            }
        });
        for (int i = 0; i < n; i++) {
            rabbit[i] = cin.nextInt();
        }
        for (int i = 0; i < m; i++) {
            a[i] = new Arrow(cin.nextInt(), cin.nextInt());
        }
        cin.close();
        Arrays.sort(rabbit);
        Arrays.sort(a, new Comparator<Arrow>() {
            @Override
            public int compare(Arrow o1, Arrow o2) {
                return o2.hurt - o1.hurt;
            }
        });
        for (int i = n - 1, j = 0; i >= 0; i--) {
            while (j < m && a[j].hurt >= rabbit[i]) {
                q.add(a[j]);
                j++;
            }
            if (q.isEmpty()) {
                System.out.println("No Solution");
                return;
            }
            ans += q.poll().cost;
        }
        System.out.println(ans);
    }

    static class Arrow {
        int hurt;
        int cost;

        public Arrow(int hurt, int cost) {
            this.hurt = hurt;
            this.cost = cost;
        }

    }
}
