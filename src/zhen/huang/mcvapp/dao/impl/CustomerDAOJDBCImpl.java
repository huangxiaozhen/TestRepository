package zhen.huang.mcvapp.dao.impl;

import java.util.List;

import zhen.huang.mvcapp.dao.Customer;
import zhen.huang.mvcapp.dao.CustomerDAO;
import zhen.huang.mvcapp.dao.DAO;

@SuppressWarnings("rawtypes")
public class CustomerDAOJDBCImpl extends DAO implements CustomerDAO
{

	@Override
	public List<Customer> getAll()
	{
		return null;
	}

	@Override
	public void save(Customer customer)
	{
		
	}

	@Override
	public void delete(int id)
	{
		
	}

	@Override
	public Customer get(int id)
	{
		return null;
	}

	@Override
	public long getCountsWithName(String name)
	{
		return 0;
	}

}
