/**
 * 
 */
package by.zyablov.airlinecompany.beans;

import by.zyablov.airlinecompany.techdata.SpecificationAircraft;

/**
 * @author Дмитрий
 *
 */
public class Airliner extends Aircraft {

	private String airlinerType;
	private boolean havBusinesClass;

	/**
	 * @param id
	 * @param name
	 * @param specification
	 */
	public Airliner(int id, String name, SpecificationAircraft specification,
					String airlinerType, boolean havBusinesClass ) {
		//TODO
		super(id, name, specification);
		this.airlinerType = airlinerType;
		this.havBusinesClass = havBusinesClass;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
