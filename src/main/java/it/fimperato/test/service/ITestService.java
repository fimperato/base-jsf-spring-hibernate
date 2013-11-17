package it.fimperato.test.service;

import it.fimperato.model.EntityTest;

import java.util.List;

/**
 * 
 * Test Service Interface
 * 
 * @author fimperato
 * @since 15 Nov 2013
 * @version 1.0.0
 *
 */
public interface ITestService {
	
	/**
	 * Add EntityTest
	 * 
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
	 * @return List - EntityTest list
	 */
	public List<EntityTest> getEntitiesTest();
}
