package down;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.DBUtil;



/**
 * �����������������ݿ���ɾ�Ĳ��
 * @author Dell
 *
 */
public class DAO {
	/*
	 * ���ӷ����ķ���
	 */
	public void save(int love) throws Exception{	
		Connection conn = DBUtil.getConnection();
	//	String sql="INSERT INTO shoot(score) values(?)";		
		String sql="INSERT INTO like3(love) values(?)";		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1,love);
		ps.executeUpdate();
		DBUtil.close(conn);
	}
	
}
