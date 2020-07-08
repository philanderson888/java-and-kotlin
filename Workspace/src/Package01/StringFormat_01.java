package Package01;

import java.util.Date;

public class StringFormat_01 {

	public static void main(String[] args) {
		StringFormat_01 format = new StringFormat_01();
		format.display();
	}
	
	void display(){
		String x = "123456";
		int y = 123456;
		float f = 12346.3345F;
		double d = 123456789.12345D;
		Date date01 = new Date();
		
		StringBuilder sb = new StringBuilder();
		sb.append("Input Floating Point Number ");
		sb.append(f);
		sb.append(" With Output String ");
		sb.append(" using String.format %, ");
		System.out.println(sb.toString());
		System.out.println(String.format("%,.0f", f));
		System.out.println();
		
		sb = new StringBuilder();
		sb.append("Input Floating Point Number ");
		sb.append(f);
		sb.append(" With Output String ");
		sb.append(" using String.format %,.2f ");
		System.out.println(sb.toString());
		System.out.println(String.format("%,.2f", f));
		System.out.println();
		
		sb = new StringBuilder();
		sb.append("Input Floating Point Number ");
		sb.append(f);
		sb.append(" With Output String ");
		sb.append(" using String.format %12.2f has width 12");
		System.out.println(sb.toString());
		System.out.println(String.format("%12.2f", f));
		System.out.println();
		
		sb = new StringBuilder();
		sb.append("Input Floating Point Number ");
		sb.append(d);
		sb.append(" With Output String ");
		sb.append(" using String.format %12.6f has width 12 but six decimal places");
		System.out.println(sb.toString());
		System.out.println(String.format("%12.6f", d));
		System.out.println();
		
		sb = new StringBuilder();
		sb.append("Input Integer Number ");
		sb.append(y);
		sb.append(" With Output String ");
		sb.append(" using String.format %,.d ");
		System.out.println(sb.toString());
		System.out.println(String.format("%,d", y));
		System.out.println();
		
		sb = new StringBuilder();
		sb.append("Date ");
		sb.append(date01);
		sb.append(" With Output String ");
		sb.append(" using String.format %tc ");
		System.out.println(sb.toString());
		System.out.println(String.format("%tc", date01));
		System.out.println();
		
		sb = new StringBuilder();
		sb.append("Just display the time from input date ");
		sb.append(date01);
		sb.append(" using String.format %tr yields");
		System.out.println(sb.toString());
		System.out.println(String.format("%tr", date01));
		System.out.println();
		
		sb = new StringBuilder();
		sb.append("Day of the week using %tA yields");
		System.out.println(sb.toString());
		System.out.println(String.format("%tA", date01));
		System.out.println();
		
		sb = new StringBuilder();
		sb.append("Month %tB yields");
		System.out.println(sb.toString());
		System.out.println(String.format("%tB", date01));
		System.out.println();
		
		sb = new StringBuilder();
		sb.append("Day of Month %td yields");
		System.out.println(sb.toString());
		System.out.println(String.format("%td", date01));
		System.out.println();
		
		sb = new StringBuilder();
		sb.append("Year %tY yields");
		System.out.println(sb.toString());
		System.out.println(String.format("%tY", date01));
		System.out.println();
		
		sb = new StringBuilder();
		sb.append("day dd mmm %tA %td %tB %tY yields");
		System.out.println(sb.toString());
		System.out.println(String.format("%tA %td %tB %tY", date01,date01,date01,date01));
		System.out.println(String.format("%tA %<td %<tB %<tY", date01));
		System.out.println();
		
		
		
		
		
		
		
		
		
	}

}
