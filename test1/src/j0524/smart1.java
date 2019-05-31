package j0524;

public class smart1 {
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.call();
		smartPhone.baseCall();
		System.out.println(smartPhone.getInfo());
		System.out.println(smartPhone);
		IPlayGame ip1 = new SmartPhone();
		ip1.playGame();

		IPlayGame ip3 = new IPlayGame() {
			@Override
			public void playGame() {
				System.out.println("使用内部类");
			}
		};
		ip3.playGame();
	}

}
