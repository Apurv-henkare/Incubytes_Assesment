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
		
		assertEquals(obj.calculate(""),0);
	} 
	
	@Test
	public void singleStringreturnsInteger() {
		assertEquals(obj.calculate("100"),100);
	}

}
