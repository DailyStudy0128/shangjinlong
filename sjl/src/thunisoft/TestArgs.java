package thunisoft;

public class TestArgs {

	private void test1(A a) {
		a.age = 222;
		System.out.println(a.age);

	}

	public static void main(String[] args) {
		TestArgs t = new TestArgs();
		A a = new A();
		a.age = 70;
		t.test1(a);
		System.out.println(a.age);

	}

}

class A {
	public int age = 0;

}
