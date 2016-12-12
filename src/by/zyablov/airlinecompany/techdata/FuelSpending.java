/**
 * 
 */
package by.zyablov.airlinecompany.techdata;



/**
 * @author Дмитрий
 *
 */
public class FuelSpending {
	private String fuelSpendingValue;

	/**
	 * @param fuelSpendingValue
	 */
	public FuelSpending(String fuelSpendingValue) {
		this.fuelSpendingValue = fuelSpendingValue + " tons / 1000km ";
	}

	/**
	 * @return the fuelSpendingValue
	 */
	public String getFuelSpendingValue() {
		return fuelSpendingValue;
	}

	/**
	 * @param fuelSpendingValue
	 *            the fuelSpendingValue to set
	 */
	public void setFuelSpendingValue(String fuelSpendingValue) {
		this.fuelSpendingValue = fuelSpendingValue + " tons / 1000km ";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof FuelSpending)) {
			return false;
		}

		FuelSpending other = (FuelSpending) obj;
		return (this.fuelSpendingValue.equals(other.fuelSpendingValue));
	}

	@Override
	public String toString() {
		return fuelSpendingValue;
	}

}
