/**
 * 
 */
package by.zyablov.airlinecompany.measures;

/**
 * @author Дмитрий
 *
 */
public class CubicMeters extends Measure {

	/**
	 * @param measureValue
	 */
	public CubicMeters(int cubicMetersValue) {
		super(cubicMetersValue + " M^3");
		// TODO Auto-generated constructor stub
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

		if (!(obj instanceof CubicMeters)) {
			return false;
		}

		CubicMeters other = (CubicMeters) obj;
		return (this.measureValue.equals(other.measureValue));
	}

}
