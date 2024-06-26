package corejava4;

import java.text.SimpleDateFormat;

public class Date {

	public static void main(String[] args) throws ParasException  {
		
		Date currentDate = new Date();
		System.out.println("Current Date and Time: "+ currentDate);
		
		long mileseconds = 161722665L;
		Date dateFrommileseconds =new Date(milesseconds);
		System.out.println("Date from Milesseconds: "+dateFrommileseconds );
		
		String datestring ="2022-03-10";
		SimpleDateFormat sdf = new simpleDateformat("yyy-nn-dd");
		
			Date parseDate = sdf.parse(dateString);
			System.out.println("ParsedDate: "+parseDate);
			
			SimpleDateFormat sdf2 = new SimpleDateFormat("EEE, MM,DD  hh,MM,ss")
;
			String formattedDate = sdf2.format(currentDate);
			System.out.println("Format date: "+ formattedDate);
		}
		

	}


