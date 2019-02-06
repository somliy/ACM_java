package _51_node.greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class ex_1099任务执行顺序 {
    /**
     * 1099 任务执行顺序
     * 1 秒  131,072 KB 20 分 3 级题
     * 有N个任务需要执行，第i个任务计算时占R[i]个空间，而后会释放一部分，最后储存计算结果需要占据O[i]个空间（O[i] < R[i]）。
     * 例如：执行需要5个空间，最后储存需要2个空间。给出N个任务执行和存储所需的空间，问执行所有任务最少需要多少空间。
     * 输入
     * 第1行：1个数N，表示任务的数量。（2 <= N <= 100000)
     * 第2 - N + 1行：每行2个数R[i]和O[i]，分别为执行所需的空间和存储所需的空间。(1 <= O[i] < R[i] <= 10000)
     * 输出
     * 输出执行所有任务所需要的最少空间。
     * 输入样例
     * 20
     * 14 1
     * 2 1
     * 11 3
     * 20 4
     * 7 5
     * 6 5
     * 20 7
     * 19 8
     * 9 4
     * 20 10
     * 18 11
     * 12 6
     * 13 12
     * 14 9
     * 15 2
     * 16 15
     * 17 15
     * 19 13
     * 20 2
     * 20 1
     * 输出样例
     * 135
     * <p>
     * 思路：除去必须要的空间之外，还需要加上运行需要的空间
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            points.add(new Point(cin.nextInt(), cin.nextInt()));
        }
        int ans = 0, index = 100000;
        for (Point point : points) {
            index = Math.min(point.space - point.take, index);
            ans += point.take;
        }
        System.out.println(ans + index);
    }

    static class Point {
        int space;
        int take;

        public Point(int space, int take) {
            this.space = space;
            this.take = take;
        }
    }
}
