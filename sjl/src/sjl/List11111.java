package sjl;

import java.util.*;

/*
 * @author
 * 
 */

public class List11111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> oldlist = new ArrayList<Integer>();
		oldlist.add(11);
		oldlist.add(22);
		oldlist.add(33);
		oldlist.add(33);
		System.out.println(oldlist.indexOf(11));
		System.out.println(oldlist.lastIndexOf(11));
		System.out.println("去重前-----------------");
		for (Integer l1 : oldlist) {
			System.out.println(l1);
		}
//		Set<Integer> set = new HashSet<Integer>();
//		set.addAll(list);
//		for (Integer l : set) {
//			System.out.println(set);
//		}
		System.out.println("去重后---------------");
		List<Integer> newlist = new ArrayList<>(new HashSet<>(oldlist));
		for (Integer l : newlist) {
			System.out.println(l);
		}
		int[] num = new int[] { 4, 2, 7, 2, 4, 9 };
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= num.length - 1; i++) {
			if (!list.contains(num[i])) {// list中如果不包含数组内容
				list.add(num[i]);
			}
		}
		System.out.println(list);
	}

}
