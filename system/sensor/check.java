package sensor;

import pump.basal_insulin;
import pump.bolus_insulin;

public class check extends Thread
{
	public enum CurrentState{
		braking_correction_state,
		meal_supervision_state,
		basal_state
	}
	public void run() 
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CurrentState state = null;
		hyperglycemia hyper = new hyperglycemia();
		hypoglycemia hypo = new hypoglycemia();
		meal_balance meal = new meal_balance();
		normal normal = new normal();
		basal_insulin basal = new basal_insulin();
		bolus_insulin bolus = new bolus_insulin();
		
			if (hyper.result()== true || hypo.result() ==true)
			{
				state = CurrentState.braking_correction_state;
				basal.getClass();
			}
			
			if(meal.result() == true)
			{
				state =  CurrentState.meal_supervision_state;
				System.out.println("Meal State Activated");
				bolus.getClass();
			}
			
			if(normal.result() == true)
			{
				state = CurrentState.basal_state;
				System.out.println("Blood Glucose is Normal");
			}
			
	//		else
	//		{
	//			System.out.println("Fatal System Error");
	//		}
//			switch (state)
//			{
//			case braking_correction_state:
//					basal.getClass();
//					
//			break;
//			case meal_supervision_state:
//					System.out.println("Meal State Activated");
//					bolus.getClass();
//			break;
//			case basal_state:
//			System.out.println("Blood Glucose is Normal");
//			break;
//			
//			}	
		
	}
}
