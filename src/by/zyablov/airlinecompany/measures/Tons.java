/**
 * 
 */
package by.zyablov.airlinecompany.measures;

import by.zyablov.airlinecompany.interfaces.Measureable;

/**
 * @author Дмитрий
 *
 */
public class Tons extends Measure {

	/**
	 * @param measureValue
	 */
	public Tons(int tonsValue) {
		super(tonsValue + " tons");
	}

	public Tons() {
		super(0 + " tons");
	}

	@Override
	public String getMeasureValue() {
		return this.measureValue;
	}

	@Override
	public void setMeasureValue(int tonsValue) {
		this.measureValue = tonsValue + " tons";

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
		return (this.measureValue.equals(other.measureValue));
	}

	@Override
	public String toString() {
		return "tonsValue = " + measureValue;
	}

}
