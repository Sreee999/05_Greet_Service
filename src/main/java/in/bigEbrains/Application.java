package in.bigEbrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Application {

	public static void main(String[] args) {


		SpringApplication.run(Application.class, args);
	}
	
	public void showName(String name ) { // Did changes by Me
		
		System.out.println("Welocme: " + name);
	}

	public String dispHello(String name) { // John Did changes 
		 return name; 
	}		

}
