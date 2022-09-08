package testing;
import static org.junit.Assert.*;
import java.util.*;

import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void returnFizzIfNumberDivisibleByThree()
	{
	
		assertEquals("Fizz",FizzBuzz.calc(3));
	}
	
	@Test 
	public void returnBuzzIfNumberDivisibleByFive()
	{
		
		assertEquals("Buzz",FizzBuzz.calc(5));
		
	} 
	
	@Test 
	public void returnFizzBuzzIfNumberDivisibleByFiveAndThree()
	{
	
		assertEquals("Fizz",FizzBuzz.calc(3));
		assertEquals("Buzz",FizzBuzz.calc(5));
		assertEquals("FizzBuzz",FizzBuzz.calc(15));
		
	} 
	
	@Test 
	public void returnNumberIFNumberNotDivisibleByThreeOrFive()
	{
		assertEquals("1",FizzBuzz.calc(1));
		assertEquals("Fizz",FizzBuzz.calc(3));
		assertEquals("Buzz",FizzBuzz.calc(5));
		assertEquals("FizzBuzz",FizzBuzz.calc(15));
		
	}
	
}
