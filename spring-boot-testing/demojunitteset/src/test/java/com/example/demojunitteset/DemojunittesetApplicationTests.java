package com.example.demojunitteset;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;

     @RunWith(SpringRunner.class)
	 @SpringBootTest
	 public class DemojunittesetApplicationTests {
	
	 	@Autowired
	 	public GreetingController greetingController;
	 	@Test
	 	public void testSendGreeting()
	 	{
	 		String greeting=greetingController.sendGreeting();
	 		assertEquals(greeting,"Hello World");    //assertEquals(expected, actual)
	 	}

	 }