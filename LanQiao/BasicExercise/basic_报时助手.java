package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/25 20:45
 * @Description:
 */
public class basic_报时助手 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int h, m;
        h = cin.nextInt();
        m = cin.nextInt();
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three"};
        System.out.print(arr[h]+" ");
        if (m == 0) System.out.print("o'clock");
        int t = m % 10;
        m = m / 10;
        switch (m) {
            case 2: System.out.print("twenty ");break;
            case 3: System.out.print("thirty ");break;
            case 4: System.out.print("forty ");break;
            case 5: System.out.print("fifty ");break;
            default: break;
        }
        if (m == 0 && t != 0) System.out.print(arr[t]);
        if (m == 1) System.out.print(arr[t + 10]);
        if (m != 0 && m != 1 && t != 0) System.out.print(arr[t]);
    }
}
