package sensor;

import database.dataset_read;

public class hypoglycemia 
{
	public boolean result()
	{
		dataset_read data = new dataset_read();
		if (data.bg_level <= 20)
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
