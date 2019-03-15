package sjl;

public class FengZ {
	static {
		System.out.println("父类静态代码块");
	}
	{
		System.out.println("父类普通代码块");
	}

	public FengZ() {
		System.out.println("父类构造方法");
	}

	public static void main(String[] args) {
		new M();
		//new FengZ();
	}

}

class M extends FengZ {
	static {
		System.out.println("子类静态代码块");
	}
	{
		System.out.println("子类普通代码块");
	}

	public M() {
		System.out.println("子类构造方法");
	}
}
