/**
 * 
 */
package by.zyablov.airlinecompany.measures;

/**
 * @author Дмитрий
 *
 */
public abstract class Measure {
	protected String measureValue;

	/**
	 * @param measureValue
	 */
	protected Measure(String measureValue) {
		this.measureValue = measureValue;
	}

	public abstract String getMeasureValue();

	public abstract void setMeasureValue(int measureValue);

}
