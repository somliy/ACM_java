package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/18 17:01
 * @Description:
 */
public class basic_字母图形 {
    public static void main(String[] args) {
        char[] str = new char[51];
        for (int i = 0; i < 26; i++) {
            str[25 + i] = str[25 - i] = (char) ('A' + i);
        }
        Scanner cin = new Scanner(System.in);
        String string = String.valueOf(str);
        int n = cin.nextInt();
        int m = cin.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println(string.substring(25-i,25-i+m));
        }
    }
}
