package io.john;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RealFizzBuzzTest {

	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
		
	@BeforeEach
	public void setUp() {
	    System.setOut(new PrintStream(outputStreamCaptor));
	}
	@BeforeEach
	public void tearDown() {
	    System.setOut(standardOut);
	}
	
	@Test
	void test0() {
		RealFizzBuzz.computeFizzBuzz(0);
		assertEquals("", outputStreamCaptor.toString());
	}
	
	@Test
	void test1() {
		RealFizzBuzz.computeFizzBuzz(1);
		assertEquals("1", outputStreamCaptor.toString());
	}
	
	@Test
	void test10() {
		RealFizzBuzz.computeFizzBuzz(10);
		assertEquals("1 2 fizz 4 buzz fizz 7 8 fizz buzz", outputStreamCaptor.toString());
	}
	
	@Test
	void test20() {
			RealFizzBuzz.computeFizzBuzz(20);
			assertEquals("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz", outputStreamCaptor.toString());
	}
	
}
