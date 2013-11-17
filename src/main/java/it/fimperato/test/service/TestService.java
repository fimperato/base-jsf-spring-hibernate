package it.fimperato.test.service;

import it.fimperato.model.EntityTest;
import it.fimperato.test.dao.ITestDAO;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * Test Service
 * 
 * @author fimperato
 * @since 15 Nov 2013
 * @version 1.0.0
 *
 */
@Transactional(readOnly = true)
public class TestService implements ITestService {

	// TestDAO is injected...
	ITestDAO testDAO;
	
	/**
	 * Add EntityTest
	 * 
	 * @param  EntityTest entityTest
	 */
	@Transactional(readOnly = false)
	@Override
	public void addEntityTest(EntityTest entityTest) {
		getTestDAO().addEntityTest(entityTest);
	}

	/**
	 * Delete EntityTest
	 * 
	 * @param  EntityTest entityTest
	 */
	@Transactional(readOnly = false)
	@Override
	public void deleteEntityTest(EntityTest entityTest) {
		getTestDAO().deleteEntityTest(entityTest);
	}
	
	/**
	 * Update EntityTest
	 * 
	 * @param  EntityTest entityTest
	 */
	@Transactional(readOnly = false)
	@Override
	public void updateEntityTest(EntityTest entityTest) {
		getTestDAO().updateEntityTest(entityTest);
	}
	
	/**
	 * Get EntityTest
	 * 
	 * @param  int EntityTest Id
	 */
	@Override
	public EntityTest getEntityTestById(int id) {
		return getTestDAO().getEntityTestById(id);
	}

	/**
	 * Get EntityTest List
	 * 
	 */
	@Override
	public List<EntityTest> getEntitiesTest() {	
		return getTestDAO().getEntitiesTest();
	}

	/**
	 * Get Test DAO
	 * 
	 * @return ITestDAO - Test DAO
	 */
	public ITestDAO getTestDAO() {
		return testDAO;
	}

	/**
	 * Set Test DAO
	 * 
	 * @param ITestDAO - Test DAO
	 */
	public void setTestDAO(ITestDAO testDAO) {
		this.testDAO = testDAO;
	}

}
