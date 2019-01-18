package HDU.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2018/12/3 13:50
 * @Description:
 */
public class HDU_2037 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            if (n == 0) break;
            Point[] points = new Point[n];
            for (int i = 0; i < n; i++) {
                points[i] = new Point(cin.nextInt(), cin.nextInt());
            }
            Arrays.sort(points);
            int ed = 0, ans = 0;
            for (int i = 0; i < n; i++) {
                if (ed <= points[i].l) {
                    ed = points[i].r;
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }

    static class Point implements Comparable<Point> {
        int l;
        int r;

        public Point(int l, int r) {
            this.l = l;
            this.r = r;
        }

        @Override
        public int compareTo(Point o) {
            if (r == o.r) return l > o.l ? 1 : -1;
            return r > o.r ? 1 : -1;
        }
    }
}
