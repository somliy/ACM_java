package HDU.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2018/12/1 13:18
 * @Description:
 */
public class HDU_1009 {
    /**
     * @param args
     */

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()) {
            int n, m;
            m = cin.nextInt();
            n = cin.nextInt();
            if(n == -1 && m == -1) break;
            Point[] points = new Point[n];
            for (int i = 0; i < n; i++) {
                int a = cin.nextInt();
                int b = cin.nextInt();
                points[i] = new Point(a, b, (double) a / b);
            }
            Arrays.sort(points);
            double ans = 0;
            for (int i = 0; i < n; i++) {
                if (points[i].f <= m) {
                    m -= points[i].f;
                    ans += points[i].j;
                } else {
                    ans += (double)m * points[i].j / points[i].f;
                    break;
                }
            }
            System.out.println(String.format("%.3f", ans));
        }

    }

    static class Point implements Comparable<Point> {
        int j;
        int f;
        double val;

        public Point(int j, int f, double val) {
            this.j = j;
            this.f = f;
            this.val = val;
        }

        @Override
        public int compareTo(Point o) {
            return this.val>o.val?-1:1;
        }
    }
}
