package database;
import java.sql.*;


 
public class dataset_read extends Thread{

	public int bg_level;
	public int code;
  public void run() 
  {
	  dataset();
		  }  
  
  public void dataset()
  {
	  try{  
		  Class.forName("com.mysql.jdbc.Driver");  
		  System.out.println("Connecting to database...");
		  Connection con=DriverManager.getConnection(  
		  "jdbc:mysql://localhost/artificialPancreas","root","root");  
		  
		  Statement stmt=con.createStatement();  

		  ResultSet rs=stmt.executeQuery("SELECT BGLevels, code FROM dataset WHERE token >0 ");  
		  int x  ;
		  for(x =0 ;x<1001;x++ )  
		  {
		  rs.next();
		  System.out.println("Blood Glucose is:  "+rs.getInt(1)+"  Code is:  "+rs.getInt(2)); 
		  bg_level = rs.getInt(1);
		  code = rs.getInt(2);
		  Thread.sleep(5000);
		  }
		  con.close();  
		  }
	  catch(Exception e){ 
		  System.out.println(e);
		  }      
  	}
  }


