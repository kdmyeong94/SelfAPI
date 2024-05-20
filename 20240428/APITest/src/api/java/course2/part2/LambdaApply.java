package api.java.course2.part2;

import api.java.model2.StringOperation;

public class LambdaApply {
	public static void main(String[] args) {
		//람다 표현식으로 모든 문자를 대문자로
		StringOperation toUpperCase = s -> s.toUpperCase();
		StringOperation toLowerCase = s -> s.toLowerCase();
		
		
		String input = "Lambda Expressions";
		System.out.println(processString(input, toUpperCase));
		System.out.println(processString(input, toLowerCase));
	}
	
	public static String processString(String input, StringOperation operation) {
		return operation.apply(input);
	}
	
}
