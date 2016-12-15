/**
 * 
 */
package by.zyablov.airlinecompany.measures;

import by.zyablov.airlinecompany.interfaces.Measureable;

/**
 * @author Дмитрий
 *
 */
public abstract class Measure implements Measureable {

	protected String measureValue;

	/**
	 * @param measureValue
	 */
	protected Measure(String measureValue) {
		this.measureValue = measureValue;
	}

}
