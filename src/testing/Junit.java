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
	public void emptyStringTestReturnsZero() throws Exception
	{
		
		assertEquals(obj.add(""),0);
	} 
	
	@Test
	public void singleStringreturnsInteger() throws Exception {
		assertEquals(obj.add("100"),100);
	} 
	
	@Test
	public void addTwoNumbersWithDelimiter() throws Exception {
		assertEquals(obj.add("1,20"),21);
	} 
	
	@Test
	public void addUnknownNumbers() throws Exception {
		assertEquals(obj.add("1,1,100,1"),103);
	}  
	
	@Test
	public void allowAlphabets() throws Exception {
		assertEquals(obj.add("1,2,a,c"),7);
	} 
	
	@Test
	public void NegativeNumber() throws Exception {
		obj.add("1,2,100,-1");
	} 
	
	@Test
	public void allNegativeNumber() throws Exception {
		obj.add("-100,-120,-1000");
	} 
	
	@Test
	public void ignoreMoreThan1000() throws Exception {
		assertEquals(obj.add("2,1,1001,1000"),1003);
	}


}
