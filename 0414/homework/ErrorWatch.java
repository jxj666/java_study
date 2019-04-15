
/*
 * @Description: 
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @LastEditors: ???
 * @Date: 2019-04-14 21:43:10
 * @LastEditTime: 2019-04-14 23:12:27
 */

public class ErrorWatch extends Exception {

	private int i1, i2;

	public ErrorWatch(int n1, int n2) {

		i1 = n1;

		i2 = n2;

	}

	public String toString() {

		return "ErrorWatch=> " + i1 + "," + i2;

	}

}
