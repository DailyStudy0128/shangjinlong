package sjl;

public class Person {

	String name;
	int age;
	int sex;

	public void study() {
		System.out.println("studying");

	}

	public void showAge() {
		System.out.println(age);

	}

	public int addAge(int i) {
		age += i;
		return age;

	}

	public static void main(String args[]) {
		Person p = new Person();
		p.study();
		p.showAge();
		p.addAge(2);
		p.showAge();

		Person p1 = new Person();
		p1.showAge();

	}

}
