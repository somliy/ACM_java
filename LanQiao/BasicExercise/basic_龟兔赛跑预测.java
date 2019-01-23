package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/22 17:11
 * @Description:
 */
public class basic_龟兔赛跑预测 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v1 = in.nextInt();
        int v2 = in.nextInt();
        int t = in.nextInt();
        int s = in.nextInt();
        int l = in.nextInt();
        int l1 = 0;
        int l2 = 0;
        int breakTime = 0;
        int flag = 1;
        int countTime = 0;
        while (l1 < l && l2 < l) {
            if (flag == 1 && l1 - l2 < t || flag == 0 && breakTime >= s) {
                flag = 1;
                l1 += v1;
                breakTime = 0;
            } else {
                flag = 0;
                breakTime++;
            }
            l2 += v2;
            countTime++;
        }
        if (l1 > l2) {
            System.out.println("R\n" + countTime);
        } else if (l1 < l2) {
            System.out.println("T\n" + countTime);
        } else if (l1 == l2) {
            System.out.println("D\n" + countTime);
        }
    }
}
