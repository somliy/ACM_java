package _51_node.greedy;

import java.util.Scanner;

public class ex_1279扔盘子 {
    /**
     * 1279 扔盘子
     * 1 秒  131,072 KB 10 分 2 级题
     * 有一口井，井的高度为N，每隔1个单位它的宽度有变化。现在从井口往下面扔圆盘，如果圆盘的宽度大于井在某个高度的宽度，则圆盘被卡住（恰好等于的话会下去）。
     * 盘子有几种命运：1、掉到井底。2、被卡住。3、落到别的盘子上方。
     * 盘子的高度也是单位高度。给定井的宽度和每个盘子的宽度，求最终落到井内的盘子数量。
     * <p>
     * 如图井和盘子信息如下：
     * 井：5 6 4 3 6 2 3
     * 盘子：2 3 5 2 4
     * <p>
     * 最终有4个盘子落在井内。
     * 本题由 @javaman 翻译。
     * 输入
     * 第1行：2个数N, M中间用空格分隔，N为井的深度，M为盘子的数量(1 <= N, M <= 50000)。
     * 第2 - N + 1行，每行1个数，对应井的宽度Wi(1 <= Wi <= 10^9)。
     * 第N + 2 - N + M + 1行，每行1个数，对应盘子的宽度Di(1 <= Di <= 10^9)
     * 输出
     * 输出最终落到井内的盘子数量。
     * 输入样例
     * 7 5
     * 5
     * 6
     * 4
     * 3
     * 6
     * 2
     * 3
     * 2
     * 3
     * 5
     * 2
     * 4
     * 输出样例
     * 4
     * <
     * 思路：初始化井，由上到下变成从大到小，因为途中可能会卡主
     *      每次放完盘子，把井给变小
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        int[] well = new int[n];
        well[0] = cin.nextInt();
        for (int i = 1; i < n; i++) {
            // 缩小数据
            well[i] = Math.min(cin.nextInt(), well[i - 1]);
        }
        int len = n, ans = 0, j;
        for (int i = 0; i < m; i++) {
            int x = cin.nextInt();
            for (j = 0; j < len; j++) {
                if (x > well[j]) break;
            }
            if (j == 0) {
                //不能继续放盘子
                len = 0;
            } else if (j < len) {
                len = j - 1;
                ans++;
            } else if (j == len) {
                len--;
                ans++;
            }
            if (len == 0) break;
        }
        System.out.println(ans);
    }
}
