
package by.zyablov.airlinecompany.menu.actions;

import by.zyablov.airlinecompany.exeptions.NoAirlineCompanyException;
import by.zyablov.airlinecompany.tools.AirlineManageSystem;

import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_NEED_AIRLINE_COMPANY;

/**
 * Class {@code GetFullAirlineCompanyInformationAction} represents an action to
 * get a full information about the airline company.
 * 
 * @author Дмитрий
 *
 */
public class GetFullAirlineCompanyInformationAction {

	/**
	 * This method show a full information about airline company
	 */
	public static void runAction(AirlineManageSystem airlineCompanyManager) {
		try {

			if (!(airlineCompanyManager.haveAirlinerCompany())) {
				throw new NoAirlineCompanyException();
			}

			System.out.println(airlineCompanyManager.getFullAirlineCompanyInformation());
		} catch (NoAirlineCompanyException e) {
			System.out.println(WARNING_MESSAGE_NEED_AIRLINE_COMPANY);
		}
	}

}
