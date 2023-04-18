package 컬렉션2;

import java.util.HashMap;

public class 우승자투표찾기_map {
	public static void main(String[] args) {
		String[] all = { "홍길동", "김길동", "정길동", "홍길동", "김길동", "홍길동" };
		String[] find = { "홍길동", "김길동", "정길동" };

		HashMap<String, Integer> map = new HashMap<>();

		for (String x : find) {
			map.put(x, 0);
		}
		System.out.println(map);
		System.out.println(map.get("홍길동"));
		// map.put("홍길동", 10);
		System.out.println(map);
		for (String x : all) {
			//System.out.println(map.get(x) + 1);
			map.put(x, map.get(x)+1);
		}
		System.out.println(map);
		System.out.println(map.get("홍길동"));
		int max = 0;
		for (String key : map.keySet()) {			
			System.out.println(key + " : " + map.get(key));
			if (map.get(key) > max) {
				max = map.get(key);
				System.out.println("우승자 : " + key);
			}
		}
	}
}