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
import by.zyablov.airlinecompany.beans.measures.CubicMeter;
import by.zyablov.airlinecompany.beans.measures.FuelSpendTonPerKm;
import by.zyablov.airlinecompany.beans.measures.Kilometer;
import by.zyablov.airlinecompany.beans.measures.KilometerPerHour;
import by.zyablov.airlinecompany.beans.measures.PeopleCapacity;
import by.zyablov.airlinecompany.beans.measures.Tons;
import by.zyablov.airlinecompany.beans.techdata.AirlinerTechData;
import by.zyablov.airlinecompany.beans.techdata.CargoAircraftTechdata;
import by.zyablov.airlinecompany.interfaces.AircraftBuilderBehavior;
import by.zyablov.airlinecompany.interfaces.BuilderBehavior;
import by.zyablov.airlinecompany.beans.techdata.BasicTechAircraftData;

import sun.util.resources.cldr.CalendarData;

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
		buildAircraft.setName("Embraer EMB 120 Brasilia;");
			
			//--a)Create basicTeachAircraftData
			BasicTechAiracftBuilder techDataBuild = new BasicTechAiracftBuilder();
			techDataBuild.setPeopleCapacity(30);
			techDataBuild.setMidVelocity(552);
			techDataBuild.setFuelSpending(3);
			techDataBuild.setMaxWeigthCapacity(10);
			
		buildAircraft.setTechSpecificationAircraft(techDataBuild.getResult());
		
			//--b)Create AirlinerTechData
			AirlinerTechDataBuilder buildAirlinerTechData = new AirlinerTechDataBuilder();
			buildAirlinerTechData.setAirlinerType("LOCAL");
			buildAirlinerTechData.setHavBusinesClass(true);
			
	    //buildAircraft.set
		//System.out.println(airlinerBuild.getResult());
		
		
	}

}
