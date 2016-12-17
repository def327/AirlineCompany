/**
 * 
 */
package by.zyablov.airlinecompany.beans;

import by.zyablov.airlinecompany.techdata.*;

/**
 * @author Дмитрий
 *
 */
public abstract class Aircraft {

	private int id;
	private String name;
	private TechSpecificationAircraft specification;
	
	
	/**
	 * @param id
	 * @param name
	 * @param specification
	 */
	public Aircraft(int id, String name, TechSpecificationAircraft specification) {
		this.id = id;
		this.name = name;
		this.specification = specification;
	}
	
	

	/**
	 * 
	 */
	public Aircraft() {
		id = 0;
		name = null;
		specification = new TechSpecificationAircraft();
	}



	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the specification
	 */
	public TechSpecificationAircraft getSpecification() {
		return specification;
	}

	/**
	 * @param specification
	 *            the specification to set
	 */
	public void setSpecification(TechSpecificationAircraft specification) {
		this.specification = specification;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Aircraft)) {
			return false;
		}

		Aircraft other = (Aircraft) obj;
		return ((this.id == other.id) && this.name.equals(other.name)
				&& (this.specification.equals(other.specification)));
	}
	
	@Override
	public String toString() {		
		return "id = " + id + "\n" + "name = " + name + "\n" + specification.toString();
	}

}
