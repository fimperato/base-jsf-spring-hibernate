package it.fimperato.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * Test Entity
 * 
 * @author fimperato
 * @since 15 Nov 2013
 * @version 1.0.0
 *
 */
@Entity
@Table(name="TEST")
public class EntityTest {

	private int id;
	private String name;
	private String surname;
	
	/**
	 * Get Test Id
	 * 
	 * @return int - Test Id
	 */
	@Id
	@Column(name="ID", unique = true, nullable = false)
	public int getId() {
		return id;
	}
	
	/**
	 * Set Test Id
	 * 
	 * @param int - Test Id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Get Test Name
	 * 
	 * @return String - Test Name
	 */
	@Column(name="NAME", unique = true, nullable = false)
	public String getName() {
		return name;
	}
	
	/**
	 * Set Test Name
	 * 
	 * @param String - Test Name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get Test Surname
	 * 
	 * @return String - Test Surname
	 */
	@Column(name="SURNAME", unique = true, nullable = false)
	public String getSurname() {
		return surname;
	}
	
	/**
	 * Set Test Surname
	 * 
	 * @param String - Test Surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}	
	
	@Override
	public String toString() {
		StringBuffer strBuff = new StringBuffer();
		strBuff.append("id : ").append(getId());
		strBuff.append(", name : ").append(getName());
		strBuff.append(", surname : ").append(getSurname());
		return strBuff.toString();
	}
}
