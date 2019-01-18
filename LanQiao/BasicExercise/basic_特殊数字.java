package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/18 17:56
 * @Description:
 */
public class basic_特殊数字 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        for (int i = 100; i <= 999; i++) {
            int a = i / 100;
            int b = (i - a * 100) / 10;
            int c = i % 10;
            if (a * a * a + b * b * b + c * c * c == i)
                System.out.println(i);
        }
    }
}
