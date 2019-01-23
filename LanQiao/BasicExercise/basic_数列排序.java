package LanQiao.BasicExercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/18 18:31
 * @Description:
 */
public class basic_数列排序 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (i != n - 1) System.out.print(arr[i] + " ");
            else System.out.println(arr[i]);
        }
    }

}
