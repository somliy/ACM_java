package SchoolCompetition.ThirdSchoolCompetition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2018/12/9 13:18
 * @Description:
 */
public class G_最高的奖励 {
    /**
     * Description
     *
     * 已经介绍完了图灵，现在就来介绍一下计算机领域的最高奖项————图灵奖。图灵奖（Turing Award），全称“A.M. 图灵奖（A.M Turing Award）”，
     * 由美国计算机协会（ACM）于1966年设立，专门奖励那些对计算机事业作出重要贡献的个人。其名称取自计算机科学的先驱、英国科学家艾伦·麦席森·图灵（Alan M. Turing）
     * 。由于图灵奖对获奖条件要求极高，评奖程序又是极严，一般每年只奖励一名计算机科学家，只有极少数年度有两名合作者或在同一方向作出贡献的科学家共享此奖。
     * 因此它是计算机界最负盛名、最崇高的一个奖项，有“计算机界的诺贝尔奖”之称。
     * 奖金金额不算太高，设奖初期为20万美元，1989年起增到25万美元，奖金通常由计算机界的一些大企业提供（通过与ACM签订协议）。
     * 目前图灵奖由Google公司赞助，奖金为1,000,000美元。废话说了好多。。。。。。其实也不能算是废话吧！！！！了解了这么多，这个题应该可以AC了吧。
     * 给你N个任务，每个任务有一个最晚结束时间（单位：天）以及一个对应的奖励。在结束时间之前完成该任务，就可以获得对应的奖励。完成每一个任务所需的时间都是1天。
     * 有时候完成所有任务是不可能的，因为时间上可能会有冲突，这需要你来取舍。求能够获得的最高奖励。
     *
     *
     * Input
     *
     * 第1行：一个数N，表示任务的数量(2 <= N <= 50000)第2 - N + 1行，每行2个数，中间用空格分隔，表示任务的最晚结束时间E[i]以及对应的奖励W[i]。(1 <= E[i] <= 10^9，1 <= W[i] <= 10^9)
     *
     *
     * Output
     *
     * 输出能够获得的最高奖励。
     *
     *
     * Sample Input 1
     *
     * 7
     * 4 20
     * 2 60
     * 4 70
     * 3 40
     * 1 30
     * 4 50
     * 6 10
     * Sample Output 1
     *
     * 230
     * @param args
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
        Collections.sort(arrayList);
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
    static class Point implements Comparable<Point>{
        int time;
        int weight;

        public Point(int time, int weight) {
            this.time = time;
            this.weight = weight;
        }

        @Override
        public int compareTo(Point o) {
            return time > o.time?1:-1;
        }
    }
}
