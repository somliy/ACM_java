package _51_node.greedy;

import java.util.*;

public class ex_1163最高的奖励 {
    /**
     * 1163 最高的奖励
     * 1 秒  131,072 KB 20 分 3 级题
     * 有N个任务，每个任务有一个最晚结束时间以及一个对应的奖励。在结束时间之前完成该任务，就可以获得对应的奖励。完成每一个任务所需的时间都是1个单位时间。有时候完成所有任务是不可能的，因为时间上可能会有冲突，这需要你来取舍。求能够获得的最高奖励。
     * 输入
     * 第1行：一个数N，表示任务的数量(2 <= N <= 50000)
     * 第2 - N + 1行，每行2个数，中间用空格分隔，表示任务的最晚结束时间E[i]以及对应的奖励W[i]。(1 <= E[i] <= 10^9，1 <= W[i] <= 10^9)
     * 输出
     * 输出能够获得的最高奖励。
     * 输入样例
     * 7
     * 4 20
     * 2 60
     * 4 70
     * 3 40
     * 1 30
     * 4 50
     * 6 10
     * 输出样例
     * 230
     *
     * 思路：优先队列维护一组工作奖励，工作按时间从小到大排序，
     * 模拟从0时间开始工作，在时间==工作时间时，
     * 比较，大的进入队列，移除最上面的奖励（最小的）同时维护结果即可
     *
     * @param args
     */
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        ArrayList<Point> list = new ArrayList<>();
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(new Point(cin.nextInt(), cin.nextInt()));
        }
        cin.close();
        Collections.sort(list);
        long len = 0, ans = 0;
        for (Point point : list) {
            if (len < point.time) {
                len++;
                ans += point.weight;
                queue.add(point.weight);
            } else if (len == point.time && point.weight > queue.peek()) {
                ans += point.weight;
                queue.add(point.weight);
                ans -= queue.poll();
            }
        }
        System.out.println(ans);
    }

    static class Point implements Comparable<Point> {
        int time;
        int weight;

        public Point(int time, int weight) {
            this.time = time;
            this.weight = weight;
        }

        @Override
        public int compareTo(Point o) {
            return this.time > o.time ? 1 : -1;
        }
    }
}
