package HDU.greedy;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2018/12/2 21:04
 * @Description:
 */
public class HDU_1049 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            int d = cin.nextInt();
            int time = 0;
            if(n == 0) break;
            while(true) {
                n -= m;
                time ++;
                if(n <= 0) break;
                n += d;
                time++;
            }
            System.out.println(time);
        }
    }
}
