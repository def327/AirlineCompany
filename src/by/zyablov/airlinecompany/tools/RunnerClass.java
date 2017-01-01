/**
 * 
 */
package by.zyablov.airlinecompany.tools;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.beans.builders.BuilderAircraft;
import by.zyablov.airlinecompany.beans.builders.BuilderAirlineCompany;
import by.zyablov.airlinecompany.beans.builders.BuilderAirliner;
import by.zyablov.airlinecompany.beans.builders.BuilderAirlinerTechData;
import by.zyablov.airlinecompany.beans.builders.BuilderBasicTechAiracft;
import by.zyablov.airlinecompany.beans.builders.BuilderCargoAircraft;
import by.zyablov.airlinecompany.beans.builders.BuilderCargoAircraftTechData;
import by.zyablov.airlinecompany.files.FileAircraftTextReader;

public class RunnerClass {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {

		AirlineManageSystem manager = new AirlineManageSystem();

		// --1)Create AirlineCompany
		BuilderAirlineCompany buildCompany = new BuilderAirlineCompany();
		buildCompany.setCompanyId(56);
		buildCompany.setCompanyName("BELAVIA");
		buildCompany.setCompanyEmail("belavia@gmail.com");
		buildCompany.setCompanyFoundDate(new GregorianCalendar());

		manager.setAirlineCompany(buildCompany.getResult());
		//-----------------------------------------------------------------------
		
		 // --2)Add new Airliner to AircraftPark
		 BuilderAircraft buildAircraft = new BuilderAirliner();
		 buildAircraft.setId(128);
		 buildAircraft.setName("Embraer EMB 120 Brasilia");
		
		 // --a)Create basicTeachAircraftData
		 BuilderBasicTechAiracft techDataBuild = new
		 BuilderBasicTechAiracft();
		 techDataBuild.setPeopleCapacity(35);
		 techDataBuild.setMidVelocity(552);
		 techDataBuild.setFuelSpending(3);
		 techDataBuild.setMaxWeigthCapacity(10);
		
		 buildAircraft.setTechSpecificationAircraft(techDataBuild.getResult());
		
		 // --b)Create AirlinerTechData
		 BuilderAirlinerTechData buildAirlinerTechData = new
		 BuilderAirlinerTechData();
		 buildAirlinerTechData.setAirlinerType("LOCAL");
		 buildAirlinerTechData.setHavBusinesClass(true);
		
		 buildAircraft.setUniqueAircraftTechData(buildAirlinerTechData.getResult());
		
		 manager.addAircraft(buildAircraft.getResult());
		 //-----------------------------------------------------------------------------------------
		
		 // --3)Add new CargoAircraft to AircraftPark
		 BuilderAircraft buildAircraft2 = new BuilderCargoAircraft();
		 buildAircraft2.setId(130);
		 buildAircraft2.setName("McDonnell Douglas MD-11");
		
		 // --a)Create basicTeachAircraftData
		 BuilderBasicTechAiracft techDataBuild2 = new
		 BuilderBasicTechAiracft();
		 techDataBuild2.setPeopleCapacity(40);
		 techDataBuild2.setMidVelocity(800);
		 techDataBuild2.setFuelSpending(1);
		 techDataBuild2.setMaxWeigthCapacity(280);
		
		 buildAircraft2.setTechSpecificationAircraft(techDataBuild2.getResult());
		
		 // --b)Create AirlinerTechData
		 BuilderCargoAircraftTechData buildCargoTechData = new
		 BuilderCargoAircraftTechData();
		 buildCargoTechData.setCanTransprtDangerGoods(true);
		 buildCargoTechData.setCargoDepartmentSize(200);
		
		 buildAircraft2.setUniqueAircraftTechData(buildCargoTechData.getResult());
		
		 manager.addAircraft(buildAircraft2.getResult());
		// ----------------------------------------------------------------------------------------


		
		
	}
}
