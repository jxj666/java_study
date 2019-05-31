package j051701;

public class Phone extends Mobile {
	int version = 1;
	private float screen = 5.0f;
	private int cpu = 2;
	private int ram = 2;

	public Phone() {
		System.out.println("缺少必要数据!默认设定!");

	}

	public Phone(float screen, int cpu, int ram) {
		this.screen = screen;
		this.cpu = cpu;
		this.ram = ram;

	}

	public String getInfo() {
		return " screen:" + screen + " cpu:" + cpu + " ram:" + ram;
	}

	public void setScreen(float screen) {
		this.screen = screen;
	}

	public void call() {
		System.out.println("打电话");
	}

	public void message() {
		System.out.println("发短息");
	}

}
