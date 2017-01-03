/**
 * 
 */
package by.zyablov.airlinecompany.menu;

import java.util.Scanner;

import by.zyablov.airlinecompany.enums.comandenums.MessagesForUserEnum;
import by.zyablov.airlinecompany.enums.comandenums.UserComandEnum;
import by.zyablov.airlinecompany.menu.actions.AddNewAirecraftAction;
import by.zyablov.airlinecompany.menu.actions.CalculateTotalByParametrAction;
import by.zyablov.airlinecompany.menu.actions.CreateAirlineCompanyAction;
import by.zyablov.airlinecompany.menu.actions.ExitProgramAction;
import by.zyablov.airlinecompany.menu.actions.GetAircraftsByParametrRangeAction;
import by.zyablov.airlinecompany.menu.actions.GetFullAircraftInforamationFromBaseAction;
import by.zyablov.airlinecompany.menu.actions.GetFullAirlineCompanyInformationAction;
import by.zyablov.airlinecompany.menu.actions.GetSortAircraftsByParametrAction;
import by.zyablov.airlinecompany.menu.actions.ReadAircraftsFromFileAction;
import by.zyablov.airlinecompany.menu.actions.RemoveAircraftAction;
import by.zyablov.airlinecompany.menu.actions.SaveAircraftsToFileAction;
import by.zyablov.airlinecompany.tools.AirlineManageSystem;

import static by.zyablov.airlinecompany.enums.comandenums.MessagesForUserEnum.*;

/**
 * @author Дмитрий
 *
 */
public class ApplicationMenu {

	private AirlineManageSystem airlineCompanyManager;

	public ApplicationMenu() {
		airlineCompanyManager = new AirlineManageSystem();
	}

	public void mainMenuRun() {

		// Create only one Scanner object for a whole menu
		Scanner inReader = new Scanner(System.in);

		while (true) {
			try {
				System.out.println(MessagesForUserEnum.getMainMenuActionsMessageInString());

				String comandAction = inReader.nextLine();
				UserComandEnum action = UserComandEnum.stringToEnum(comandAction);

				switch (action) {
				case ADD_NEW_AIRCRAFT: {
					AddNewAirecraftAction.run(this.airlineCompanyManager, inReader);
					break;
				}
				case CALCULATE_TOTAL_BY_PARAMETR: {
					CalculateTotalByParametrAction.run(this.airlineCompanyManager, inReader);
					break;
				}
				case CREATE_AIRLINE_COMPANY: {
					CreateAirlineCompanyAction.run(this.airlineCompanyManager, inReader);
					break;
				}
				case EXIT_APPLICATION: {
					ExitProgramAction.run(this.airlineCompanyManager, inReader);
					break;
				}
				case GET_AICRAFT_LIST_BY_PARAMETR_RANGE: {
					GetAircraftsByParametrRangeAction.run(this.airlineCompanyManager, inReader);
					break;
				}
				case GET_FULL_AIRCRAFT_INFORMATION_FROM_BASE: {
					GetFullAircraftInforamationFromBaseAction.run(this.airlineCompanyManager, inReader);
					break;
				}
				case GET_SORT_AIRCRAFT_LIST: {
					GetSortAircraftsByParametrAction.run(this.airlineCompanyManager, inReader);
					break;
				}
				case REMOVE_AIRCRAFT: {
					RemoveAircraftAction.run(this.airlineCompanyManager, inReader);
					break;
				}
				case SAVE_AIRCRAFTS_TO_FILE: {
					SaveAircraftsToFileAction.run(this.airlineCompanyManager);
					break;
				}
				case GET_FULL_INFORMATION_ABOUT_COMPANY: {
					GetFullAirlineCompanyInformationAction.run(this.airlineCompanyManager);
					break;
				}
				case READ_AICRAFTS_FROM_FILE: {
					ReadAircraftsFromFileAction.run(this.airlineCompanyManager);
					break;
				}
				default: {
					System.out.println(WARNING_MESSAGE_TRY_AGAIN);
					break;
				}
				}
			} catch (IllegalArgumentException e) {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				continue;
			}
		}
	}

}
