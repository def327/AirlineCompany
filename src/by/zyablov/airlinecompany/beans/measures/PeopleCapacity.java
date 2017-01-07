/**
 * 
 */
package by.zyablov.airlinecompany.beans.measures;

/**
 * @author Дмитрий
 *
 */
public class PeopleCapacity extends Measure {

	private static final long serialVersionUID = 9174692227205197309L;

	@Override
	public String getMeasureValueInString() {
		return measureValue + " persons";
	}

	@Override
	public void setMeasureIntValue(int peopleCapacityValue) {
		this.measureValue = peopleCapacityValue;
	}

	@Override
	public int getMeasureValueInInt() {
		return measureValue;
	}

	/**
	 * !!! This a constuctor with parameters
	 * 
	 * @param measureValue
	 */
	public PeopleCapacity(int peopleCapacityValue) {
		super(peopleCapacityValue);
	}

	/**
	 * !!! This a constuctor without parameters
	 */
	public PeopleCapacity() {
		super(0);
	}

	/**
	 * !!! This method parse fields to string
	 */
	@Override
	public String toString() {
		return "peopleCapacity = " + measureValue + " persons";
	}

	/**
	 * !!! This method equals two PeopleCapacity
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof PeopleCapacity)) {
			return false;
		}

		PeopleCapacity other = (PeopleCapacity) obj;
		return (this.measureValue == other.measureValue);
	}
}
