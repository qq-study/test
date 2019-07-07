package com.zte.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zte.entity.Carlist;
import com.zte.util.ConnectionFactory;
/**
 * DAO   data access object
 * @author zte
 * 专门用于 访问  数据库的 t_carlist 表的
 */
public class CarlistDAOImpl {
	public static void main(String[] args) {
		CarlistDAOImpl cldi = new CarlistDAOImpl();
		cldi.findByCid(1);
	}
	public Carlist findByCid(Integer cid){
		String sql = "SELECT cname,ctype,price,insure,desp FROM t_carlist WHERE cid = ?";
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement ps;
		Carlist cl = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, cid);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				cl = new Carlist();
				cl.setCname(rs.getString("cname"));
				cl.setCtype(rs.getString("ctype"));
				cl.setPrice(rs.getFloat("price"));
				cl.setInsure(rs.getFloat("insure"));
				cl.setDesp(rs.getString("desp"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cl;
	}
}
