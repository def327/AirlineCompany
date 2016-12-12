/**
 * 
 */
package by.zyablov.airlinecompany.techdata;

import by.zyablov.airlinecompany.measures.Kilometers;
import by.zyablov.airlinecompany.measures.KilometersPerHour;
import by.zyablov.airlinecompany.measures.Tons;

/**
 * @author Дмитрий
 *
 */
public class SpecificationAircraft {

	private int maxPeopleCapacity;
	// private Tons maxWeigthCapacity;
	// private Tons maxFuelCapacity;
	// private FuelSpending fuelSpending;
	// //private Kilometers maxFlightDestination;
	// private KilometersPerHour averageSpeed;

	/**
	 * @param maxPeopleCapacity
	 */
	public SpecificationAircraft(int maxPeopleCapacity) {
		this.maxPeopleCapacity = maxPeopleCapacity;
	}


	// /**
	// * @param maxPeopleCapacity
	// * @param maxWeigthCapacity
	// * @param maxFuelCapacity
	// * @param fuelSpending
	// * @param maxFlightDestination
	// * @param averageSpeed
	// */
	// public SpecificationAircraft(int maxPeopleCapacity, Tons
	// maxWeigthCapacity, Tons maxFuelCapacity,
	// FuelSpending fuelSpending, Kilometers maxFlightDestination,
	// KilometersPerHour averageSpeed) {
	// this.maxPeopleCapacity = maxPeopleCapacity;
	// this.maxWeigthCapacity = maxWeigthCapacity;
	// this.maxFuelCapacity = maxFuelCapacity;
	// this.fuelSpending = fuelSpending;
	// this.maxFlightDestination = maxFlightDestination;
	// this.averageSpeed = averageSpeed;
	// }
	//
	//
	//
	// @Override
	// /*
	// * This function will use to find Aircraft by it's speed and a fuel
	// capacity
	// */
	// public boolean equals(Object obj) {
	// if (obj == this) {
	// return true;
	// }
	//
	// if (obj == null) {
	// return false;
	// }
	//
	// if (!(obj instanceof SpecificationAircraft)) {
	// return false;
	// }
	//
	// SpecificationAircraft other = (SpecificationAircraft) obj;
	// return (this.fuelSpending.equals(other.fuelSpending));
	// }

}
