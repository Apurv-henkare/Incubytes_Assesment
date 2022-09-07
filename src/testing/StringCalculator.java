package testing;

public class StringCalculator {
	
	public int calculate(String input)
	{   
		String[] number=input.split(",");
		
		if(isEmpty(input))
		{
			return 0;
		}
		if(number.length == 1)
		{
			return Integer.parseInt(number[0]);
		}
		else
		{
			return getTwoSum(number);
		}
	}
	
	private int getTwoSum(String[] number)
	{
		return Integer.parseInt(number[0])+Integer.parseInt(number[1]);
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
