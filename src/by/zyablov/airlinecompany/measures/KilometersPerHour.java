/**
 * 
 */
package by.zyablov.airlinecompany.measures;

/**
 * @author Дмитрий
 *
 */
public class KilometersPerHour extends Measure {

	/**
	 * @param measureValue
	 */
	public KilometersPerHour(int kilometrsPerHourValue) {
		super(kilometrsPerHourValue + " km/h");
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see by.zyablov.airlinecompany.measures.Measure#getMeasureValue()
	 */
	@Override
	public String getMeasureValue() {		
		return this.measureValue;
	}

	/* (non-Javadoc)
	 * @see by.zyablov.airlinecompany.measures.Measure#setMeasureValue(int)
	 */
	@Override
	public void setMeasureValue(int kilometrsPerHourValue) {		
		this.measureValue = kilometrsPerHourValue + " km/h";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof KilometersPerHour)) {
			return false;
		}

		KilometersPerHour other = (KilometersPerHour) obj;
		return (this.measureValue.equals(other.measureValue));
	}
	
	@Override
	public String toString() {		
		return this.measureValue;
	}
	

}
