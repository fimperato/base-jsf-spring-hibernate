package it.fimperato.test.dao;

import it.fimperato.model.EntityTest;

import java.util.List;

/**
 * 
 * Test DAO Interface
 * 
 * @author fimperato
 * @since 15 Nov 2013
 * @version 1.0.0
 *
 */
public interface ITestDAO {

	/**
	 * Add EntityTest
Test
	 * @param  EntityTest entityTest
	 */
	public void addEntityTest(EntityTest entityTest);
	
	/**
	 * Update EntityTest
	 * 
	 * @param  EntityTest entityTest
	 */
	public void updateEntityTest(EntityTest entityTest);
	
	/**
	 * Delete EntityTest
	 * 
	 * @param  EntityTest entityTest
	 */
	public void deleteEntityTest(EntityTest entityTest);
	
	/**
	 * Get EntityTest
	 * 
	 * @param  int EntityTest Id
	 */
	public EntityTest getEntityTestById(int id);
	
	/**
	 * Get EntityTest List
	 * 
	 */
	public List<EntityTest> getEntitiesTest();
}
