package api.java.course2.part2;

import api.java.model2.Converter;
import api.java.model2.StringUtils;

public class StringUtilsTest {
	public static void main(String[] args) {
		StringUtils stringUtils = new StringUtils();
		Converter<String, String> converter = stringUtils::reverse;
		String result = converter.convert("hello");
		System.out.println(result);
	}
}
