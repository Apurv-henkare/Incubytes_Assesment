package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Junit {
	
	private StringCalculator obj;
	
	@Before
	public void init()
	{
		obj=new StringCalculator();
	}

	@Test
	public void emptyStringTestReturnsZero() {
		
		assertEquals(obj.add(""),0);
	} 
	
	@Test
	public void singleStringreturnsInteger() {
		assertEquals(obj.add("100"),100);
	} 
	
	@Test
	public void addTwoNumbersWithDelimiter() {
		assertEquals(obj.add("1,20"),21);
	} 
	
	@Test
	public void addUnknownNumbers() {
		assertEquals(obj.add("1,1,100,1"),103);
	}

}
