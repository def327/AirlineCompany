/**
 * 
 */
package by.zyablov.airlinecompany.measures;

/**
 * @author Дмитрий
 *
 */
public class Kilometer extends Measure {

	/**
	 * @param measureValue
	 */
	public Kilometer(int kilometrsValue) {
		super(kilometrsValue + " km");		
	}
	
	public Kilometer(){
		super(0 + " km");	
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
	public void setMeasureValue(int kilometrsValue) {
		this.measureValue = kilometrsValue + " km";

	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Kilometer)) {
			return false;
		}

		Kilometer other = (Kilometer) obj;
		return (this.measureValue.equals(other.measureValue));
	}
	
	@Override
	public String toString() {
		return "kilometrsValue = " + measureValue;
	}

}
