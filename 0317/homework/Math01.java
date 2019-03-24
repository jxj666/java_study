/*
 * @Description: 
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @LastEditors: 靳肖健
 * @Date: 2019-03-18 10:38:40
 * @LastEditTime: 2019-03-24 20:44:24
 */

public class Math01 {

    public static void main(String[] args) {

        long leftNum1 = cube(3) + cube(4) + cube(5);
        long rightNum1 = cube(6);

        if (leftNum1 == rightNum1) {
            System.out.println(" 3^2?+4^2?+5^2?=6^3? right");
        } else {
            System.out.println(" 3^2?+4^2?+5^2?=6^3? error");
        }

        long leftNum2 = 0;
        for (int i = 6; i <= 69; i++) {
            leftNum2 = leftNum2 + cube(i);
        }
        long rightNum2 = cube(180);

        if (leftNum2 == rightNum2) {
            System.out.println(" 6^2+7^2+......+69^2=180^3 right");
        } else {
            System.out.println(" 6^2+7^2+......+69^2=180^3 error");
        }
    }

    // 计算数的立方
    private static long cube(long factor) {
        return factor * factor * factor;
    }
}