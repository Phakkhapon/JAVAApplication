import java.nio.*;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
/*
 * This is my first Java 
 */
public class MainClass {

	public static void main(String []args)
	{
		System.out.println("This is my full name : "+ myFullName);		
		float f1 = 1.0f / 3.0f;
		double d1 = 1.0/3.0;
		System.out.println("float " + f1);
        System.out.println("double "+ d1);    
		
//	   System.out.println(human.toString());
	    String[] data = new String[5];
	    data[0] = "A";
	    data[1] = "B";
	    String txt = null;
	    for (int i = 0; i < data.length; i++) {
			
	    	txt = txt + data[i];
		} 
		System.out.println(txt);
  
	}
	

}