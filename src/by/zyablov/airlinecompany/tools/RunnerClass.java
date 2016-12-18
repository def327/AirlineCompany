/**
 * 
 */
package by.zyablov.airlinecompany.tools;


import java.util.GregorianCalendar;

import by.zyablov.airlinecompany.classbuilders.AirlinerBuilder;
import by.zyablov.airlinecompany.classbuilders.AirlinerTechDataBuilder;
import by.zyablov.airlinecompany.classbuilders.CargoAircraftBuilder;
import by.zyablov.airlinecompany.classbuilders.CargoAircraftTechdataBuilder;
import by.zyablov.airlinecompany.classbuilders.TechSpecificationBuilder;
import by.zyablov.airlinecompany.measures.CubicMeter;
import by.zyablov.airlinecompany.measures.FuelSpendTonPerKm;
import by.zyablov.airlinecompany.measures.Kilometer;
import by.zyablov.airlinecompany.measures.KilometerPerHour;
import by.zyablov.airlinecompany.measures.PeopleCapacity;
import by.zyablov.airlinecompany.measures.Tons;
import by.zyablov.airlinecompany.techdata.AirlinerTechData;
import by.zyablov.airlinecompany.techdata.CargoAircraftTechdata;
import by.zyablov.airlinecompany.techdata.TechSpecificationAircraft;

public class RunnerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		Aircraft plane = new CargoAircraft(44,"TU - 154",
//				new TechSpecificationAircraft(new Tons(234),new FuelSpendTonPerKm(2500), new KilometerPerHour(800)),
//				new CubicMeter(50),false);
		
//		Tons maxWeigthCapacity = new Tons(20);		
//		FuelSpendTonPerKm fuelSpending = new FuelSpendTonPerKm(60);
//		KilometerPerHour midVelocity = new KilometerPerHour(900);
//		PeopleCapacity peopleCapacity = new PeopleCapacity(300);
//		
//		TechSpecificationAircraft specification = new TechSpecificationAircraft(maxWeigthCapacity , fuelSpending, midVelocity, peopleCapacity);
//		
//		CargoAircraftTechdata airlinerTechData = new CargoAircraftTechdata();
//		
//		Aircraft p1 = new CargoAircraft(1, "ТУ - 154", specification, airlinerTechData);
//		
//		System.out.println(p1);
		
		TechSpecificationBuilder b = new TechSpecificationBuilder();
		b.setFuelSpending(56);
		b.setMaxWeigthCapacity(560);
		b.setMidVelocity(900);
		b.setPeopleCapacity(350);
		
		CargoAircraftTechdataBuilder t = new CargoAircraftTechdataBuilder();
		t.setCanTransprtDangerGoods(true);
		t.setCargoDepartmentSize(50);
		
		CargoAircraftBuilder plane = new CargoAircraftBuilder();
		plane.setId(56);
		plane.setName("TU - 545");		
		plane.setCargoAircraftTechdata(t.getResult());
		plane.setTechSpecificationAircraft(b.getResult());
		
		System.out.println(plane.getResult());
		
		
		
		

		
	}

}
