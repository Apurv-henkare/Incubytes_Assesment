package testing;

public class StringCalculator {
	
	public int add(String input)
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
			return getSum(number);
		}
	}
	
	private int getSum(String[] number)
	{
		int sum=0;
		
		for(int i=0;i<number.length;i++)
		{
			sum=sum+Integer.parseInt(number[i]);
		}
		
		return sum;
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
