package controller;

import controller_helper.*;
import sensor.dataset_read;

public class SystemController 
{
	public static dataset_read data;
	public static check check;
	
	public static void main(String[] args) 
	{
		Device_Start();
	}

	private static void Device_Start() 
	{
	 data = new dataset_read();
	 check = new check();
	 data.start();
	 check.start();
	}
}
