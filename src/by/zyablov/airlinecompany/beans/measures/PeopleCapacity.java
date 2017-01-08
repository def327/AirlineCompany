
package by.zyablov.airlinecompany.beans.measures;

/**
 * Class {@code PeopleCapacity} is an inheritor of {@code Measure} class.
 * Represents is a number of people.
 * 
 * @author Дмитрий
 * @version 1.0
 * @since 2016
 * 
 * @see Measure
 * 
 */
public class PeopleCapacity extends Measure {

	/**
	 * This value is genereted by JVM to serialize {@code PeopleCapacity} class.
	 */
	private static final long serialVersionUID = 9174692227205197309L;

	/**
	 * Return's a value of people's number in int type.
	 */
	@Override
	public int getMeasureValueInInt() {
		return measureValue;
	}

	/**
	 * Return's a string value of {@code PeopleCapacity} object. Also, this
	 * method generates a string, which consist's of {@link Measure#measureValue
	 * measureValue} and " persons".
	 */
	@Override
	public String getMeasureValueInString() {
		return measureValue + " persons";
	}

	/**
	 * Set's an int value for a measureValue field of {@code PeopleCapacity}
	 * object.
	 * 
	 * @param peopleCapacityValue
	 *            - an int storage to keep a value of {@code PeopleCapacity}
	 *            object
	 */
	@Override
	public void setMeasureIntValue(int peopleCapacityValue) {
		this.measureValue = peopleCapacityValue;
	}

	/**
	 * Constructor.
	 * 
	 * @param peopleCapacityValue
	 *            - an int storage to keep a value of {@code PeopleCapacity}
	 *            object
	 */
	public PeopleCapacity(int peopleCapacityValue) {
		super(peopleCapacityValue);
	}

	/**
	 * Constructor.
	 * 
	 * @param measureValue
	 *            - an int storage to keep a value of {@code PeopleCapacity}
	 *            object
	 */
	public PeopleCapacity() {
		super(0);
	}

	/**
	 * Returns a string representation of {@code PeopleCapacity} object.
	 * 
	 * @return a string, which is consisted of <i>measureValue</i> field of
	 *         {@code PeopleCapacity} and <i>" persons"</i> string.
	 */
	@Override
	public String toString() {
		return "peopleCapacity = " + (this.measureValue) + " persons";
	}

	/**
	 * Indicates whether some other {@code PeopleCapacity} object is "equal to "
	 * this one.
	 * 
	 * @param obj
	 *            the reference object with which to compare
	 * @return <b>{@code true}</b> if this {@code PeopleCapacity} object is the
	 *         same as obj argument; <b>{@code false}</b> otherwise.
	 * 
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
