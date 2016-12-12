/**
 * 
 */
package by.zyablov.airlinecompany.beans;

import by.zyablov.airlinecompany.techdata.SpecificationAircraft;

/**
 * @author Дмитрий
 *
 */
public abstract class Aircraft {
	private int id;
	private String name;
	private SpecificationAircraft specification;

	
	/**
	 * @param id
	 * @param name
	 * @param specification
	 */
	public Aircraft(int id, String name, SpecificationAircraft specification) {
		this.id = id;
		this.name = name;
		this.specification = specification;
	}
	
	
}
