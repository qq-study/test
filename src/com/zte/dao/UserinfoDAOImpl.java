package com.zte.dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.zte.entity.Userinfo;
import com.zte.util.ConnectionFactory;
/**
 * DAO   data access object
 * @author zte
 * 专门用于 访问  数据库的 t_userinfo 表的
 */
public class UserinfoDAOImpl {
	public Userinfo findByPhone(String phone){
		String sql = "SELECT phone, uid,  "
				+ "password, tname, id, gender, "
				+ "regtime, amount FROM t_userinfo WHERE phone = ?";
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement ps;
		Userinfo ui = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, phone);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				ui = new Userinfo();
				ui.setUid(rs.getInt("uid"));
				ui.setAmount(rs.getFloat("amount"));
				ui.setGender(rs.getString("gender"));
				ui.setId(rs.getString("id"));
				ui.setPassword(rs.getString("password"));
				ui.setPhone(rs.getString("phone"));
				ui.setRegtime(rs.getDate("regtime"));
				ui.setTname(rs.getString("tname"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ui;
	}
	public int save(Userinfo ui) {
		String sql = "INSERT INTO t_userinfo"
				+ "(phone,password,tname,id,gender,regtime) "
				+ "VALUES(?,?,?,?,?,?)";
		// 获取连接
		Connection conn = ConnectionFactory.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, ui.getPhone());
			ps.setString(2, ui.getPassword());
			ps.setString(3, ui.getName());
			ps.setString(4, ui.getId());
			ps.setString(5, ui.getGender()+"");
			Date sdate = new Date(ui.getRegtime().getTime());
			ps.setDate(6, sdate);
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
