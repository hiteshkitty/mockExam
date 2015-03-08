package com.kits.mockexam.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public interface ICommonDao {
	int executeUpdateQuery(String query, List<Object> params);

	List<? extends IEntity> executeCustomQuery(String query, List<Object> params);

	List<? extends IEntity> executeNamedQuery(String query, Object... params);

	List<? extends IEntity> executeNamedQueryWithPagination(String query,
			int firstResults, int maxResults, Object... params);

	IEntity executeSingleValueNamedQuery(String queryName, Object... params);

	Object executeNamedQueryForSingleResult(String queryName, Object... params);

	<T extends IEntity> T getEntity(Class<T> entityClass, Serializable id);

	<T extends IEntity> T getEntity(Class<T> entityClass, String queryName,
			Object... params);

	<T extends IEntity> List<T> getEntities(Class<T> clazz, String queryName,
			Object... paramas);

	void save(IEntity entity);

	void saveAll(Collection<? extends IEntity> entities);

	IEntity merge(IEntity entity);

	Collection<? extends IEntity> mergeAll(
			Collection<? extends IEntity> entities);

	void delete(IEntity entity);

	void deleteAll(Collection<? extends IEntity> entities);

	void flush();

}
