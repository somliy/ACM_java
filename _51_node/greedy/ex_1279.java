package _51_node.greedy;

import java.util.Scanner;

public class ex_1279 {
    /**
     * 1279 扔盘子
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
            if(j == 0){
                //不能继续放盘子
                len = 0;
            } else if (j> 0 && j < len) {
                len = j - 1;
                ans++;
            } else if (j  == len) {
                len--;
                ans++;
            }
            if(len == 0) break;
        }
        System.out.println(ans);
    }
}
