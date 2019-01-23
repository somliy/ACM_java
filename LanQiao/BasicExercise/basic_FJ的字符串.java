package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/22 15:43
 * @Description:
 */
public class basic_FJ的字符串 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        char[] ch = new char[26];
        for (int i = 0; i < 26; i++) {
            ch[i] = (char) ('A' + i);
        }
        int n = cin.nextInt();
        String ans = "A", tmp = "";
        if(n == 1) {System.out.println(ans);return;}
        for (int i = 1; i < n; i++) {
            tmp = ans;
            ans += ch[i];
            ans += tmp;
        }
        System.out.println(ans);
    }
}
