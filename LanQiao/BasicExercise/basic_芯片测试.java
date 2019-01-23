package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/22 15:58
 * @Description:
 */
public class basic_芯片测试 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = cin.nextInt();
                if (x == 1) ans[j]++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (ans[i] > (n/2))
                System.out.print(i + 1 + " ");
        }
        System.out.println();
    }
}
