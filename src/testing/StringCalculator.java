package testing;
import java.util.*;

public class StringCalculator {
	

	public int add(String input) throws Exception
	{   
		String[] number;
		number=input.split(",");
		
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
	
	private int getSum(String[] number) throws Exception
	{
		int sum=0;
		int flag=0;
		
		ArrayList<String> num=new ArrayList<>();

		for(int i=0;i<number.length;i++)
		{   
			
			int ascii=number[i].charAt(0);
		
			if(ascii>=97 && ascii<=122)
			{   
				sum=sum+(ascii-96);
			}
			else
			{   
				int check=Integer.parseInt(number[i]);
				
				if(check<0)
				{   
					flag=1;
					num.add(number[i]);
				}
				else if(check<=1000)
				{
					sum=sum+check;
				}
			}
		}
		
		if(flag == 1)
		{
			String negative_numbers="";
			
			for(int i=0;i<num.size();i++)
			{
				negative_numbers=negative_numbers+num.get(i)+",";
			}
			
			throw new Exception("No Negative Numbers: "+negative_numbers);
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
