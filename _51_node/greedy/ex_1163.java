package _51_node.greedy;

import java.util.*;

public class ex_1163 {
    /**
     * 1163 最高的奖励
     *
     * 有N个任务，每个任务有一个最晚结束时间以及一个对应的奖励。在结束时间之前完成该任务，
     * 就可以获得对应的奖励。完成每一个任务所需的时间都是1个单位时间。有时候完成所有任务是不可能的，
     * 因为时间上可能会有冲突，这需要你来取舍。求能够获得的最高奖励。
     *
     * 做个小小的总结，这道题有两种做法：
     * 第一种做法：
     * 时间效率O(n log n)
     * 声明：建立一个以任务的奖金为权值的小根堆，初始堆空，用len记录堆的规模（堆中元素个数）。
     * 对任务按截止时间 t[i] 从小到大排序，按序枚举每个任务，此时len有两种情况：
     * 1. len<t[i]，选择该任务，将任务的奖金插入堆中。2.len=t[i]，若该任务的奖金比堆中最小奖金值更大，则弹出堆顶元素，将该任务的奖金入堆。
     * 第二种做法：
     * 时间效率O(n*α(n))
     * 对任务按奖金从大到小排序，按序枚举每个任务，若某个任务的截止时间>=n则直接选择，否则选择离其截止时间最近的未被其他任务占用的时间点。
     * 高效的解决选择的方法是维护并查集：初始时每个时间点的父节点都为自己（表示该时间点未被占用），一旦该时间点被任务占用，就将其父节点指针指向前一个单位时间点
     * （合并操作），每次选择操作只需要查询该任务的截止时间点的祖先即可，这在α(n)的时间就可以完成。
     * @param args
     *
     * priorityQueue.size()  print size
     * priorityQueue.peek()  return highest priority element in the queue without removing it
     * priorityQueue.poll()  return highest priority element and removes it from the queue
     */
    public static void main(String[] args) {
        PriorityQueue<Integer> points = new PriorityQueue<Integer>();
        ArrayList<Point> arrayList = new ArrayList<>();
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for (int i = 0; i < n; i++) {
            arrayList.add(new Point(cin.nextInt(), cin.nextInt()));
        }
        cin.close();
        Collections.sort(arrayList, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o1.time - o2.time;
            }
        });
        long len = 0, ans = 0;
        for (Point point : arrayList) {
            if (len < point.time) {
                len++;
                ans += point.weight;
                points.add(point.weight);
            } else if (len == point.time && point.weight > points.peek()) {
                ans += point.weight;
                points.add(point.weight);
                ans -= points.poll();
            }
        }
        System.out.println(ans);
    }
    static class Point {
        int time;
        int weight;

        public Point(int time, int weight) {
            this.time = time;
            this.weight = weight;
        }
    }
}
