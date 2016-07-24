package sensor;

import controller.SystemController;
import database.dataset_read;

public class hyperglycemia 

{
	public boolean result()
	{

		dataset_read data = new dataset_read();
		if(SystemController.data.bg_level>=180)
		{
			System.out.println("Blood Glucose High");
			return true;
		}
		
//		if (data.bg_level >=180)
//		{
//			System.out.println("Blood Glucode High");
//			return true;
//			
//		}
		else
		{
			System.out.println("Blood Glucode not High");

			return false;
		}
		
	}

}
