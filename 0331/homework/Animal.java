/*
 * @Description: 
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @LastEditors: ½ùÐ¤½¡
 * @Date: 2019-03-31 23:00:07
 * @LastEditTime: 2019-03-31 23:03:34
 */
abstract class Animal {
  private int speed;
  private String sex;

  public int getspeed() {
    return speed;
  }

  public void setspeed(int sp) {
    speed = sp;
  }

  public String getsex() {
    return sex;
  }

  public void sayhello() {
    System.out.println("hello!");
  }

  Animal() {
  }

  public Animal(int speed, String sex) {
    this.speed = speed;
    this.sex = sex;
  }
}
