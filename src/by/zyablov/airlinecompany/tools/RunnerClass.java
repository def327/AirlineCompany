/**
 * 
 */
package by.zyablov.airlinecompany.tools;

import by.zyablov.airlinecompany.measures.*;

public class RunnerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CubicMeters a = new CubicMeters(34);
		CubicMeters b = new CubicMeters(21);

		if (a.equals(b)) {
			System.out.println("Yes!");
		}else{
			System.out.println("No!");
		}

	}

}
