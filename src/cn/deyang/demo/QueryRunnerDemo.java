package cn.deyang.demo;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import cn.deyang.jdbcutils.JDBCUtils;

/**
 * ����д�õĹ�����
 * @author chenxue
 *
 */
public class QueryRunnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		insert();
		query();
	}

	
	private static QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
	//���ݱ�����
	public static void insert() {
		String sql="insert into sort2(sname,sprice,sdesc)values(?,?,?)";
		Object[] params= {"葡萄",4.00,"十块三斤"};
		try {
			int row = qr.update(sql,params);
			System.out.println(row);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	public static void query() {
		String sql="select * from sort2";
		try {
			List<Object[]> list=qr.query(sql, new ArrayListHandler());
			for(Object[] objs:list) {
				for(Object obj:objs) {
					System.out.print(obj+"\t");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	
}
