/*
 * @Description: 
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @LastEditors: ½ùÐ¤½¡
 * @Date: 2019-03-31 23:01:58
 * @LastEditTime: 2019-03-31 23:35:42
 */
public class Bird extends Animal implements Flyable {
  int age;

  @Override
  public void takeoff() {
    System.out.println("Bird is takeoff");
  }

  @Override
  public void fly() {
    int birdspeed = getspeed();
    System.out.printf("Bird fly %.2f seconds in a speed of %3d", FLYLENGTH / birdspeed, birdspeed);
  }

  @Override
  public void land() {
    System.out.println("Bird is land");
  }

  @Override
  public void sayhello() {
    System.out.println("hello! I'm Bird");
  }

  void intro() {
    System.out.printf("age:%d, sex:%s", age, getsex());
  }

  Bird() {
    super(200, "man");
    age = 5;
  }
}
