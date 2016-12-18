/**
 * 
 */
package by.zyablov.airlinecompany.beans.measures;

/**
 * @author Дмитрий
 *
 */
public class KilometerPerHour extends Measure {

	/**
	 * @param measureValue
	 */
	public KilometerPerHour(int kilometrsPerHourValue) {
		super(kilometrsPerHourValue);		
	}
	
	public KilometerPerHour(){
		super(0);
	}
	
	@Override
	public int getMeasureValueInInt() {		
		return measureValue;
	}

	/* (non-Javadoc)
	 * @see by.zyablov.airlinecompany.measures.Measure#getMeasureValue()
	 */
	@Override
	public String getMeasureValueInString() {		
		return this.measureValue + " km/h";
	}

	/* (non-Javadoc)
	 * @see by.zyablov.airlinecompany.measures.Measure#setMeasureValue(int)
	 */
	@Override
	public void setMeasureIntValue(int kilometrsPerHourValue) {		
		this.measureValue = kilometrsPerHourValue;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof KilometerPerHour)) {
			return false;
		}

		KilometerPerHour other = (KilometerPerHour) obj;
		return (this.measureValue == other.measureValue);
	}
	
	@Override
	public String toString() {		
		return "kilometrsPerHourValue = " + measureValue + " km/h";
	}
	

}
