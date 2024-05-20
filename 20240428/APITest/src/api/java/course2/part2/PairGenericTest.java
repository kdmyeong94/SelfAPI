package api.java.course2.part2;

import java.util.HashMap;
import java.util.Map;

import api.java.model2.Pair;

public class PairGenericTest {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<String, Integer>("hello", 1);
		
		System.out.println(pair.getKey());
		System.out.println(pair.getValue());
		
		// 검색을 빠르게 할 수 있는 자료구조 (HashMap, Hashtable)
		Map<String, Integer> maps = new HashMap<String, Integer>();
		
		maps.put("kor", 60);
		maps.put("eng", 80);
		maps.put("math", 70);
		
		System.out.println(maps.get("kor"));
		System.out.println(maps.get("eng"));
		System.out.println(maps.get("math"));
		
	}
}
