package api.java.model2;

public class StringUtils {
	// 인스턴스 메서드 ( static이 없기 때문)
	public String reverse(String s) {
		return new StringBuffer(s).reverse().toString();
	}
}
