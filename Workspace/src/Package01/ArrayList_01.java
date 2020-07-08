package Package01;
import java.util.ArrayList;

public class ArrayList_01 {

	public static void main(String[] args) {
		var myList = new ArrayList<String>();
		
		myList.add("one");
		myList.add("two");
		myList.add("three");
		
		System.out.println(myList.get(1));


		var myList02 = new ArrayList<Integer>();
		myList02.add(10);
		myList02.add(20);
		myList02.add(30);
		myList02.add(40);
		myList02.add(10);

		for (int i : myList02) {
			System.out.printf("\nElement is %d and first instance of this value is found at index %d",i,myList02.indexOf(i));
		}

		System.out.println("\n\n\nSame example but using a proper for loop which keeps a proper track of the correct index");
		for (int i = 0; i<myList02.size(); i++){
			System.out.printf("\nElement is %d at index %d", myList02.get(0), i);
		}



	}

}
