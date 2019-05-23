/*
 * @Description: 
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @Date: 2019-03-24 21:59:57
 * @LastEditTime: 2019-05-13 20:31:18
 * @LastEditors: 靳肖健
 */
package proving;

public class Proving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		double x = 0;
		double r = Math.pow(6, 3);

		for (i = 3; i < 6; i++) {
			x += Math.pow(i, 3);
		}
		if (x == r) {
			System.out.println("第一个等式： 3^3 + 4^3 + 5^3 = 6^3 成立。");
		} else {
			System.out.println("第一个验证错误!!!");
		}

		int j;
		double y = 0;
		double z = Math.pow(180, 3);
		for (j = 6; j < 70; j++) {
			y += Math.pow(j, 3);
		}
		if (y == z) {
			System.out.println("第二个等式： 6^3 + 7^3 +...+ 69^3 = 180^3 成立。");
		} else {
			System.out.println("第二个验证错误!!!");
		}

	}

}
