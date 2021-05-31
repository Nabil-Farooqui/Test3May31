//continue *******

import java.util.*;
import java.time.*;

interface time
{
	void dispTime_InSec();
	void dispTime_Inhrs();
	Calendar cal = Calendar.getInstance();
}
class TImeAndAccept implements time
{

	public void dispTime_Inhrs()   
	{
		LocalTime time = LocalTime.now();    ///time in hr min 
	    System.out.println(time);
	}
	
//	public void dispTime_InSec()
//	{
//		
//	}
	public static void main(String[] args) {
		
		
		//  time t = new time(); 
		
		TImeAndAccept t = new TImeAndAccept();
		System.out.println("Time by format of hour / minutes / seconds / nano seconds--->>  ");
		t.dispTime_Inhrs();       //shows hrs
	
	}


}
