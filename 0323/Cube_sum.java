
/*
 * @Description: 
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @LastEditors: 靳肖健
 * @Date: 2019-03-24 19:41:53
 * @LastEditTime: 2019-03-24 19:42:34
 */
import java.util.Scanner;

class Cube_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个连续数");
        int n = scanner.nextInt();
        System.out.print("请输入最后一个连续数");
        int m = scanner.nextInt();
        System.out.print("请输入立方数的底数");
        int y = scanner.nextInt();
        int i = 0;
        long cubesum = 0;
        for (i = n; i <= m; i++) {
            cubesum += i * i * i;

        }
        if (cubesum == y * y * y) {
            System.out.printf("您输入的连续数%d......%d与%d^3符合条件。\n", n, m, y);
            System.out.printf("%d^3 + ...... + %d^3 = %d^3\n", n, m, y);
        } else
            System.out.printf("您输入的连续数%d......%d与%d^3不符合条件。", n, m, y);
    }
}