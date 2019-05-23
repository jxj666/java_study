package j051701;

public class InitalTelphone {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone = new Phone(2.4f, 7.0f, 7.12f);
		phone.setScreen(5.1f);
		System.out.println(phone.getInfo());
		phone.call();
	}

}
