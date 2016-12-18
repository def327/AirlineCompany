/**
 * 
 */
package by.zyablov.airlinecompany.beans.measures;


/**
 * @author Дмитрий
 *
 */
public class Tons extends Measure {

	/**
	 * @param measureValue
	 */
	public Tons(int tonsValue) {
		super(tonsValue);		
	}

	public Tons() {
		super(0);
	}
	
	@Override
	public int getMeasureValueInInt() {
		return measureValue;
	}

	@Override
	public String getMeasureValueInString() {
		return this.measureValue + " tons";
	}

	@Override
	public void setMeasureIntValue(int tonsValue) {
		this.measureValue = tonsValue;

	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj == this) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Tons)) {
			return false;
		}

		Tons other = (Tons) obj;
		return (this.measureValue == other.measureValue);
	}

	@Override
	public String toString() {
		return "tonsValue = " + measureValue + " tons";
	}

}
