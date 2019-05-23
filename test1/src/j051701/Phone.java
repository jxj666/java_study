package j051701;

public class Phone {
	private float screen;
	private float cpu;
	private float ram;

	public String getInfo() {
		return screen + " " + cpu + " " + ram;
	}

	public void setScreen(float screen_new) {
		screen = screen_new;
	}

	public Phone() {
		System.out.println("无数据!");

	}

	public Phone(float screen_new, float cpu_new, float ram_new) {
		screen = screen_new;
		cpu = cpu_new;
		ram = ram_new;

	}

	public void call() {
		System.out.println("打电话");
	}

	public void message() {
		System.out.println("发短息");
	}

}
