package Package01;

import java.io.Serializable;

public class Serializable_01 implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private int yearProduced;
	private transient String studio;
	
	public Serializable_01(String name, int yearProduced, String studio){
		this.name = name;
		this.yearProduced = yearProduced;
		this.studio = studio;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getYearProduced(){
		return this.yearProduced;
	}
	
	public String getStudio(){
		return this.studio;
	}

}
