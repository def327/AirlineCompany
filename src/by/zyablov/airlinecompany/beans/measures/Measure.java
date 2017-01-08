
package by.zyablov.airlinecompany.beans.measures;

import java.io.Serializable;

import by.zyablov.airlinecompany.interfaces.Measureable;

/**
 * Class {@code Measure} represents is a root of physical quantities classes
 * hierarchy, which describes an abstract measure value for expample: meters or
 * seconds and so on.
 * 
 * @author Дмитрий
 * @version 1.0
 * @since 2016
 * 
 */
public abstract class Measure implements Measureable, Comparable<Object>, Serializable {

	/**
	 * This value is genereted by JVM to serialize {@code Measure} class
	 */
	private static final long serialVersionUID = 3159340879977905378L;

	/**
	 * This field is a storage to keep a value of {@code Measure} object.
	 */
	protected int measureValue;

	/**
	 * Return's a string value of {@code Measure} object.
	 */
	public abstract String getMeasureValueInString();

	/**
	 * Set's an int value for a measureValue field of {@code Measure} object.
	 */
	public abstract void setMeasureIntValue(int measureValue);

	/**
	 * Return's an int value of a measureValue fild of {@code Measure} object.
	 */
	public abstract int getMeasureValueInInt();

	/**
	 * Constructor.
	 * 
	 * @param measureValue
	 *            - a storage to keep a value of {@code Measure} object
	 */
	public Measure(int measureValue) {
		this.measureValue = measureValue;
	}

	/**
	 * 
	 * Compares {@code Measure} objects by their int measureValue field
	 * 
	 * 
	 * @param o
	 *            - the reference object with which to compare
	 * 
	 * @return the value {@code 0} if the argument obj is equal to this
	 *         {@code Measure} object; a value less than {@code 0} if this
	 *         {@code Measure} object is less than the obj argument; and a value
	 *         greater than {@code 0} if this {@code Measure} object is greater
	 *         than the obj argument.
	 * 
	 */
	@Override
	public int compareTo(Object o) {
		Measure other = (Measure) o;
		return (this.getMeasureValueInInt() - other.getMeasureValueInInt());
	}
}
