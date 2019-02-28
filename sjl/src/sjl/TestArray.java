package sjl;

public class TestArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 11, 22, 10, 3, 4, 2, -55, 44 };

		ArrayUtil au = new ArrayUtil();
		int max = au.getMax(arr);
		System.out.println("最大值：" + max);
		au.printArray(arr);
		au.sort(arr);
	}

}
