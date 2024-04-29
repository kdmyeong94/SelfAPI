package api.java.model;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IntArray {
	private final int DEFAULT_CAPACITY =5; // 수정불가(final) => 상수
	private int[] elements;
	private int size =0;
	
	// 생성 동작
	public IntArray() {
		elements = new int[DEFAULT_CAPACITY]; // 5개 크기 배열
	}
	
	// 저장하는 동작
	public void add(int element) {
		// 크기 체크?
		if(size ==elements.length) {
			//크기를 2배로 늘리는 작업
			ensureCapacity();
		}
		elements[size++]= element;
	}
	
	// 얻는 동작
	public int get(int index) { // -1, 5~
		// index체크 if

		return elements[index];
	}
	
	
	private void ensureCapacity() {
		int newCapacity = elements.length*2;
		elements = Arrays.copyOf(elements, newCapacity);
	}

	//원소의 개수를 넘겨주는 동작
	public int size() {
		return size;
	}
	
}
