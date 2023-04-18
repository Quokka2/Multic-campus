package 컬렉션2;

import java.util.Iterator;
import java.util.LinkedList;

public class queue확인문제 {

	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<>();
		queue.offer("추가1");
		queue.add("추가2");
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.element());
		System.out.println(queue.isEmpty());
		Iterator<String> list = queue.iterator();
		System.out.println(queue.get(0));
		for (String x : queue) {
			System.out.println(x);
		}
		if (list.hasNext()) {
			System.out.println(list.next());
		}
	}
}
