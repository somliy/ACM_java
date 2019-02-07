package LanQiao.BasicExercise;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/1/25 20:28
 * @Description:
 */
public class basic_回型取数 {
    /**
     *基础练习 回形取数
     * 描述
     *
     * 回形取数就是沿矩阵的边取数，若当前方向上无数可取或已经取过，则左转90度。一开始位于矩阵左上角，方向向下。
     *
     *
     * 输入
     *
     * 输入描述:
     *
     * 输入第一行是两个不超过200的正整数m, n，表示矩阵的行和列。接下来m行每行n个整数，表示这个矩阵。
     *
     * 输入样例:
     *
     * 3 3
     *
     * 1 2 3
     *
     * 4 5 6
     *
     * 7 8 9
     *
     *
     * 输出
     *
     * 输出描述:
     *
     * 输出只有一行，共mn个数，为输入矩阵回形取数得到的结果。数之间用一个空格分隔，行末不要有多余的空格。
     *
     * 输出样例:
     *
     * 1 4 7 8 9 6 3 2 5
     *
     * 思路： 模拟转圈取数
     * @param args
     */
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
