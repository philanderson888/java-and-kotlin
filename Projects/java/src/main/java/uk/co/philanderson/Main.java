package uk.co.philanderson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MasterApplication {
	public static void main(String[] args) {
		//SpringApplication.run(MasterApplication.class, args);
		System.out.println("hello world");
		var instance = new Learn();
		instance.doThis();
	}
	public MasterApplication(){
		System.out.println("hello world");
		var instance = new Learn();
		instance.doThis();
	}
}
