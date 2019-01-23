package LanQiao.BasicExercise;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/22 16:35
 * @Description:
 */
public class basic_Huffuman树 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for (int i = 1; i <= n; i++) {
            int x = cin.nextInt();
            queue.add(x);
        }
        int ans = 0;
        while (queue.size() > 1) {
            int a = queue.poll();
            int b = queue.poll();
            ans += a + b;
            queue.add(a + b);
        }
        System.out.println(ans);
    }
}
