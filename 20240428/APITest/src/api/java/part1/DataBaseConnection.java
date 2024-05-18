package api.java.part1;

import api.java.model2.Connection;
import api.java.model2.MSSQLDriver;
import api.java.model2.MySQLDriver;
import api.java.model2.OracleDriver;

public class DataBaseConnection {
	public static void main(String[] args) {
		//oracle DB 접속
		Connection conn = new OracleDriver();
		conn.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "system", "manager");
		
		
		//mysql DB접속
		conn = new MySQLDriver();
		conn.getConnection("jdbc:mysql://localhost:3306/test", "root", "12345");
		
		// mssql DB 접속
		conn = new MSSQLDriver();
		conn.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=mem", "sa", "12345");		
	}
}
