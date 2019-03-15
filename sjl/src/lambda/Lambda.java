package lambda;


public class Lambda {
	
	public static Runnable getRunnable() {
		return ()->{
			System.out.println("hello world");
		};
		
	}
	public static void main(String[] args) {
		new Thread(getRunnable()).start();;
		
	}



}
