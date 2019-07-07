package com.zte.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.zte.entity.Order;
import com.zte.util.ConnectionFactory;
/**
 * 专门用于 访问  数据库的 t_oder 表的
 * @author Administrator
 *
 */
public class CancelDaoImpl {
	public int cancel(Order cid) {
		String sql = "DELETE FROM t_order WHERE cid=?";
		// 获取连接
		Connection conn = ConnectionFactory.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, cid.getCid());
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
