package _51_node.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex_1065最小正子段和 {
    /**
     * 1065 最小正子段和
     * 1 秒  131,072 KB 20 分 3 级题
     * N个整数组成的序列a[1],a[2],a[3],…,a[n]，从中选出一个子序列（a[i],a[i+1],…a[j]），使这个子序列的和>0，并且这个和是所有和>0的子序列中最小的。
     * 例如：4，-1，5，-2，-1，2，6，-2。-1，5，-2，-1，序列和为1，是最小的。
     * 输入
     * 第1行：整数序列的长度N（2 <= N <= 50000)
     * 第2 - N+1行：N个整数
     * 输出
     * 输出最小正子段和。
     * 输入样例
     * 8
     * 4
     * -1
     * 5
     * -2
     * -1
     * 2
     * 6
     * -2
     * 输出样例
     * 1
     *
     *
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
            Point p1 = arrayList.get(i - 1);
            Point p2 = arrayList.get(i);
            if (p1.site < p2.site) {
                if (p2.value - p1.value > 0) {
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
            return value > o.value ? 1 : -1;
        }
    }
}
