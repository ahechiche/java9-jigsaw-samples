module com.knoldus.service.provider {
	requires com.knoldus.service;
	
	provides com.knoldus.service.GreetingsService
		with com.knoldus.service.impl.ConsoleGreetings;
}
