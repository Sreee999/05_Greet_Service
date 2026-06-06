package in.bigEbrains.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.bigEbrains.client.WelcomeFeignClient;

@RestController
public class GreetRestController {
	
	@Autowired
	private WelcomeFeignClient welcomeFeignClient; 
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		
		// int num = 10; 
		
		List nums = List.of(1,2,3,4,5);
		
		String welcomeMsg = welcomeFeignClient.getWelcomeMSG(); 
		
		 String greetMsg = "Good Morning from GreetController !! "; 
		
		return greetMsg + welcomeMsg + nums; 
	}

}
