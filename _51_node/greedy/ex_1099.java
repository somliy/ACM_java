package _51_node.greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class ex_1099 {
    /**
     * 1099 任务执行顺序
     * 1 秒  131,072 KB 20 分 3 级题
     * 有N个任务需要执行，第i个任务计算时占R[i]个空间，而后会释放一部分，最后储存计算结果需要占据O[i]个空间（O[i] < R[i]）。
     * 例如：执行需要5个空间，最后储存需要2个空间。给出N个任务执行和存储所需的空间，问执行所有任务最少需要多少空间。
     *
     *  除去必须要的空间之外，还需要加上运行需要的空间
     *
     *  非最优代码
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        ArrayList<Point> arrayList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arrayList.add(new Point(cin.nextInt(), cin.nextInt()));
        }
        int ans = 0, index = 100000;
        for (Point point : arrayList) {
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
