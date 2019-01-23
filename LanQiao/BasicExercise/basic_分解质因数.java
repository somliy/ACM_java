package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/22 11:05
 * @Description:
 */
public class basic_分解质因数 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        for (int i = a; i <= b; i++) {
            solve(i);
        }
    }

    public static void solve(int n) {
        int x = n;
        System.out.print(n + "=");
        for (int i = 2; i <= x; i++) {
            while (x % i == 0) {
                if (n == x) System.out.print(i);
                else System.out.print("*" + i);
                x /= i;
            }
        }
        System.out.println();
    }
}
