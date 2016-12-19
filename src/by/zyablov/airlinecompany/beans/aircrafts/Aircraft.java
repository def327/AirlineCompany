/**
 * 
 */
package by.zyablov.airlinecompany.beans.aircrafts;

import by.zyablov.airlinecompany.beans.techdata.BasicTechAircraftData;

/**
 * @author Дмитрий
 *
 */
public abstract class Aircraft {

	private int idAircraft;
	private String nameAircraft;
	private BasicTechAircraftData basicTechAircraftData;
	
	/**
	 * @param idAircraft
	 * @param nameAircraft
	 * @param basicTechAircraftData
	 */
	public Aircraft(int idAircraft, String nameAircraft, BasicTechAircraftData basicTechAircraftData) {
		this.idAircraft = idAircraft;
		this.nameAircraft = nameAircraft;
		this.basicTechAircraftData = basicTechAircraftData;
	}



	/**
	 * 
	 */
	public Aircraft() {
		idAircraft = 0;
		nameAircraft = null;
		basicTechAircraftData = new BasicTechAircraftData();
	}


	/**
	 * @return the idAircraft
	 */
	public int getIdAircraft() {
		return idAircraft;
	}



	/**
	 * @param idAircraft the idAircraft to set
	 */
	public void setIdAircraft(int idAircraft) {
		this.idAircraft = idAircraft;
	}



	/**
	 * @return the nameAircraft
	 */
	public String getNameAircraft() {
		return nameAircraft;
	}



	/**
	 * @param nameAircraft the nameAircraft to set
	 */
	public void setNameAircraft(String nameAircraft) {
		this.nameAircraft = nameAircraft;
	}



	/**
	 * @return the basicTechAircraftData
	 */
	public BasicTechAircraftData getBasicTechAircraftData() {
		return basicTechAircraftData;
	}



	/**
	 * @param basicTechAircraftData the basicTechAircraftData to set
	 */
	public void setBasicTechAircraftData(BasicTechAircraftData basicTechAircraftData) {
		this.basicTechAircraftData = basicTechAircraftData;
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
		return ((this.idAircraft == other.idAircraft) && this.nameAircraft.equals(other.nameAircraft)
				&& (this.basicTechAircraftData.equals(other.basicTechAircraftData)));
	}
	
	@Override
	public String toString() {		
		return "id = " + idAircraft + "\n" + "name = " + nameAircraft + "\n" + basicTechAircraftData.toString();
	}

}
