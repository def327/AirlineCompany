/**
 * 
 */
package by.zyablov.airlinecompany.beans.builders;

import by.zyablov.airlinecompany.beans.techdata.AirlinerTechData;
import by.zyablov.airlinecompany.interfaces.BuilderBehavior;

/**
 * @author Дмитрий
 *
 */
public class BuilderAirlinerTechData implements BuilderBehavior {
	
	private AirlinerTechData airlinerTechData;
	
	public BuilderAirlinerTechData(){
		airlinerTechData = new AirlinerTechData();
	}
	
	public void setAirlinerType(String airlinerType){
		airlinerTechData.setAirlinerType(airlinerType);
	}
	
	public void setHavBusinesClass(boolean havBusinesClass ){
		airlinerTechData.setHavBusinesClass(havBusinesClass);
	}
	
	public AirlinerTechData getResult(){
		return airlinerTechData;
	}
}
