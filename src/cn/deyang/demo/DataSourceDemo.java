package cn.deyang.demo;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

/**
 * ���ӳ�jar���ж���õ�һ����BasicDataSource
 * ʵ��������Դ�Ĺ淶�ӿ�--->javax.sql.Datasource
 * @author chenxue
 *
 */
public class DataSourceDemo {

	public static void main(String[] args) {
		BasicDataSource dataSource = new BasicDataSource(); 
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/test?useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		try {
			Connection con = dataSource.getConnection();
			System.out.println(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			throw new RuntimeException("���ݿ�����ʧ��");
		}
		
	}
}
