package com.zte.util;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
/**
 * 连接工厂
 * @author zte
 *
 */
public class ConnectionFactory {
	
	private static  String url;
	private static String user;
	private static String password;
	static String className;
	static{
		// 准备 连接  加载驱动
		InputStream input = ConnectionFactory.class.getResourceAsStream("/db_config.properties");
		Properties p = new Properties();
		try {
			p.load(input);
			// 没有问题就继续
			className = p.getProperty("className");
			url = p.getProperty("url");
			user  = p.getProperty("user");
			password = p.getProperty("password");
			// 1. 加载一次驱动
			Class.forName(className);
			
			System.out.println("驱动加载成功");
		
		} catch (IOException e) {
			System.out.println("关键的数据库连接配置确实，请检查src 下是否有db_config.properties");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("没有找到驱动所需要的类，确实这个吗？"+className);
			e.printStackTrace();
		}
	}
	// 获取连接通道
	public static Connection getConnection(){
		// 创造连接
		try {
			// 连接最耗时的 代码 出现了
			Connection conn = DriverManager.getConnection(url, user, password);
			conn.setAutoCommit(false); // 禁止自动提交
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
