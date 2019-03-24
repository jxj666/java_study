/*
 * @Description: 
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @LastEditors: 靳肖�?
 * @Date: 2019-03-24 19:13:16
 * @LastEditTime: 2019-03-24 19:17:21
 */
package mathtest;

public class MathTest {
    private int number;
    private int sum;

    public int setSum() {
        sum = sum + number * number * number;
        return sum;
    }

    public int setNumber(int number) {
        this.number = number;
        return number;
    }

    public int getNumber() {
        return number;
    }

    public int getSum() {
        return sum;
    }
}