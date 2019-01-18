package LanQiao.EntryTraining;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/17 22:32
 * @Description:
 */
public class ex_BEGIN_3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int r = cin.nextInt();
        double ans = Math.PI * r * r;
        System.out.println(String.format("%.7f", ans));
    }
}
