
/*
 * @Description: 
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @LastEditors: 靳肖健
 * @Date: 2019-03-24 19:41:53
 * @LastEditTime: 2019-03-24 19:42:12
 */
import java.util.Scanner;

public class Cube_sum2 {

	public static void main(String[] args) {

		System.out.print("请输入一个大于等于6的整数");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int cube[] = new int[n + 1];
		int i = 0, j = 0, k = 0, m = 0;
		long cubesum = 0;

		for (i = 1; i <= n; i++) {
			cube[i] = i * i * i; // 将1……a的立方值赋到数组中
			System.out.print(cube[i] + ",");
		}
		System.out.println();

		for (i = 3; i <= n; i++) {
			for (j = 2; j < i; j++) // 反向求出小于i的立方和
				for (k = j; k < i; k++) {
					cubesum += cube[k];
					if (cubesum == cube[i]) {
						System.out.printf("%d^3 + ...... + %d^3 = %d^3\n", j, k, i);
						cubesum = 0;
						break;
					}
					if (k + 1 == i) {
						cubesum = 0;
						break;
					}

				}
		}

	}
}
