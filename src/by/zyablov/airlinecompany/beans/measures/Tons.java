/**
 * 
 */
package by.zyablov.airlinecompany.beans.measures;

/**
 * @author Дмитрий
 *
 */
public class Tons extends Measure {

	private static final long serialVersionUID = 8363057548547864061L;

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

	/**
	 * !!! This a constuctor with parameters
	 * 
	 * @param measureValue
	 */
	public Tons(int tonsValue) {
		super(tonsValue);
	}

	/**
	 * !!! This a constuctor without parameters
	 */
	public Tons() {
		super(0);
	}

	/**
	 * !!! This method parse fields to string
	 */
	@Override
	public String toString() {
		return "tonsValue = " + measureValue + " tons";
	}

	/**
	 * !!! This method equals two Tons
	 */
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

}
