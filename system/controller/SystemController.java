package controller;

import database.dataset_read;
import sensor.*;

public class SystemController 
{
	public static void main(String[] args) 
	{
		Device_Start();
	}
	public static dataset_read data;
	private static void Device_Start() 
	{
	 data = new dataset_read();
		check check = new check();
		data.start();
		check.start();
	}
}
