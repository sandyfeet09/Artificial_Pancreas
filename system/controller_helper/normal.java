package controller_helper;

import controller.SystemController;
import sensor.dataset_read;

public class normal 
{
	public boolean result()
	{
		
		if (SystemController.data.bg_level < 180 && SystemController.data.bg_level > 20)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
