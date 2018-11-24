package _51_node.greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class ex_1099 {
    /**
     * 1099 任务执行顺序
     * 1 秒  131,072 KB 20 分 3 级题
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
