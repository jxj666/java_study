package j060502;

public class test3 {

	boolean compare(Employee e1, Employee e2) {
		return e1.score > e2.score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("xiaojia", 22, "巨魔导师", 100000, 88);
		Employee e2 = new Employee("xiaobai", 18, "巨魔", 10000, 22);
		test3 t3 = new test3();
		e1.say();
		e2.say();
		boolean key = true;
		key = t3.compare(e1, e2);

		System.out.println("一强于二" + key);

	}

}
