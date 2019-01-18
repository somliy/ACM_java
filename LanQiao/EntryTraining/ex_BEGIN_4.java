package LanQiao.EntryTraining;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/17 22:44
 * @Description:
 */
public class ex_BEGIN_4 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        if (n == 1 || n == 2) System.out.println(1);
        else System.out.println(calculation(n - 2));
    }

    public static int calculation(int x) {
        int f1 = 1, f2 = 1, ans = 0, mod = 10007;
        for (int i = 1; i <= x; i++) {
            ans = (f1 + f2) % mod;
            f1 = f2;
            f2 = ans;
        }
        return ans;
    }
}
