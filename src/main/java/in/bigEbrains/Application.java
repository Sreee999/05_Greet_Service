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


		int sid = 111; // 15 

		public int eid = 101; // 15

		
		public double sal = 99999.99;

		public String name = "SIVA";
		
		public String city = "PUNE";

		public String company = "IBM";
		
		public String City2 = "Mumbai";

		public String company2 = "Infosys";
		
		public boolean status2 = true ; // 28 

		public boolean status = false; // 28 

		public boolean marks = 99.89; // did change by ME
		

		SpringApplication.run(Application.class, args);
	}
	
	public void showName(String name ) { // Did changes by Me
		
		System.out.println("Welocme: " + name);
	}

	public String dispHello(String name) { // John Did changes 
		 return name; 
	}		

}
