/**
 * 
 */
package by.zyablov.airlinecompany.beans.classbuilders;
import by.zyablov.airlinecompany.beans.aircrafts.*;
import by.zyablov.airlinecompany.beans.techdata.*;
import by.zyablov.airlinecompany.interfaces.AircraftBuilderBehavior;

/**
 * @author Дмитрий
 *
 */
public abstract class AircraftBuilder implements AircraftBuilderBehavior {
	
	protected Aircraft aircraft;
	
	public void setId(final int idAircraft) {
		this.aircraft.setIdAircraft(idAircraft);
	}

	public void setName(final String nameAircraft) {
		this.aircraft.setNameAircraft(nameAircraft);

	}

	public void setTechSpecificationAircraft(final BasicTechAircraftData basicTechAircraftData) {
		this.aircraft.setBasicTechAircraftData(basicTechAircraftData);
	}
	
	public abstract Aircraft getResult();

}
