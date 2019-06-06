package j052401;

import j051701.Phone;

final public class SmartPhone extends Phone implements IPlayGame {
	int version = 2;

	public void call() {
		System.out.println("智能手机查内容,打电话");
	}

	public void baseCall() {
		super.call();
	}

	public void playGame() {
		System.out.println("可以玩游戏!");
	}

	@Override
	public String toString() {
		return "SmartPhone [getInfo()=" + getInfo() + "]";
	}

}
