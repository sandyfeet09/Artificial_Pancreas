package controller_helper;

import controller.SystemController;
import sensor.dataset_read;

public class meal_balance 
{
	public boolean result()
	{
	
		if (SystemController.data.code >=58 && SystemController.data.code<=68 && SystemController.data.code != 65)
		{
			System.out.println("Meal Supervision Activated");
			return true;
			
		}
		else
		{
			
			return false;
		}
	}

}
