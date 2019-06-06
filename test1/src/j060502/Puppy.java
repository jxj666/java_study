package j060502;

public class Puppy {
	String name = "";
	int age = 0;

	public Puppy() {

	}

	public void SetAge(int age) {
		this.age = age;
	}

	public int getAge() {
		System.out.println(name + " : " + age);
		return age;
	}

	public Puppy(String name) {
		this.name = name;
		System.out.println("name : " + name);

	}

}
