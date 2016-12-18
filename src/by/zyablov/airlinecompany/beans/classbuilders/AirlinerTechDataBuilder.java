/**
 * 
 */
package by.zyablov.airlinecompany.beans.classbuilders;

import by.zyablov.airlinecompany.beans.techdata.AirlinerTechData;

/**
 * @author Дмитрий
 *
 */
public class AirlinerTechDataBuilder {
	
	private AirlinerTechData airlinerTechData;
	
	public AirlinerTechDataBuilder(){
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
