package sensor;

import database.dataset_read;

public class meal_balance 
{
	public boolean result()
	{
		dataset_read data = new dataset_read();
		System.out.println("Meal Supervision Activated");
		if (data.code >=58 && data.code<=68 && data.code != 65)
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
