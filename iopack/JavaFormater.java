package iopack;

import java.util.Date;

public class JavaFormater {

	public static void main(String[] args) {

		System.out.printf("'%s' %n", "Luminar");// %s for represent the value as a string and inserted inside ''.
												// %n create a new line

		System.out.printf("%S %n", "luminar");//LUMINAR
		
		System.out.printf("%15s %n", "luminar");//        luminar
		
		System.out.printf("%d %n", 19000L);//19000
		
		double myDouble = 2.34745;
		
		System.out.println("Double upto 2 decimal place: "+ String.format("%.2f", myDouble));
		//Double upto 2 decimal place: 2.35
		
		Date date = new Date();
		System.out.println("Current date and time"+date);//Mon Feb 03 10:01:43 IST 2025
		
		System.out.printf("%tT%n",date);
		
		System.out.printf("Hour: %tH  Minute: %tM  Seconds: %tS%n",date,date,date);
		//Hour: 10  Minute: 06  Seconds: 12
		
		System.out.printf("Day: %1$tA  Month: %1$tB  Year: %1$tY%n",date);//A->day B->Month Y->year
		//Day: Monday  Month: February  Year: 2025
		
		System.out.printf("%1$td/%1$tm/%1$ty",date);//03/02/25
	}

}
