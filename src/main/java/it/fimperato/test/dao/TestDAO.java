package it.fimperato.test.dao;

import it.fimperato.model.EntityTest;

import java.util.List;

import org.hibernate.SessionFactory;

/**
 * 
 * Test DAO
 * 
 * @author fimperato
 * @since 15 Nov 2013
 * @version 1.0.0
 *
 */

public class TestDAO implements ITestDAO {
	
	private SessionFactory sessionFactory;

	/**
	 * Get Hibernate Session Factory
	 * 
	 * @return SessionFactory - Hibernate Session Factory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * Set Hibernate Session Factory
	 * 
	 * @param SessionFactory - Hibernate Session Factory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	/**
	 * Add EntityTest
	 * 
	 * @param  EntityTest entityTest
	 */
	@Override
	public void addEntityTest(EntityTest entityTest) {
		getSessionFactory().getCurrentSession().save(entityTest);
	}

	/**
	 * Delete EntityTest
	 * 
	 * @param  EntityTest entityTest
	 */
	@Override
	public void deleteEntityTest(EntityTest entityTest) {
		getSessionFactory().getCurrentSession().delete(entityTest);
	}

	/**
	 * Update EntityTest
	 * 
	 * @param  EntityTest entityTest
	 */
	@Override
	public void updateEntityTest(EntityTest entityTest) {
		getSessionFactory().getCurrentSession().update(entityTest);
	}

	/**
	 * Get EntityTest
	 * 
	 * @param  int EntityTest Id
	 * @return EntityTest 
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EntityTest getEntityTestById(int id) {
		List<EntityTest> list = getSessionFactory().getCurrentSession()
											.createQuery("from EntityTest where id=?")
									        .setParameter(0, id).list();
		return (EntityTest)list.get(0);
	}

	/**
	 * Get EntityTest List
	 * 
	 * @return List - EntityTest list
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<EntityTest> getEntitiesTest() {
		List<EntityTest> list = getSessionFactory().getCurrentSession().createQuery("from EntityTest").list();
		return list;
	}

}
