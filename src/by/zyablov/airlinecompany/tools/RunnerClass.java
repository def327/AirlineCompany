/**
 * 
 */
package by.zyablov.airlinecompany.tools;

import by.zyablov.airlinecompany.beans.Aircraft;
import by.zyablov.airlinecompany.beans.Airliner;
import by.zyablov.airlinecompany.beans.CargoAircraft;
import by.zyablov.airlinecompany.measures.*;
import by.zyablov.airlinecompany.techdata.TechSpecificationAircraft;

public class RunnerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Aircraft plane = new CargoAircraft(44,"TU - 154",
				new TechSpecificationAircraft(new Tons(234),new FuelSpendTonPerKm(2500), new KilometerPerHour(800)),
				new CubicMeter(50),false);
		
		Aircraft
		
	}

}
