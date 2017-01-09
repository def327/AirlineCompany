
package by.zyablov.airlinecompany;

import by.zyablov.airlinecompany.menu.ApplicationMenu;

/**
 * 
 * <h1>AirlineCompanyApplicationRunner!</h1>
 * <p>
 * "AirlineCompanyApplicationRunner" program is a console application, where
 * user can manage an airline company via computer console
 * 
 * @author Дмитрий
 * @version 1.0
 * @since 2016
 */
public class AirlineCompanyApplicationRunner {

	/**
	 * Creates and runs an aplication's menu for program user to start to start
	 * to use app.
	 * <p>
	 * <i>The entry point of the program</i>
	 * 
	 * @param args
	 *            Unused.
	 * @return Nothing
	 * 
	 * @see {@link by.zyablov.airlinecompany.menu.ApplicationMenu};
	 * 
	 */
	public static void main(String[] args) {

		ApplicationMenu mn = new ApplicationMenu();
		mn.mainMenuRun();
	}

}
