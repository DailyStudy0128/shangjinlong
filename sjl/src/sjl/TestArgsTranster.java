package sjl;

public class TestArgsTranster {

	public static void main(String[] args) {
		TestArgsTranster t = new TestArgsTranster();
		int i = 20;
		t.name(i);
		System.out.println("main中的i："+i);

	}

	public void name(int i) {
		i = 10;
		System.out.println("name中值s：" + i);
	}

}
