// Creates an array of objects and assigns values
package Package01;

public class Array_01 {

	private int value;
	
	Array_01(int value){
		this.value=value;
	}
	
	
	public int getValue(){
		return value;
	}
	
	public static void main(String[] args) {
		
		Array_01[] myArray = new Array_01[10];
		
		for(int x = 0; x<10; x++){
			myArray[x] = new Array_01(x);
		}
		
		for(Array_01 arrayitem : myArray){
			
				System.out.println(arrayitem.getValue());






		}

	}

}
