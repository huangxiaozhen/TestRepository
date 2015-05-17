package zhen.huang.mvcapp.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import zhen.huang.mvcapp.db.JdbcUtils;

public class testGetConnect
{

	@Test
	public void testGetConnection() throws SQLException
	{
		Connection connection = JdbcUtils.getConnection();
		System.out.println(connection);
		
	}

}
