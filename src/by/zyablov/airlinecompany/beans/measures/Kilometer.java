/**
 * 
 */
package by.zyablov.airlinecompany.beans.measures;

/**
 * @author Дмитрий
 *
 */
public class Kilometer extends Measure {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2846659323359916L;
	
	

	/**
	 * @param measureValue
	 */
	public Kilometer(int kilometrsValue) {
		super(kilometrsValue);		
	}
	
	public Kilometer(){
		super(0);	
	}
	
	@Override
	public int getMeasureValueInInt() {
		return measureValue;
	}

	/* (non-Javadoc)
	 * @see by.zyablov.airlinecompany.measures.Measure#getMeasureValue()
	 */
	@Override
	public String getMeasureValueInString() {		
		return this.measureValue + " km";
	}

	/* (non-Javadoc)
	 * @see by.zyablov.airlinecompany.measures.Measure#setMeasureValue(int)
	 */
	@Override
	public void setMeasureIntValue(int kilometrsValue) {
		this.measureValue = kilometrsValue;

	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Kilometer)) {
			return false;
		}

		Kilometer other = (Kilometer) obj;
		return (this.measureValue == other.measureValue);
	}
	
	@Override
	public String toString() {
		return "kilometrsValue = " + measureValue + " km";
	}

}
