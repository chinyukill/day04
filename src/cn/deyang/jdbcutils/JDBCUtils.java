package cn.deyang.jdbcutils;
/*
 * ʹ��DBCPʵ�����ݿ�����ӳ�
 * ���ӳ������Զ�����
 * �������ݿ����ӳ�������ѡ������
 */

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class JDBCUtils {
	private static BasicDataSource dataSource = new BasicDataSource();
	static {
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/test?useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		//��ʼ������
//		dataSource.setInitialSize(10);
		//���������
//		dataSource.setMaxActive(15);
		//��������
//		dataSource.setMaxIdle(5);
		//��С������
//		dataSource.setMinIdle(1);
	}
	public static DataSource getDataSource() {
		return dataSource;
	}
}
