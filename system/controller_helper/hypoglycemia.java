package controller_helper;

import controller.SystemController;
import sensor.dataset_read;

public class hypoglycemia 
{
	public boolean result()
	{

		if(SystemController.data.bg_level<=20)
		{
			System.out.println("Blood Glucose is Low");
			return true;
		}
		else
		{
			return false;
		}
	}

}
