/**
 * 
 */
package by.zyablov.airlinecompany.beans.measures;

import by.zyablov.airlinecompany.interfaces.Measureable;

/**
 * @author Дмитрий
 *
 */
public abstract class Measure implements Measureable, Comparable<Object> {

	protected int measureValue;	

	/**
	 * @param measureValue
	 */
	protected Measure(int measureValue) {
		this.measureValue = measureValue;
	}

	@Override
	public int compareTo(Object o) {
		Measure other = (Measure)o;		
		return (this.getMeasureValueInInt() - other.getMeasureValueInInt());
	}
	
}
