/**
 * 
 */
package by.zyablov.airlinecompany.beans.measures;

import java.io.Serializable;

import by.zyablov.airlinecompany.interfaces.Measureable;

/**
 * @author Дмитрий
 *
 */
public abstract class Measure implements Measureable, Comparable<Object>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3159340879977905378L;
	
	
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
