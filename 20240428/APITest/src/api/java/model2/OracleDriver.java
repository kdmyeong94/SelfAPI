package api.java.model2;

public class OracleDriver implements Connection{
	@Override
	public void getConnection(String url, String username, String password) {
		System.out.println("url, username, pasword 정보를 이용하여 oracle DB를 접속 시도한다.");
		
	}
}
