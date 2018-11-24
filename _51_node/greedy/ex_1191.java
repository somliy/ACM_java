package _51_node.greedy;

import java.util.*;

public class ex_1191 {
    /**
     * 1191 消灭兔子
     * 1 秒  131,072 KB 40 分 4 级题
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
        int rabbit[] = new int[n];
        Arrow a[] = new Arrow[m];
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
