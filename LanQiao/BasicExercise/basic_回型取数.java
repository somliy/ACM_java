package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/25 20:28
 * @Description:
 */
public class basic_回型取数 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m = cin.nextInt();
        int n = cin.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = cin.nextInt();
            }
        }
        int tot = 0, x = -1, y = 0;
        while (tot < m * n) {
            while (x + 1 < m && arr[x + 1][y] != -1) {
                System.out.print(arr[++x][y] + " ");
                arr[x][y] = -1;
                ++tot;
            }
            while (y + 1 < n && arr[x][y + 1] != -1) {
                System.out.print(arr[x][++y] + " ");
                arr[x][y] = -1;
                ++tot;
            }
            while (x - 1 >= 0 && arr[x - 1][y] != -1) {
                System.out.print(arr[--x][y] + " ");
                arr[x][y] = -1;
                ++tot;
            }

            while (y - 1 >= 0 && arr[x][y - 1] != -1) {
                System.out.print(arr[x][--y] + " ");
                arr[x][y] = -1;
                ++tot;
            }
        }
    }
}
