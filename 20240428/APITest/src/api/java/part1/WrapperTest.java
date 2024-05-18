package api.java.part1;

public class WrapperTest {
	public static void main(String[] args) {
		// 정수형 변수에 10을 저장하세요.
		
		int a = 10; // 기본 자료형
//		Integer aa = new Integer(a); // 사용자정의 자료형
		Integer aa = a; // auto-boxing
		
		System.out.println(aa.intValue()); // Unboxing(Integer -> int)
		
		Integer bb = 20;
		
		System.out.println(bb); // Auto-boxing
		int b = bb; // Unboxing
		
		System.out.println(b);
		
		float f = 10.5f;
		
//		Float ff = new Float(f);
		Float ff = f; // Auto-boxing
		System.out.println(ff.floatValue());
		
		Float af = 49.1f;
		
		float aff = af; // Auto-unboxing
		
	}
}
