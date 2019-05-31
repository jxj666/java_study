package j051701;

public class Phone1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone = new Phone(2.4f, 4, 4);
		phone.setScreen(5.1f);
		System.out.println(phone.getInfo());
		phone.call();
	}

}
