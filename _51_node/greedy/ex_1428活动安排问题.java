package _51_node.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex_1428活动安排问题 {
    /**
     * 1428 活动安排问题
     * 1 秒  131,072 KB 10 分 2 级题
     * 有若干个活动，第i个开始时间和结束时间是[Si,fi)，同一个教室安排的活动之间不能交叠，求要安排所有活动，最少需要几个教室？
     * 输入
     * 第一行一个正整数n (n <= 10000)代表活动的个数。
     * 第二行到第(n + 1)行包含n个开始时间和结束时间。
     * 开始时间严格小于结束时间，并且时间都是非负整数，小于1000000000
     * 输出
     * 一行包含一个整数表示最少教室的个数。
     * 输入样例
     * 3
     * 1 2
     * 3 4
     * 2 9
     * 输出样例
     * 2
     *
     * 思路：一层一层筛。什么是一层，就是找出一组时间上最密集且不重复的活动称为一层，记录层数即可
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
            points.add(new Point(a, b, true));
        }
        cin.close();
        Collections.sort(points);
        int ans = 0, sum = 0;
        while (sum < points.size()) {
            int t = -1;
            ans++;
            for (int i = 0; i < points.size(); i++) {
                if (points.get(i).start >= t && points.get(i).flag) {
                    t = points.get(i).end;
                    points.get(i).flag = false;
                    sum++;
                }
            }
        }
        System.out.println(ans);
    }

    static class Point implements Comparable<Point> {
        int start;
        int end;
        boolean flag;

        public Point(int start, int end, boolean flag) {
            this.start = start;
            this.end = end;
            this.flag = flag;
        }

        @Override
        public int compareTo(Point o) {
            if (this.start == o.start)
                return this.end > o.end ? 1 : -1;
            return this.start > o.start ? 1 : -1;
        }
    }
}
