/**
 * 
 */
package by.zyablov.airlinecompany.measures;

/**
 * @author Дмитрий
 *
 */
public class FuelSpendTonPerKm extends Measure {

	
	/**
	 * @param measureValue
	 */
	public FuelSpendTonPerKm(int fuelSpendTonPerKm) {
		super(fuelSpendTonPerKm + " tons / 1000km");		
	}
	
	public FuelSpendTonPerKm(){
		super(0 + " tons / 1000km");
	}

	/* (non-Javadoc)
	 * @see by.zyablov.airlinecompany.interfaces.Measureable#getMeasureValue()
	 */
	@Override
	public String getMeasureValue() {
		return this.measureValue;
	}

	/* (non-Javadoc)
	 * @see by.zyablov.airlinecompany.interfaces.Measureable#setMeasureValue(int)
	 */
	@Override
	public void setMeasureValue(int fuelSpendTonPerKm) {
		super.measureValue = fuelSpendTonPerKm + " tons / 1000km";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof FuelSpendTonPerKm)) {
			return false;
		}

		FuelSpendTonPerKm other = (FuelSpendTonPerKm) obj;
		return (this.measureValue.equals(other.measureValue));
	}
	
	@Override
	public String toString() {
		return "fuelSpendTonPerKm = " + measureValue;
	}
	
	

}
