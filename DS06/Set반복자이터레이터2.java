package 문자열;

import java.util.HashSet;
import java.util.Iterator;

public class Set반복자이터레이터2 {

	public static void main(String[] args){
		HashSet<Integer> money = new HashSet<>();
		money.add(1000);
		money.add(2000);
		money.add(3000);
		money.add(2000);
		money.add(4000);
		money.add(2000);
		money.add(2000);
		
		Iterator<Integer> it = money.iterator();
		for (int i = 0; i < money.size(); i++) {
			System.out.println(it.next());
		}
		System.out.println("================");
		Object[] list = money.toArray();
		for (Object x : list) {
			System.out.println(x);
		}
	}

}