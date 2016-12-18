/**
 * 
 */
package by.zyablov.airlinecompany.beans.measures;

import by.zyablov.airlinecompany.interfaces.Measureable;

/**
 * @author Дмитрий
 *
 */
public abstract class Measure implements Measureable {

	protected int measureValue;	

	/**
	 * @param measureValue
	 */
	protected Measure(int measureValue) {
		this.measureValue = measureValue;
	}

}
