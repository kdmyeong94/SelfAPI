package api.java.model;

import java.util.Arrays;

public class BookArray {
	private static final int DEFAULT_CAPACITY = 5;
	private Book[] elements;
	private int size = 0;
	
	// 생성 동작
	public BookArray() {
		elements = new Book[DEFAULT_CAPACITY]; // 5개 크기 배열
	}
	
	//원소의 개수를 넘겨주는 동작
	public int size() {
		return size;
	}
	
	// 얻는 동작
	public Book get(int index) { // -1, 5~
		// index체크 if
		if(index <0 || index >= size) {
			throw new IndexOutOfBoundsException("범위초과");
		}
		return elements[index];
	}
	
	
	// 저장하는 동작
	public void add(Book element) {
		// 크기 체크?
		if(size ==elements.length) {
			//크기를 2배로 늘리는 작업
			ensureCapacity();
		}
		elements[size++]= element;
	}
	

	
	private void ensureCapacity() {
		int newCapacity = elements.length*2;
		elements = Arrays.copyOf(elements, newCapacity);
	}


	
	
}
