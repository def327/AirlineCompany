/**
 * 
 */
package by.zyablov.airlinecompany.tools;



import java.util.Date;

import by.zyablov.airlinecompany.beans.AirlineManageSystem;
import by.zyablov.airlinecompany.beans.builders.AircraftBuilder;
import by.zyablov.airlinecompany.beans.builders.AirlineCompanyBuilder;
import by.zyablov.airlinecompany.beans.builders.AirlinerBuilder;
import by.zyablov.airlinecompany.beans.builders.AirlinerTechDataBuilder;
import by.zyablov.airlinecompany.beans.builders.BasicTechAiracftBuilder;
import by.zyablov.airlinecompany.beans.builders.CargoAircraftBuilder;
import by.zyablov.airlinecompany.beans.builders.CargoAircraftTechDataBuilder;

public class RunnerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AirlineManageSystem manager = new AirlineManageSystem();
		
		//--1)Create AirlineCompany		
		AirlineCompanyBuilder buildCompany = new AirlineCompanyBuilder();
		buildCompany.setCompanyId(56);
		buildCompany.setCompanyName("BELAVIA");
		buildCompany.setCompanyEmail("belavia@gmail.com");
		buildCompany.setCompanyFoundDate(new Date());
		
		manager.setAirlineCompany(buildCompany.getResult());
		//-----------------------------------------------------------------------
		
		
		//--2)Add new Airliner to AircraftPark		
		AircraftBuilder buildAircraft = new AirlinerBuilder();
		buildAircraft.setId(128);
		buildAircraft.setName("Embraer EMB 120 Brasilia");
			
			//--a)Create basicTeachAircraftData
			BasicTechAiracftBuilder techDataBuild = new BasicTechAiracftBuilder();
			techDataBuild.setPeopleCapacity(35);
			techDataBuild.setMidVelocity(552);
			techDataBuild.setFuelSpending(3);
			techDataBuild.setMaxWeigthCapacity(10);
			
		buildAircraft.setTechSpecificationAircraft(techDataBuild.getResult());
		
			//--b)Create AirlinerTechData
			AirlinerTechDataBuilder buildAirlinerTechData = new AirlinerTechDataBuilder();
			buildAirlinerTechData.setAirlinerType("LOCAL");
			buildAirlinerTechData.setHavBusinesClass(true);
			
	    buildAircraft.setUniqueAircraftTechData(buildAirlinerTechData.getResult());
	    
	    manager.addAircraft(buildAircraft.getResult());
	    //-----------------------------------------------------------------------------------------
	    
	    //--3)Add new CargoAircraft to AircraftPark
		AircraftBuilder buildAircraft2 = new CargoAircraftBuilder();
		buildAircraft2.setId(130);
		buildAircraft2.setName("McDonnell Douglas MD-11");
			
			//--a)Create basicTeachAircraftData
			BasicTechAiracftBuilder techDataBuild2 = new BasicTechAiracftBuilder();
			techDataBuild2.setPeopleCapacity(40);
			techDataBuild2.setMidVelocity(800);
			techDataBuild2.setFuelSpending(1);
			techDataBuild2.setMaxWeigthCapacity(280);
		
		buildAircraft2.setTechSpecificationAircraft(techDataBuild2.getResult());
		
			//--b)Create AirlinerTechData
			CargoAircraftTechDataBuilder buildCargoTechData = new CargoAircraftTechDataBuilder();
			buildCargoTechData.setCanTransprtDangerGoods(true);
			buildCargoTechData.setCargoDepartmentSize(200);
			
		buildAircraft2.setUniqueAircraftTechData(buildCargoTechData.getResult());
		
		
		manager.addAircraft(buildAircraft2.getResult());
		//----------------------------------------------------------------------------------------
		manager.removeAircraft(buildAircraft.getResult());
		
		System.out.println(manager.calculateTotalPeopleCapacity());
		System.out.println(manager.calcTotalAircraftsWeigthCapacity());
		
		
		System.out.println(manager.getAirlineCompany().getAircraftPark().getTotalAmountOfAircraft());
		
		
	}

}
