package zhen.huang.mvcapp.dao;

import java.util.List;

public interface CustomerDAO
{
	public List<Customer> getAll();
	
	public void save(Customer customer);
	
	public void delete(int id);
	
	public Customer get(int id);
	
	/**
	 * ��ȡ�����¼�ĸ���
	 * @param name
	 * @return
	 */
	public long getCountsWithName(String name);

}
