package api.java.course2.part2;

import api.java.model2.Movie;
import api.java.model2.ObjectArr;

public class GenericTest {
	public static void main(String[] args) {
//		ObjectArr<String> array = new ObjectArr<>(5);
//		array.set(0, "Hello");
//		array.set(1, "World");
//		array.set(2, "Java");
//		array.set(3, "Generic");
//		
//		for (int i = 0; i < array.size();i++) {
//			System.out.println(array.get(i));
//		}
		
		ObjectArr<Movie> mList = new ObjectArr<>(5);
		mList.set(0, new Movie("괴물","봉준호","2006","한국"));
		mList.set(1, new Movie("기생충","봉준호","2019","한국"));
		mList.set(2, new Movie("완벽한 타인","이재규","2018","한국"));
		
		for(int i = 0;i<mList.size();i++) {
			System.out.println(mList.get(i));
		}
	
	}

}
