package Package01;

public class Event_01_Listener_Class implements Event_01_Listener_Interface{

	double totalSoFar = 0D;
	
	@Override
	public void numberRead(Event_01 Event_01) {
		totalSoFar += Event_01.getNumber();
		
	}

	@Override
	public void numberStreamTerminated(Event_01 Event01) {
		System.out.println("Final sum is " + totalSoFar);
		
	}

}
