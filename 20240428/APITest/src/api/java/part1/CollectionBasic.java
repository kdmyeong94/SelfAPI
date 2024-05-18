package api.java.part1;

import java.util.ArrayList;

public class CollectionBasic {
	public static void main(String[] args) {
		// ArrayList에 10,20,30,40,50 5개의 정수를 저장하고 출력하세요.
		// ArrayList -> Object[] <-x- int
		// ArrayList -> Object[] <-o(Auto-boxing:Integer)- Integer(Wrapper)
		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(new Integer(10));
		list.add(10); // new Integer(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		// int <--(Auto-unboxing)-- Integer
		for(int data : list) {
			System.out.println(data);
		}
	}
}
