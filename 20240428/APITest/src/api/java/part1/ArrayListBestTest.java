package api.java.part1;

import java.util.ArrayList;
import java.util.List;

import api.java.model.Book;

public class ArrayListBestTest {
	public static void main(String[] args) {
		// Book 3권을 배열에 저장하고 출력하세요.
		// Book[], Object[]
		List<Book> list = new ArrayList<Book>(); // 기본크기 (10);
		list.add(new Book("자바", 15000, "한빛", "홍길동"));
		list.add(new Book("C++", 17000, "대림", "이길동"));
		list.add(new Book("Python", 16000, "정보", "나길동"));

		Book vo = list.get(0); // Book <--- (Book)Object
		System.out.println(vo);

		vo = list.get(1); // Book <--- (Book)Object
		System.out.println(vo);

		vo = list.get(2); // Book <--- (Book)Object
		System.out.println(vo);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // Object -> Book(JVM에서 자동으로 Book의 ToString())
		}
	}
}
