/**
 * 
 */
package by.zyablov.airlinecompany.measures;

/**
 * @author Дмитрий
 *
 */
public class CubicMeter extends Measure {

	/**
	 * @param measureValue
	 */
	public CubicMeter(int cubicMetersValue) {
		super(cubicMetersValue + " M^3");
		// TODO Auto-generated constructor stub
	}
	
	public CubicMeter(){
		super(0 + " M^3");
	}

	/* (non-Javadoc)
	 * @see by.zyablov.airlinecompany.measures.Measure#getMeasureValue()
	 */
	@Override
	public String getMeasureValue() {		
		return this.measureValue;
	}

	/* (non-Javadoc)
	 * @see by.zyablov.airlinecompany.measures.Measure#setMeasureValue(int)
	 */
	@Override
	public void setMeasureValue(int cubicMetersValue) {
		this.measureValue = cubicMetersValue +cubicMetersValue + " M^3";
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
		return (this.measureValue.equals(other.measureValue));
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "cubicMetersValue = " + measureValue;
	}

}
