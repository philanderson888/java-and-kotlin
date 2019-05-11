package Package01;

class JavaBean_01 implements java.io.Serializable{

	private static final long serialVersionUID = 123L;
			
	private String color;
	
	private int age;
	
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public int getage(){
		return age;
	}
	public void setage(int age){
		this.age = age;
	}
	
	
}
