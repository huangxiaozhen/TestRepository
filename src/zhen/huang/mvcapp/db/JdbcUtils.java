package zhen.huang.mvcapp.db;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class JdbcUtils
{
	
	/**
	 * 释放连接
	 * @param connection
	 */
	public static void releaseConnection(Connection connection)
	{
		
	}
	
	private static DataSource dataSource = null ;
	
	static
	{
		dataSource = new ComboPooledDataSource("mvcapp");
	}
	
	/**
	 * 获取一个 connection 对象
	 * @return
	 * @throws SQLException 
	 */
	public static Connection getConnection() throws SQLException
	{
		System.out.println(dataSource);
		return dataSource.getConnection();
	}
	

}
