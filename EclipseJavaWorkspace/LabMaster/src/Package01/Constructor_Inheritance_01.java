package Package01;

public class Constructor_Inheritance_01 {

	Constructor_Inheritance_01(){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandChild_Constructor c = new GrandChild_Constructor();
	}

	
	

	
}


class Parent_Constructor{
	Parent_Constructor(){
		System.out.println("Parent Constructor");
	}
}

class Child_Constructor extends Parent_Constructor{
	Child_Constructor(){
		System.out.println("Child Constructor");
	}
}

class GrandChild_Constructor extends Child_Constructor{
	GrandChild_Constructor(){
		System.out.println("GrandChild Constructor");
	}
}