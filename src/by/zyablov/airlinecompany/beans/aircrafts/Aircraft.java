/**
 * 
 */
package by.zyablov.airlinecompany.beans.aircrafts;

import java.io.Serializable;

import by.zyablov.airlinecompany.beans.measures.KilometerPerHour;
import by.zyablov.airlinecompany.beans.techdata.BasicTechAircraftData;
import by.zyablov.airlinecompany.tools.HashMakeManager;

/**
 * @author Дмитрий
 *
 */
public abstract class Aircraft implements Comparable<Object>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 723753384223393921L;


	protected transient int idAircraft;  
	protected String nameAircraft;
	protected BasicTechAircraftData basicTechAircraftData;
	
	private static int aircraftsCounter;	
	
	static{
		aircraftsCounter = 0;
	}
	
	/**
	 * @return the aircraftsCounter
	 */
	public static int getAircraftsCounter() {
		return Aircraft.aircraftsCounter;
	}
	/**
	 * @param aircraftsCounter the aircraftsCounter to set
	 */
	public static void setAircraftsCounter(int aircraftsCounter) {
		Aircraft.aircraftsCounter = aircraftsCounter;
	}	
	

	public abstract String getFullAircraftInformationDataToString();

	
	/**
	 * @param idAircraft
	 * @param nameAircraft
	 * @param basicTechAircraftData
	 */
	public Aircraft(int idAircraft, String nameAircraft, BasicTechAircraftData basicTechAircraftData) {
		this.idAircraft = idAircraft;
		this.nameAircraft = nameAircraft;
		this.basicTechAircraftData = basicTechAircraftData;	
		
		Aircraft.aircraftsCounter++;		//for static field
	}



	/**
	 * 
	 */
	public Aircraft() {
		idAircraft = 0;
		nameAircraft = null;
		basicTechAircraftData = new BasicTechAircraftData();
		
		Aircraft.aircraftsCounter++;		//for static field
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
	public int hashCode() {		
		return (HashMakeManager.createHashValue(this.nameAircraft + this.idAircraft));
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
		return ((this.idAircraft == other.idAircraft) && (this.nameAircraft.equals(other.nameAircraft))
				&& (this.basicTechAircraftData.equals(other.basicTechAircraftData)));
	}
	
	@Override
	public String toString() {		
		return "id = " + idAircraft + "\n" + "name = " + nameAircraft + "\n" + basicTechAircraftData.toString();
	}
	
	
	/**
	 * !!! This method originaly compare aricrafts by their middle velocity
	 */
	@Override
	public int compareTo(Object o) {	
		Aircraft other = (Aircraft)o;
		KilometerPerHour otherMidVelocity =  other.getBasicTechAircraftData().getMiddleVelocity();
		
		return ((KilometerPerHour) this.basicTechAircraftData.getMiddleVelocity()).compareTo(otherMidVelocity);
	}

}
