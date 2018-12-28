package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * ���������������ݿ�
 * 
 */
public class DBUtil {
	public static void main (String args[]) throws Exception{
		Connection conn=DBUtil.getConnection();
		System.out.println(conn);
		DBUtil.close(conn);
	}

	public static void close(Connection conn){
		try{
			if(conn!=null){
				conn.close();
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws Exception{
		Connection conn=null;
		//ע���������

		Class.forName("com.mysql.jdbc.Driver");

		//��������
		conn=DriverManager.getConnection("jdbc:mysql:///test", "root", "123456");

		return conn;
	}
}
