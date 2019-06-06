package j060502;

public class Employee {

	String name;
	int age;
	String desc;
	double salary;
	int score;

	public Employee(String name, int age, String desc, double salary, int score) {
		this.name = name;
		this.age = age;
		this.desc = desc;
		this.salary = salary;
		this.score = score;
	}

	public void say() {
		System.out.println(name + " " + age + " " + desc + " " + salary);
	}
}
