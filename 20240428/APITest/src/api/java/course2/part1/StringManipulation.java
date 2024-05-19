package api.java.course2.part1;

public class StringManipulation {
	public static void main(String[] args) {
		// HelloWorld라는 문자열을 생성하세요.
		int a = 10;

//		String str = new String("HelloWorld");
		String str = "HelloWorld";
		char firstChar = str.charAt(1); // 'e'
		String replacedString = str.replaceAll("o", "X"); // 'HellXWXrld
		int index = str.indexOf("W"); // 5 만약 없는 값일 경우 -1 리턴
		int length = str.length(); // 10
		String upperCase = str.toUpperCase(); // HELLOWORLD
		String lowerCase = str.toLowerCase(); // helloworld
		String substring = str.substring(5); // World
		String substring1 = str.substring(5, 8); // Wor
		for(int i = 0; i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		
		

		System.out.println(str);
		System.out.println(firstChar);
		System.out.println(replacedString);
		System.out.println(index);
		System.out.println(length);
		System.out.println(upperCase);
		System.out.println(lowerCase);
		System.out.println(substring);
		System.out.println(substring1);

	}
}
