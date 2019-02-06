package _51_node.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex_1133不重叠的线段 {
    /**
     * 1133 不重叠的线段
     * 1 秒  131,072 KB 10 分 2 级题
     * X轴上有N条线段，每条线段有1个起点S和终点E。最多能够选出多少条互不重叠的线段。（注：起点或终点重叠，不算重叠）。
     * 例如：[1 5][2 3][3 6]，可以选[2 3][3 6]，这2条线段互不重叠。
     * 输入
     * 第1行：1个数N，线段的数量(2 <= N <= 10000)
     * 第2 - N + 1行：每行2个数，线段的起点和终点(-10^9 <= S,E <= 10^9)
     * 输出
     * 输出最多可以选择的线段数量。
     * 输入样例
     * 3
     * 1 5
     * 2 3
     * 3 6
     * 输出样例
     * 2
     *
     * 思路：类似1428活动安排问题  现在只需找出一层即可，按照结束时间从小到大排序
     *       最早结束才能最早开始，才能最多放置线段
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            points.add(new Point(a, b));
        }
        cin.close();
        Collections.sort(points);
        long ans = 0, t = (long) -1e9;

        for (int i = 0; i < points.size(); i++) {
            if (points.get(i).start >= t) {
                t = points.get(i).end;
                ans++;
            }
        }
        System.out.println(ans);
    }

    static class Point implements Comparable<Point> {
        int start;
        int end;

        public Point(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Point o) {
            return this.end > o.end ? 1 : -1;
        }
    }
}
