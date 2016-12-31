/**
 * 
 */
package by.zyablov.airlinecompany.beans.measures;

/**
 * @author Дмитрий
 *
 */
public class CubicMeter extends Measure {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5102375310062773220L;
	
	

	/**
	 * @param measureValue
	 */
	public CubicMeter(int cubicMetersValue) {
		super(cubicMetersValue);		
	}
	
	public CubicMeter(){
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
		return this.measureValue + " M^3";
	}

	/* (non-Javadoc)
	 * @see by.zyablov.airlinecompany.measures.Measure#setMeasureValue(int)
	 */
	@Override
	public void setMeasureIntValue(int cubicMetersValue) {
		this.measureValue = cubicMetersValue;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof CubicMeter)) {
			return false;
		}

		CubicMeter other = (CubicMeter) obj;
		return (this.measureValue == other.measureValue);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "cubicMetersValue = " + measureValue + " M^3";
	}

}
