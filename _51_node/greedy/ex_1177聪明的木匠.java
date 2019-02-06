package _51_node.greedy;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ex_1177聪明的木匠 {
    /**
     * 1117 聪明的木匠
     * 1 秒  131,072 KB 20 分 3 级题
     * 一位老木匠需要将一根长的木棒切成N段。每段的长度分别为L1,L2,......,LN（1 <= L1,L2,…,LN <= 1000，且均为整数）个长度单位。我们认为切割时仅在整数点处切且没有木材损失。
     * 木匠发现，每一次切割花费的体力与该木棒的长度成正比，不妨设切割长度为1的木棒花费1单位体力。例如：若N=3，L1 = 3,L2 = 4,L3 = 5，则木棒原长为12，木匠可以有多种切法，如：先将12切成3+9.，花费12体力，再将9切成4+5，花费9体力，一共花费21体力；还可以先将12切成4+8，花费12体力，再将8切成3+5，花费8体力，一共花费20体力。显然，后者比前者更省体力。
     * 那么，木匠至少要花费多少体力才能完成切割任务呢？
     * 输入
     * 第1行：1个整数N(2 <= N <= 50000)
     * 第2 - N + 1行：每行1个整数Li(1 <= Li <= 1000)。
     * 输出
     * 输出最小的体力消耗。
     * 输入样例
     * 3
     * 3
     * 4
     * 5
     * 输出样例
     * 19
     *
     * 按每段大小由大到小切割就可以使体力最少.
     * 证明:   L1+L2+……+LN=M
     * 第一次切割Li, 花费体力：M
     * 第二次切割Lj，花费体力：M-Li
     * 第三次切割Ls，花费体力：M-Li-Lj
     * 如此下去，
     * N次切割后花费体力为：M-Li-Lj-……-Lk
     * 那么，花费的总体力为NM-（N-1）Li-（N-2）Lj-……-Lk
     * 显然，要使得总体力最少，只要Li>Lj>……>Lk
     */
    static PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for (int i = 1; i <= n; i++) {
            int x = cin.nextInt();
            priorityQueue.add(x);
        }
        System.out.println(solve());
    }

    public static int solve() {
        int ans = 0;
        while (priorityQueue.size() >= 2) {
            int x = priorityQueue.poll();
            int y = priorityQueue.poll();
            ans += x + y;
            priorityQueue.add(x + y);
        }
        return ans;
    }

}
