package sjl;

public class ShuiXianHua {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		for (int i = 100; i < 1000; i++) {
			int j = i / 100;
			int k = i % 100 / 10;
			int l = i % 10;
			if (i == Math.pow(j, 3) + Math.pow(k, 3) + Math.pow(l, 3)) {
				System.out.println(i);
			}

		}

	}

}
