/**
 * 
 */
package by.zyablov.airlinecompany.tools;


import java.util.Date;
import java.util.GregorianCalendar;

import by.zyablov.airlinecompany.beans.*;

public class RunnerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		Aircraft plane = new CargoAircraft(44,"TU - 154",
//				new TechSpecificationAircraft(new Tons(234),new FuelSpendTonPerKm(2500), new KilometerPerHour(800)),
//				new CubicMeter(50),false);
		
		
		 Date today = new Date();
		 AircraftPark p = new AircraftPark();	
		 
		 Company c = new AirlineCompany(5, "rer", "wer", today, p);
		 	 
	}

}
