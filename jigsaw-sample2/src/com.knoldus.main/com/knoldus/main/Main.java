package com.knoldus.main;

import com.knoldus.providers.GreetingsProvider;
import com.knoldus.service.GreetingsService;
import static com.knoldus.util.Greeting.greetings;
 
public class Main {
	public static void main(String[] args) {
		System.out.println(greetings("Sample ..... "));

		GreetingsService service = GreetingsProvider.getInstance().serviceImpl();
        	service.sayHello("Knoldus");
	}
}
