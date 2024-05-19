package api.java.course2.part1;

import api.java.model.MinMaxFinder;

public class MinMaxFinderTest {
	public static void main(String[] args) {
		
		int[] arr = {5,3,9,1,7};
		int min = MinMaxFinder.findMin(arr);
		int max = MinMaxFinder.findMax(arr);
		
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
	}
}
