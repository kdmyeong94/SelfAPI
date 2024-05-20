package api.java.course2.part2;

import api.java.model2.MathOperation;

public class LambdaExample {
	public static void main(String[] args) {
		
		// 익명함수방법
//		MathOperation add = new MathOperation() {
//			
//			@Override
//			public int operation(int x, int y) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};
		
		//MathOperation add = (int x, int y) -> {return x+y;};
		MathOperation add = (x, y) -> x+y;
		MathOperation multi = (x, y) -> x*y;
		 
		
		int result = add.operation(10, 20);
		System.out.println(result);
		
		int mulresult = multi.operation(10, 20);
		System.out.println(mulresult);
		
		
	}
}
