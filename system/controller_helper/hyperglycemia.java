package controller_helper;

import controller.SystemController;
import sensor.dataset_read;

public class hyperglycemia 

{
	public boolean result()
	{

		if(SystemController.data.bg_level >=180)
		{
			System.out.println("Blood Glucose High");
			return true;
		}
		

		else
		{

			return false;
		}
		
	}

}
