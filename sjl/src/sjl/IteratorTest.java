package sjl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("ssss");
		list.add("aaaa");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			if ("ssss".equals(iterator.next())) {
				iterator.remove();
			}
		}
		System.out.println(list);

	}

}
