package Package01;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayList_02 {

	public static void main(String[] args) {
		Collection myList = new ArrayList();
		myList.add(1);
		myList.add(2);
		myList.add("three");
		for(Object item : myList){
			System.out.println(item.toString());
		}
	}
}
