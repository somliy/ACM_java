package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/18 18:12
 * @Description:
 */
public class basic_特殊回文数 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int sum = cin.nextInt();
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if (i * 2 + j * 2 + k == sum)
                        System.out.println("" + i + j + k + j + i);
                }
            }
        }
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if (i * 2 + j * 2 + k * 2 == sum)
                        System.out.println("" + i + j + k + k + j + i);
                }
            }
        }
    }
}
