package testing;

public class StringCalculator {
	
	public int calculate(String input)
	{
		if(isEmpty(input))
		{
			return 0;
		}
		return Integer.parseInt(input);
	}
	
	private boolean isEmpty(String input)
	{
		int len=input.length();
		
		if(len == 0)
		{
			return true;
		}
		return false;
	}

}
