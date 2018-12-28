package down;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.DBUtil;



/**
 * 此类就是用来完成数据库增删改查的
 * @author Dell
 *
 */
public class DAO {
	/*
	 * 增加分数的方法
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
