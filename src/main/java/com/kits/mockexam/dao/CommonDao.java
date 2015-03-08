package com.kits.mockexam.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class CommonDao extends HibernateDaoSupport implements ICommonDao {

	public CommonDao(){
		System.out.println("inside commonDao..");
	}
	@Override
	public int executeUpdateQuery(String query, List<Object> params) {
		Query updateQuery = getSession().createQuery(query);
		if (params != null) {
			int i = 0;
			for (Object param : params) {
				updateQuery.setParameter(i++, param);
			}
		}
		return updateQuery.executeUpdate();
	}

	@Override
	public List<? extends IEntity> executeCustomQuery(String query,
			List<Object> params) {
		Query updateQuery = getSession().createQuery(query);
		if (params != null) {
			int i = 0;
			for (Object param : params) {
				updateQuery.setParameter(i++, param);
			}
		}
		return updateQuery.list();
	}

	@Override
	public List<? extends IEntity> executeNamedQuery(String query,
			Object... params) {
		List<? extends IEntity> list = buildNamedQuery(query, params).list();
		return list;
	}

	@Override
	public List<? extends IEntity> executeNamedQueryWithPagination(
			String query, int firstResults, int maxResults, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IEntity executeSingleValueNamedQuery(String queryName,
			Object... params) {
		return (IEntity) buildNamedQuery(queryName, params).uniqueResult();
	}

	@Override
	public Object executeNamedQueryForSingleResult(String queryName,
			Object... params) {
		return getCurrentSession().getNamedQuery(queryName).uniqueResult();
	}

	@Override
	public <T extends IEntity> T getEntity(Class<T> entityClass, Serializable id) {
		return (T) getSession().get(entityClass, id);
	}

	@Override
	public <T extends IEntity> T getEntity(Class<T> entityClass,
			String queryName, Object... params) {
		return (T) executeSingleValueNamedQuery(queryName, params);
	}

	@Override
	public <T extends IEntity> List<T> getEntities(Class<T> clazz,
			String queryName, Object... paramas) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void save(IEntity entity) {
		getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void saveAll(Collection<? extends IEntity> entities) {
		for (IEntity entity : entities) {
			save(entity);
		}
	}

	@Override
	public IEntity merge(IEntity entity) {
		return (IEntity)getCurrentSession().merge(entity);
	}

	@Override
	public Collection<? extends IEntity> mergeAll(
			Collection<? extends IEntity> entities) {
		final List<IEntity> entitiesList = new ArrayList<IEntity>();
		for (IEntity entity : entities) {
			entitiesList.add(merge(entity));
		}
		return entitiesList;
	}

	@Override
	public void delete(IEntity entity) {
		getCurrentSession().delete(entity);
	}

	@Override
	public void deleteAll(Collection<? extends IEntity> entities) {
		for (IEntity entity : entities) {
			delete(entity);
		}
	}

	@Override
	public void flush() {
		getCurrentSession().flush();
	}

	private Query buildNamedQuery(String queryName, Object... params) {
		Query query = getCurrentSession().getNamedQuery(queryName);
		if (params != null) {
			int i = 0;
			for (Object param : params) {
				query.setParameter(i++, param);
			}
		}
		return query;
	}

	private Query buildNamedQueryWithPagination(String queryName,
			int firstResult, int maxResults, Object... params) {
		Query query = getCurrentSession().getNamedQuery(queryName);
		if (params != null) {
			int i = 0;
			for (Object param : params) {
				query.setParameter(i++, param);
			}
		}
		query.setFirstResult(firstResult);
		query.setMaxResults(maxResults);
		return query;
	}

	public Session getCurrentSession() {
		return getSessionFactory().getCurrentSession();
	}
}
