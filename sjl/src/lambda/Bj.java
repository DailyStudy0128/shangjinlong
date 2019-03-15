package lambda;

public class Bj {

	public static void main(String[] args) {
		String s1="abc";//编译的时候，s1被加载到常量池中，如果常量池包含这个字符串，可直接引用
		String s2=new String("abc");
//		s2=s2.intern();
//		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		final StringBuffer s3=new StringBuffer("abc");
		System.out.println(s2.equals(s3));

	}

}
