/*
 * @Description: 
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @LastEditors: 靳肖健
 * @Date: 2019-04-21 21:59:16
 * @LastEditTime: 2019-04-21 22:17:27
 */

//import java.util.*;

//（1）定义一个账户类，包含用户名、密码、余额等属性、存钱、取钱等方法。

public class Account {

  private String user;// 用户名

  private String passcode;// 密码

  private double balance;// 余额

  public Account(String user, String passcode, double balance) {

    this.user = user;

    this.passcode = passcode;

    this.balance = balance;

  }

  public String getUser() {

    return user;

  }

  public void setUser(String user) {

    this.user = user;

  }

  public String getPasscode() {

    return passcode;

  }

  public void setPasscode(String passcode) {

    this.passcode = passcode;

  }

  public double getBalance() {

    return balance;

  }

  public void setBalance(double balance) {

    this.balance = balance;

  }

  // 存钱

  public void savemoney(double money)

  {

    balance += money;

    System.out.printf("%s : 存了%.2f元，账户余额为%.2f元。\n", user, money, balance);

  }

  // 取钱

  public void drawmoney(double money)

  {

    if (balance - money < 0)

    {

      System.out.printf("%s : 账户余额不足，无法取钱", user);

    }

    else

    {

      balance -= money;

      System.out.printf("%s : 取了%.2f元，账户余额为%.2f元。\n", user, money, balance);

    }

  }

  public void show() {

    // 显示账户信息

    System.out.printf("%s : 余额%.2f元\n", user, balance);

  }

}
