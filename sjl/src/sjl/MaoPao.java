package sjl;

public class MaoPao {
    public int i;
//    public String n;
	public static void main(String[] args) {
		int[] array = { 2, 6, 4, 8, 7 };
		boolean flag = true;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					flag = true;

				}

			}
			if (!flag) {
				break;
			}

		}
		System.out.print("排序后--------------------------");
		System.out.println();
		for (int num : array) {
			System.out.print(num + "\t");
		}

	}

}
