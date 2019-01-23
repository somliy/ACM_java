package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/22 15:00
 * @Description:
 */
public class basic_数的读法 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        change(n);
    }

    private static void change(int n) {
        String[] c = {"ling ", "yi ", "er ", "san ", "si ", "wu ", "liu ", "qi ", "ba ", "jiu "};
        String[] d = {"", "shi ", "bai ", "qian ", "wan ", "shi ", "bai ", "qian ", "yi ", "shi ", "bai "};
        String str = n + "";
        String buffer = new String();
        boolean flag = true;
        int i, j;
        for (i = 0; i < str.length(); i++) {
            for (j = 0; j <= 9; j++)
                if (str.charAt(i) == j + '0')
                    break;
            if ((str.length() + 2) % 4 == 0 && i == 0 && j == 1) {
                buffer += d[str.length() - i - 1];
            } else if (i != str.length() - 1 && j == 0) {
                if (flag) {
                    buffer += c[j];
                    flag = false;
                }
            } else if (i == str.length() - 1 && j == 0) {
                if (!flag)
                    buffer = buffer.substring(0, buffer.length() - 5);
            } else {
                buffer += c[j] + d[str.length() - i - 1];
                flag = true;
            }
        }
        System.out.println(buffer);
    }
}
