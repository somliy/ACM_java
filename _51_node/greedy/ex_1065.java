package _51_node.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex_1065 {
    /**
     * 1065 最小正子段和
     * 1 秒  131,072 KB 20 分 3 级题
     * <p>
     * 计算前缀和，标记加的位置，根据前缀和排序，
     * 根据排序后的顺序后-前，并判断原来位置 后 在 前 的前面
     * nlog(n)
     *
     * @param args
     */
    public static void main(String[] args) {
        final long INF = Long.MAX_VALUE;
        ;
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        ArrayList<Point> arrayList = new ArrayList<>();
        long index = 0;
        for (int i = 1; i <= n; i++) {
            long x = cin.nextInt();
            arrayList.add(new Point(i, x + index));
            index += x;
        }
        arrayList.add(new Point(0, 0));
        cin.close();
        Collections.sort(arrayList);
        long ans = INF;

        for (int i = 1; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i).value);
            Point p1 = arrayList.get(i - 1);
            Point p2 = arrayList.get(i);
            if (p1.site < p2.site) {
                if (p2.value - p1.value > 0) {
//                    System.out.println(p2.value - p1.value);
                    ans = Math.min(ans, p2.value - p1.value);
                }
            }

        }
        System.out.println(ans);
    }

    static class Point implements Comparable<Point> {
        int site;
        long value;

        public Point(int site, long value) {
            this.site = site;
            this.value = value;
        }

        @Override
        public int compareTo(Point o) {
            if (value > o.value)
                return 1;
            else return -1;
        }
    }
}
