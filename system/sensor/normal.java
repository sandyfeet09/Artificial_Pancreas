package sensor;

import database.dataset_read;

public class normal 
{
	public boolean result()
	{
		dataset_read data = new dataset_read();
		if (data.bg_level <180 && data.bg_level >20)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
