package HDU.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2018/12/5 21:04
 * @Description:
 */
public class HDU_2570 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while (t > 0) {
            int n, v, p;
            n = cin.nextInt();
            v = cin.nextInt();
            p = cin.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = cin.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 1; i < n; i++) {
                arr[i] = arr[i-1] + arr[i];
            }
            int index = 0,ansv = 0;
            double ansp = 0.00;
            for(int i = 0; i < n; i++) {
                if((double)arr[i]/(i+1) <= p*1.0) {
                    ansv = v * (i+1);
                    ansp = (double)arr[i]/(i+1);
                }else break;
            }
            System.out.println(ansv + " " + String.format("%.2f", ansp/100));
            t--;
        }
    }
}
