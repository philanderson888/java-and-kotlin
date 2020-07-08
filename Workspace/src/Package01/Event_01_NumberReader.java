package Package01;

import java.io.Console;
import java.util.HashSet;
import java.util.Set;

public class Event_01_NumberReader {

	private Set<Event_01_Listener_Class> listeners;
	
	public Event_01_NumberReader(){
		
		listeners = new HashSet<Event_01_Listener_Class>();
		
	}
	
}
