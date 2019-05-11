package Package01; 
import java.util.HashMap;
import java.util.Map;;

public class HashMap_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var myList = new HashMap<Integer,String>();
		myList.put(1, "one");
		myList.put(2, "two");
		myList.put(6, "six");
		myList.put(5, "five");
		myList.put(3, "three");
		myList.put(4, "four");

		System.out.println(myList.get(2));
		
		// note : returning by index number which is not necessarily the same as zero-based indexing

		System.out.println(myList.get(4));  //null

		myList.put(2,"another two");         // overwrites
		System.out.println(myList.get(2));

		System.out.println("\n\n\nIterating over a hashmap to get keys and values");
		for(Map.Entry<Integer,String> entry : myList.entrySet()){
			System.out.printf("\nEntry with index %d has value %s",entry.getKey(),entry.getValue());
		}
	}

}
