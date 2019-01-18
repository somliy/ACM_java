package HDU.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2018/12/23 16:32
 * @Description:
 */
public class HDU_2187 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int c = cin.nextInt();
        while (c-- > 0) {
            int n, m;
            n = cin.nextInt();
            m = cin.nextInt();
            Point[] p = new Point[m];
            for (int i = 0; i < m; i++) {
                p[i] = new Point(cin.nextInt(), cin.nextInt());
            }
            Arrays.sort(p);
            double ans = 0;
            for (int i = 0; i < m; i++) {
                int a = p[i].a;
                int b = p[i].b;
                if (a * b <= n) {
                    ans += b;
                    n -= a * b;
                } else {
                    ans += n * 1.0 / (a * 1.0);
                    break;
                }
            }
            System.out.printf("%.2f", ans);
            System.out.println();
        }
    }

    static class Point implements Comparable<Point> {
        int a;
        int b;
        public Point(int a, int b) {
            this.a = a;
            this.b = b;
        }
        @Override
        public int compareTo(Point o) {
            if (a == o.a) return b > o.b ? -1 : 1;//不加会错，不知道为啥
            return a > o.a ? 1 : -1;
        }

    }
}
