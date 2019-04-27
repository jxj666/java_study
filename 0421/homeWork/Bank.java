
/*
 * @Description: 
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @LastEditors: 靳肖健
 * @Date: 2019-04-21 21:58:53
 * @LastEditTime: 2019-04-21 22:16:36
 */

import java.util.*;

//（2）定义一个银行类，包含银行名、账户列表等属性，开账户、查账户的功能。账户列表可以使用集合相关的类，如ArrayList，最好同时使用泛型。

public class Bank {

  public String BankName;

  private ArrayList<Account> account;

  Bank(String bankName) {

    this.BankName = bankName;

    account = new ArrayList<Account>();

  }

  public Bank(String BankName, ArrayList<Account> account) {

    this.BankName = BankName;

    this.account = account;

  }

  // 开账户

  public void OpenAccount(String user, String passcode, double money)

  {

    account.add(new Account(user, passcode, money));

  }

  // 查找账户按用户名,若找到，返回该账户，否则，返回null

  public Account SeekAccount(String username)

  {

    for (Account account : account)

    {

      if (username.equals(account.getUser()))

        return account;

    }

    return null;

  }

  // 显示该用户账户信息

  public void showAccount(String userName) {

    Account account = SeekAccount(userName);

    if (account == null)

      System.out.println("该账户不存在。");

    else

      account.show();

  }

  // 向特定账户存钱

  public void saveMoney(String userName, double money) {

    Account account = SeekAccount(userName); // 查找

    if (account == null)

      System.out.println("该账户不存在。");

    else

      account.savemoney(money);

  }

  // 从特定账户取钱,需验证密码

  public void drawMoney(String userName, double money, String password) {

    Account account = SeekAccount(userName); // 查找

    if (account == null)

      System.out.println("该账户不存在。");

    else

    {

      if (password.equals(account.getPasscode()))

      {

        account.drawmoney(money);

      }

      else

      {

        System.out.printf("%s : 密码不正确，取钱失败。\n", userName);

      }

    }

  }

}
