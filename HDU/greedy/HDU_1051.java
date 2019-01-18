package HDU.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2018/12/3 13:13
 * @Description:
 */
public class HDU_1051 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while (t > 0) {
            t--;
            int n, num = 0, ans = 0;
            n = cin.nextInt();
            Point[] p = new Point[n];
            int[] vis = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = new Point(cin.nextInt(), cin.nextInt());
            }
            Arrays.sort(p);
            while (num < n) {
                ans++;
                int a = 0, b = 0;
                for (int i = 0; i < n; i++) {
                    if(vis[i] == 0) {
                        if(a <= p[i].l && b <= p[i].r) {
                            num++;
                            vis[i] = 1;
                            a = p[i].l;
                            b = p[i].r;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }

    public static class Point implements Comparable<Point> {
        int l;
        int r;

        public Point(int l, int r) {
            this.l = l;
            this.r = r;
        }

        @Override
        public int compareTo(Point o) {
            if (l == o.l) {
                return r > o.r ? 1 : -1;
            }
            return l > o.l ? 1 : -1;
        }
    }

}
