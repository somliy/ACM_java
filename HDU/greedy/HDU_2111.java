package HDU.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2018/12/3 14:56
 * @Description:
 */
public class HDU_2111 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n, m;
            n = cin.nextInt();
            if(n == 0) break;
            m = cin.nextInt();
            Point[] p = new Point[m];
            for (int i = 0; i < m; i++) {
                int a = cin.nextInt();
                int b = cin.nextInt();
                p[i] = new Point(a, b);
            }
            int ans = 0;
            Arrays.sort(p);
            for (int i = 0; i < m; i++) {
                if (n >= p[i].v) {
                    n -= p[i].v;
                    ans += p[i].v * p[i].val;
                } else if (n > 0) {
                    ans += n * p[i].val;
                    break;
                }
            }
            System.out.println(ans);
        }
    }

    static class Point implements Comparable<Point> {
        int val;
        int v;

        public Point(int val, int v) {
            this.val = val;
            this.v = v;
        }

        @Override
        public int compareTo(Point o) {
            if( val == o.val) return  v > o.v ? -1 : 1;//很重要
            return val > o.val ? -1 : 1;
        }
    }
}
