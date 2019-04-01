/*
 * @Description: 
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @LastEditors: ???
 * @Date: 2019-03-31 23:01:19
 * @LastEditTime: 2019-03-31 23:35:55
 */
public class Bat extends Animal implements Flyable {
  int age;

  @Override
  public void takeoff() {
    System.out.println("Bat is takeoff!");
  }

  @Override
  public void fly() {
    int Batspeed = getspeed();
    System.out.printf("Bat fly %.2f seconds at a speed of %3d\n", FLYLENGTH / Batspeed, Batspeed);
  }

  @Override
  public void land() {
    System.out.println("Bat is land");
  }

  @Override
  public void sayhello() {
    System.out.println("hello! I'm Bat");
  }

  void intro() {
    System.out.printf("age:%d, sex:%s", age, getsex());
  }

  Bat() {
    super(100, "no need");
    age = 18;
  }
}
