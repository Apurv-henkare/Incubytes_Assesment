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
		
		assertEquals(0,obj.add(""));
	} 
	
	@Test
	public void singleStringreturnsInteger() throws Exception {
		assertEquals(100,obj.add("100"));
	} 
	
	@Test
	public void addTwoNumbersWithDelimiter() throws Exception {
		assertEquals(21,obj.add("1,20"));
	} 
	
	@Test
	public void addUnknownNumbers() throws Exception {
		assertEquals(103,obj.add("1,1,100,1"));
	}  
	
	@Test
	public void allowAlphabets() throws Exception {
		assertEquals(14,obj.add("1,2,a,j"));
	} 
	
	@Test(expected = Exception.class)
	public void NegativeNumber() throws Exception {
		obj.add("1,2,100,-1");
	} 
	
	@Test(expected = Exception.class)
	public void allNegativeNumber() throws Exception {
		obj.add("-100,-120,-1000");
	} 
	
	@Test
	public void ignoreMoreThan1000() throws Exception {
		assertEquals(1003,obj.add("2,1,1001,1000"));
	} 
	
	
	
	


}
