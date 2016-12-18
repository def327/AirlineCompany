/**
 * 
 */
package by.zyablov.airlinecompany.beans.measures;

/**
 * @author Дмитрий
 *
 */
public class PeopleCapacity extends Measure {

	/**
	 * @param measureValue
	 */
	public PeopleCapacity(int peopleCapacityValue) {
		super(peopleCapacityValue);
	}

	public PeopleCapacity() {
		super(0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * by.zyablov.airlinecompany.interfaces.Measureable#getMeasureValueInString(
	 * )
	 */
	@Override
	public String getMeasureValueInString() {
		return measureValue + " persons";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * by.zyablov.airlinecompany.interfaces.Measureable#setMeasureIntValue(int)
	 */
	@Override
	public void setMeasureIntValue(int peopleCapacityValue) {
		this.measureValue = peopleCapacityValue;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * by.zyablov.airlinecompany.interfaces.Measureable#getMeasureValueInInt()
	 */
	@Override
	public int getMeasureValueInInt() {
		return measureValue;
	}

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

	@Override
	public String toString() {

		return "peopleCapacity = " + measureValue + " persons";
	}

}
