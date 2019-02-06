package _51_node.greedy;

import java.util.Scanner;

public class ex_1344走格子 {
    /**
     * 1344 走格子
     * 1 秒  131,072 KB 5 分 1 级题
     * 有编号1-n的n个格子，机器人从1号格子顺序向后走，一直走到n号格子，并需要从n号格子走出去。机器人有一个初始能量，每个格子对应一个整数A[i]，表示这个格子的能量值。如果A[i] > 0，机器人走到这个格子能够获取A[i]个能量，如果A[i] < 0，走到这个格子需要消耗相应的能量，如果机器人的能量 < 0，就无法继续前进了。问机器人最少需要有多少初始能量，才能完成整个旅程。
     *
     * 例如：n = 5。{1，-2，-1，3，4} 最少需要2个初始能量，才能从1号走到5号格子。途中的能量变化如下3 1 0 3 7。
     * 输入
     * 第1行：1个数n，表示格子的数量。(1 <= n <= 50000)
     * 第2 - n + 1行：每行1个数A[i]，表示格子里的能量值(-1000000000 <= A[i] <= 1000000000)
     * 输出
     * 输出1个数，对应从1走到n最少需要多少初始能量。
     * 输入样例
     * 5
     * 1
     * -2
     * -1
     * 3
     * 4
     * 输出样例
     * 2
     *
     * 思路：直接走，记录途中最少血量，若途中最小为-2，那么初始2血即可，最后输出即可
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long n = cin.nextInt();
        long ans = 0, minn = 1000000005;
        for (int i = 1; i <= n; i++) {
            ans += cin.nextInt();
            minn = Math.min(minn, ans);
        }
        if (minn >= 0) System.out.println(0);
        else System.out.println(-minn);
    }
}
