package cn.deyang.jdbcutils;
/*
 * 使用DBCP实现数据库的连接池
 * 连接池配置自定义类
 * 对于数据库连接池其他的选择配置
 */

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class JDBCUtils {
	private static BasicDataSource dataSource = new BasicDataSource();
	static {
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/test?useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		//初始连接数
//		dataSource.setInitialSize(10);
		//最大连接数
//		dataSource.setMaxActive(15);
		//最大空闲数
//		dataSource.setMaxIdle(5);
		//最小空闲数
//		dataSource.setMinIdle(1);
	}
	public static DataSource getDataSource() {
		return dataSource;
	}
}
