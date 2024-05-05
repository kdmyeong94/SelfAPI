package api.java.part1;

import java.util.Scanner;

public class StringSplit {
	public static void main(String[] args) {
		// 특정구분자 ','를 기준으로 분리하여 출력하세요.
		String str = "Hello,World,Java";
		String[] strArray = str.split(",");

		for (String a : strArray) {
			System.out.println(a);
		}

		// 정규표현식을 사용하여 공백을 구분자로 사용합니다.
		String str1 = "Hello World Java";
		String[] strArray1 = str1.split("\\s+");

		for (String a : strArray1) {
			System.out.println(a);
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요:");
		String str2 = sc.nextLine();

		String[] strArray2 = str2.split("\\s+");

		for (String a : strArray2) {
			System.out.println(a);
		}
	}
}
