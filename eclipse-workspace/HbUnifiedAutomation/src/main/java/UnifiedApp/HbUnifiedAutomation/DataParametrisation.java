package UnifiedApp.HbUnifiedAutomation;

import org.testng.annotations.DataProvider;

public class DataParametrisation {
	@DataProvider(name ="InputData")
	
		public Object[][] getDataforEditfeild()
		{
		Object[][] obj = new Object[][]
				{
			{"eatgood"},{"hello"} ,{"$$&^%$"}
				};
				return obj;
		
		}
		//This class will run the data set for multiple times
	

}
