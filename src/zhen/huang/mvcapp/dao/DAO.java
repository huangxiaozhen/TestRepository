package zhen.huang.mvcapp.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;

public class DAO<T>
{
	private Class<T> clazz;

	private QueryRunner queryRunner = new QueryRunner();

	@SuppressWarnings("unchecked")
	public DAO()
	{
		Type superClass = getClass().getGenericSuperclass();
		if (superClass instanceof ParameterizedType)
		{
			ParameterizedType parameterizedType = (ParameterizedType) superClass;
			
			Type[] typeArgs = parameterizedType.getActualTypeArguments();
			
			if ( typeArgs != null && typeArgs.length > 0 )
			{
				if (typeArgs[0] instanceof Class)
				{
					clazz = (Class<T>) typeArgs[0];
					
				}
				
			}
		}
		
	}

	/**
	 * ����ĳһ���ֶ�
	 * 
	 * @param sql
	 * @param args
	 * @return
	 */
	public <E> E getForValue(String sql, Object... args)
	{
		return null;
	}

	/**
	 * ���� T ��һ�� LIst
	 * 
	 * @param sql
	 * @param args
	 * @return
	 */
	public List<T> getForList(String sql, Object... args)
	{
		return null;
	}

	/**
	 * ����һ������
	 * 
	 * @param sql
	 * @param args
	 * @return
	 */
	public T get(String sql, Object... args)
	{
		return null;
	}

	/**
	 * �������ݵ� insert/update/delete����
	 * 
	 * @param sql
	 *            �����sql�ַ���
	 * @param args
	 *            sql �ַ���ռλ��
	 */
	public void upDate(String sql, Object... args)
	{

	}

}
