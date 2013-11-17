package it.fimperato.managed.bean;

import it.fimperato.model.EntityTest;
import it.fimperato.test.service.ITestService;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.springframework.dao.DataAccessException;

/**
 * 
 * Test Managed Bean
 * 
 * @author fimperato
 * @since 15 Nov 2013
 * @version 1.0.0
 *
 */
@ManagedBean(name="testMB")
@RequestScoped
public class TestManagedBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private static final String SUCCESS = "success";
	private static final String ERROR   = "error";
	
	//Spring Test Service is injected...
	@ManagedProperty(value="#{TestService}")
	ITestService testService;
	
	List<EntityTest> testList;
	
	private int id;
	private String name;
	private String surname;
	
	/**
	 * Add Test
	 * 
	 * @return String - Response Message
	 */
	public String addTest() {
		try {
			EntityTest test = new EntityTest();
			test.setId(getId());
			test.setName(getName());
			test.setSurname(getSurname());
			getTestService().addEntityTest(test);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		} 	
		
		return ERROR;
	}
	
	/**
	 * Reset Fields
	 * 
	 */
	public void reset() {
		this.setId(0);
		this.setName("");
		this.setSurname("");
	}
	
	/**
	 * Get EntityTest List
	 * 
	 * @return List - EntityTest List
	 */
	public List<EntityTest> getTestList() {
		testList = new ArrayList<EntityTest>();
		testList.addAll(getTestService().getEntitiesTest());
		return testList;
	}
	
	/**
	 * Get EntityTest Service
	 * 
	 * @return ITestService - EntityTest Service
	 */
	public ITestService getTestService() {
		return testService;
	}

	/**
	 * Set EntityTest Service
	 * 
	 * @param ITestService - EntityTest Service
	 */
	public void setTestService(ITestService testService) {
		this.testService = testService;
	}
	
	/**
	 * Set EntityTest List
	 * 
	 * @param List - EntityTest List
	 */
	public void setTestList(List<EntityTest> testList) {
		this.testList = testList;
	}
	
	/**
	 * Get EntityTest Id
	 * 
	 * @return int - EntityTest Id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set EntityTest Id
	 * 
	 * @param int - EntityTest Id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Get EntityTest Name
	 * 
	 * @return String - EntityTest Name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Set EntityTest Name
	 * 
	 * @param String - EntityTest Name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get EntityTest Surname
	 * 
	 * @return String - EntityTest Surname
	 */
	public String getSurname() {
		return surname;
	}
	
	/**
	 * Set EntityTest Surname
	 * 
	 * @param String - EntityTest Surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}