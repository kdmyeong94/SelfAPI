package api.java.course2.part2;

import java.util.ArrayList;
import java.util.List;

import api.java.model2.Movie;

public class ArrayListGeneric {
	public static void main(String[] args) {
		List list = new ArrayList(5); // Object[]
		list.add(new Movie("괴물", "봉준호", "2006", "한국"));
		list.add("Hello"); // x
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}
}
