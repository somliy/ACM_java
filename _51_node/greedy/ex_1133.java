package _51_node.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ex_1133 {
    /**
     * 1133 不重叠的线段
     * 1 秒  131,072 KB 10 分 2 级题
     * X轴上有N条线段，每条线段有1个起点S和终点E。最多能够选出多少条互不重叠的线段。
     * （注：起点或终点重叠，不算重叠）。例如：[1 5][2 3][3 6]，可以选[2 3][3 6]，这2条线段互不重叠。
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        ArrayList<Point> arrayList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            arrayList.add(new Point(a, b));
        }
        cin.close();
        Collections.sort(arrayList, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o1.end - o2.end;
            }
        });
        long ans = 0, t = (long)-1e9;

        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).start >= t) {
                t = arrayList.get(i).end;
                ans++;
            }
        }
        System.out.println(ans);
    }

    static class Point {
        int start;
        int end;


        public Point(int start, int end) {
            this.start = start;
            this.end = end;

        }
    }
}
