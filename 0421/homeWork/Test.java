/*
 * @Description: 
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @LastEditors: 靳肖健
 * @Date: 2019-04-21 21:58:38
 * @LastEditTime: 2019-04-21 22:03:48
 */

public class Test {

  public static void main(String[] args) {

    Bank bank = new Bank("china Bank");

    bank.OpenAccount("user_a", "666666", 999999);

    bank.OpenAccount("user_b", "99999", 10000);

    bank.OpenAccount("user_c", "222222", 4000);

    // 存钱

    bank.saveMoney("user_c", 100);

    // 从特定账户取钱,需验证密码

    bank.drawMoney("user_c", 1000, "222222");

    // 显示账户信息

    bank.showAccount("user_c");

    // 存钱

    bank.saveMoney("user_b", 10000);

    // 密码错误，取钱失败的情况

    bank.drawMoney("user_b", 20000, "222222");

    // 余额不足的情况

    bank.drawMoney("user_a", 1000000, "666666");

  }

}
