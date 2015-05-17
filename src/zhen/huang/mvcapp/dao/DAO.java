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
	 * 返回某一个字段
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
	 * 返回 T 的一组 LIst
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
	 * 返回一个对象
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
	 * 进行数据的 insert/update/delete操作
	 * 
	 * @param sql
	 *            传入的sql字符串
	 * @param args
	 *            sql 字符的占位符
	 */
	public void upDate(String sql, Object... args)
	{

	}

}
