
/*
 * @Description: 
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @LastEditors: ???
 * @Date: 2019-03-31 23:02:55
 * @LastEditTime: 2019-04-01 11:09:28
 */
import java.util.List;
import java.util.ArrayList;

public class Flying {
  public static void main(String[] args) {
    List<Flyable> Anlist = new ArrayList<>();
    for (int i = 0; i < 2; ++i) {
      Bat bat0 = new bat();
      bat0.setspeed((int) (Math.random() * 20));
      Anlist.add(bat0);
      Bird bird0 = new Bird();
      bird0.setspeed(5);
      Anlist.add(bird0);
    }
    for (Flyable animal : Anlist) {
      animal.takeoff();
      animal.fly();
      animal.land();
    }
  }
}
