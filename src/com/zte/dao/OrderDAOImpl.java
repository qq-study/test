package com.zte.dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.zte.entity.Order;
import com.zte.util.ConnectionFactory;
/**
 * DAO   data access object
 * @author zte
 * 	专门用于 访问  数据库的 t_oder 表的
 */
public class OrderDAOImpl {
	public int save(Order cid) {
		String sql = "INSERT into t_order (uid,rsd,red,otime,cid,discount,total) VALUES(?,?,?,now(),?,0.9,52014)";
		// 获取连接
		Connection conn = ConnectionFactory.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, cid.getUid());
			ps.setDate(2, (Date) cid.getRsd());
			ps.setDate(3, (Date) cid.getRed());
			ps.setInt(4, cid.getCid());
			// 执行语句
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				conn.commit();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
}
