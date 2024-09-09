package swp.group5.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}
	public void byebye(){
		System.out.println("bye");
	}
	public void hello(){
		System.out.println("hi");
	}
}
