package api.java.course2.part2;

import api.java.model2.Converter;
import api.java.model2.IntegerUtils;

public class IntegerUtilsTest {
	public static void main(String[] args) {
		Converter<String, Integer> converter = IntegerUtils::stringToInt;
		Integer result = converter.convert("123");
		System.out.println(result);
		
	}
}
