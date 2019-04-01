/*
 * @Description: 
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @LastEditors: 靳肖健
 * @Date: 2019-03-24 21:03:18
 * @LastEditTime: 2019-03-24 21:47:18
 */
public class Test1 {
  public static void main(String[] args) {
    int[] a = new int[105];
    for (int i = 2; i < a.length; i++) {
      a[i] = 1;
    }
    // 用“埃氏筛法”求2～100以内的素数。
    for (int i = 2; i <= 100; i++) {
      if (a[i] == 1) {
        int j = i + 1;
        while (j <= 100) {
          if (a[j] == 1 && j % i == 0) {
            a[j] = 0;
          }
          j++;
        }
      }
    }
    for (int i = 2; i < 101; i++) {
      if (a[i] == 1) {
        System.out.println(i);

      }
    }

  }
}
