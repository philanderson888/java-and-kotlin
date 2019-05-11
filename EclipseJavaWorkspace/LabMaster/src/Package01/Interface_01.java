package Package01;

/**
 * @author philipanderson
 * 
 * Goal here is to have two interfaces and have two classes implement the interface.
 * 
 * Note that Type_01_02 implements two interfaces
 *
 */
public class Interface_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Type_01 object_01 = new Type_01();
		Type_01_02 object_02 = new Type_01_02();
		
		object_01.do_this_in_interface_01();
		object_02.do_this_in_interface_01();
		object_02.do_this_in_interface_02();

	}

}


interface Int_01{
	void do_this_in_interface_01();
}



interface Int_02{
	void do_this_in_interface_02();
}

class Type_01 extends Interface_01 implements Int_01{
	
	public void do_this_in_interface_01(){
		System.out.println("Interface 01 Method running");
	}
}

/*
 * 
 * Note that Type_01_02 implements two interfaces and must implement both methods from both interfaces
 * 
 */


class Type_01_02 extends Interface_01 implements Int_01, Int_02{
	public void do_this_in_interface_01(){
		System.out.println("Interface 01 Method running");
	}
	public void do_this_in_interface_02(){
		System.out.println("Interface 02 Method running");
	}
}

