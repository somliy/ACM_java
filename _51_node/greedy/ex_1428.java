package _51_node.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 1428 活动安排问题
 */
public class ex_1428 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        ArrayList<Point> arrayList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            arrayList.add(new Point(a, b, true));
        }
        cin.close();
        Collections.sort(arrayList, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if(o1.start == o2.start)
                    return o1.end - o2.end;
                return o1.start - o2.start;
            }
        });
        int ans = 0, sum = 0;
        while(sum < arrayList.size()) {
            int t = -1;
            ans++;
            for (int i = 0; i < arrayList.size(); i++) {
                if(arrayList.get(i).start >= t && arrayList.get(i).flag) {
                    t = arrayList.get(i).end;
                    arrayList.get(i).flag = false;
                    sum++;
                }
            }
        }
        System.out.println(ans);
    }

    static class Point {
        int start;
        int end;
        boolean flag;

        public Point(int start, int end, boolean flag) {
            this.start = start;
            this.end = end;
            this.flag = flag;
        }
    }
}
