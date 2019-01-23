package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/22 15:35
 * @Description:
 */
public class basic_Sine之舞 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        sn(n);
        System.out.println();
    }

    public static void an(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("sin(" + i);
            if (i < n)
                System.out.print(i % 2 == 0 ? '+' : '-');
        }
        for (int i = 1; i <= n; i++)
            System.out.print(')');
    }

    public static void sn(int n) {
        for (int i = 1; i < n; i++)
            System.out.print('(');
        for (int i = n; i >= 1; i--) {
            an(n - i + 1);
            System.out.print('+');
            System.out.print(i);
            if (i != 1) System.out.print(')');
        }
    }
}
