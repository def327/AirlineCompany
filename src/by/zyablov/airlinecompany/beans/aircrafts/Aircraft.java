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

	private static final long serialVersionUID = 723753384223393921L;
	private static int aircraftsCounter = 0;

	protected transient int idAircraft;
	protected String nameAircraft;
	protected BasicTechAircraftData basicTechAircraftData;

	/**
	 * !!! This method return a an aicraft full data to string
	 * 
	 * @return
	 */
	public abstract String getFullAircraftInformationDataToString();

	/**
	 * !!! This a constuctor with parameters
	 * 
	 * @param idAircraft
	 * @param nameAircraft
	 * @param basicTechAircraftData
	 */
	public Aircraft(int idAircraft, String nameAircraft, BasicTechAircraftData basicTechAircraftData) {
		this.idAircraft = idAircraft;
		this.nameAircraft = nameAircraft;
		this.basicTechAircraftData = basicTechAircraftData;

		Aircraft.aircraftsCounter++;
	}

	/**
	 * !!! This a constuctor without parameters
	 * 
	 */
	public Aircraft() {
		idAircraft = 0;
		nameAircraft = null;
		basicTechAircraftData = new BasicTechAircraftData();

		Aircraft.aircraftsCounter++; // for static field
	}

	/**
	 * !!! This a method get a static field
	 * 
	 * @return the aircraftsCounter
	 */
	public static int getAircraftsCounter() {
		return Aircraft.aircraftsCounter;
	}

	/**
	 * !!! This method set a staitc field
	 * 
	 * @param aircraftsCounter
	 *            the aircraftsCounter to set
	 */
	public static void setAircraftsCounter(int aircraftsCounter) {
		Aircraft.aircraftsCounter = aircraftsCounter;
	}

	public int getIdAircraft() {
		return idAircraft;
	}

	public void setIdAircraft(int idAircraft) {
		this.idAircraft = idAircraft;
	}

	public String getNameAircraft() {
		return nameAircraft;
	}

	public void setNameAircraft(String nameAircraft) {
		this.nameAircraft = nameAircraft;
	}

	public BasicTechAircraftData getBasicTechAircraftData() {
		return basicTechAircraftData;
	}

	public void setBasicTechAircraftData(BasicTechAircraftData basicTechAircraftData) {
		this.basicTechAircraftData = basicTechAircraftData;
	}

	/**
	 * !!! This method parse fields to string
	 */
	@Override
	public String toString() {
		return "id = " + idAircraft + "\n" + "name = " + nameAircraft + "\n" + basicTechAircraftData.toString();
	}

	/**
	 * !!! This method return a hash code
	 */
	@Override
	public int hashCode() {
		return (HashMakeManager.createHashValue(this.nameAircraft + this.idAircraft));
	}

	/**
	 * !!! This method equals two aicrafts 
	 */
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

	/**
	 * !!! This method originaly compare aricrafts by their middle velocity
	 */
	@Override
	public int compareTo(Object o) {
		Aircraft other = (Aircraft) o;
		KilometerPerHour otherMidVelocity = other.getBasicTechAircraftData().getMiddleVelocity();

		return ((KilometerPerHour) this.basicTechAircraftData.getMiddleVelocity()).compareTo(otherMidVelocity);
	}
}
