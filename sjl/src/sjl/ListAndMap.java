package sjl;

import java.util.*;

public class ListAndMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("1", "aa");
		map1.put("2", "bb");
		map1.put("3", "cc");
		list.add(map1);
		// for循环遍历
		for (Map<String, Object> map : list) {
			for (String s : map.keySet()) {
				System.out.println(map.get(s));
			}
		}
		System.out.println();
		System.out.println("--------------------------------");
		// iterator遍历
		for (int i = 0; i < list.size(); i++) {
			Map<String, Object> map = list.get(i);
			Iterator<String> iterator = map.keySet().iterator();
			while (iterator.hasNext()) {// 查找可以迭代的元素
				String s1 = (String) iterator.next();// 获取迭代的下一个元素
				System.out.println(map.get(s1));
				
			}
		}

	}

}
