package api.java.model2;
// 인터페이스를 구현한 구현체를 외부에 만들어 놓고 사용
public class MathOperationImpl implements MathOperation{

	@Override
	public int operation(int x, int y) {
		return x+y;
	}
	
}
