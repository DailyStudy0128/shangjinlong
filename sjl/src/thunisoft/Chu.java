package thunisoft;

public class Chu implements Compute {

	@Override
	public int computer(int n, int m) {
		// TODO Auto-generated method stub
		try {
			return n / m;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return -1;
	}

}
