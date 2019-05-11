package Package01;

import java.util.Calendar;
import static java.lang.System.out;

public class Calendar_01 {

	public static void main(String[] args) {
		Calendar_01 cmd = new Calendar_01();
		cmd.output();
	}
	
	void output(){
		Calendar cal = Calendar.getInstance();
		out.println("Full Calendar Variable With All Fields");
		System.out.println(cal);
		System.out.println();
		
		System.out.println("Calendar as Date and Time String");
		System.out.println(cal.getTime());
		System.out.println();
		
		System.out.println("Fix Date And Time to 12 Dec at 1.01pm");
		cal.set(2015, 11,12,13,01,00);
		System.out.println(cal.getTime());
		System.out.println();
		
		System.out.println("Time in milliseconds");
		cal.set(2015, 11,12,13,01,00);
		long millis = cal.getTimeInMillis();
		System.out.println(millis);
		System.out.println("Convert back to calendar date and time format");
		cal.setTimeInMillis(millis);
		System.out.println(cal.getTime());
		System.out.println();
		
		System.out.println("Add one day in milliseconds");
		millis += 1000 * 60 * 60 * 24;
		System.out.println(millis);
		System.out.println("Convert back to calendar date and time format");
		cal.setTimeInMillis(millis);
		System.out.println(cal.getTime());
		System.out.println();

		System.out.println("Add one day using calendar ADD");
		cal.add(cal.DATE,1);
		System.out.println(cal.getTime());
		System.out.println();
		
		System.out.println("Add 35 days but keep the same month so roll around the same month");
		cal.roll(cal.DATE,35);
		System.out.println(cal.getTime());
		System.out.println();
		
		
		System.out.println("Set the date to the 1st of whatever month is already set");
		cal.set(cal.DATE,1);
		System.out.println(cal.getTime());
		System.out.println();
		
		
	}

}
