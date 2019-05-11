package Package01;

import java.util.EventObject;

public class Event_01 extends EventObject{

	private Double number;
	
	public Event_01(Object source, Double number){
		super(source);
		this.number = number;
	}
	
	public Double getNumber(){
		return number;
	}
	
}
