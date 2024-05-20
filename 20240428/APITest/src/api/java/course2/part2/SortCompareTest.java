package api.java.course2.part2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCompareTest {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동","김길동","이길동");
		Collections.sort(names, String::compareTo);
		
		System.out.println(names);
		
		System.out.println("--------");
		for(String name : names) {
			System.out.println(name);
		}
	}
}
