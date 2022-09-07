package testing;
import java.util.*;

public class StringCalculator {
	
	private final String alpha="a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
	
	public int add(String input) throws Exception
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
	
	private int getSum(String[] number) throws Exception
	{
		int sum=0;
		
		HashMap<String,Integer> map=new HashMap<>();
		ArrayList<String> num=new ArrayList<>();

		String[] temp=alpha.split(",");
		
		for(int i=0;i<26;i++)
		{
			map.put(temp[i],i+1);
			
		}
		
		int flag=0;
		for(int i=0;i<number.length;i++)
		{   
			if(map.containsKey(number[i]))
			{
				sum=sum+map.get(number[i]);
			}
			else
			{   
				if(Integer.parseInt(number[i])<0)
				{   
					flag=1;
					num.add(number[i]);
				}
				else if(Integer.parseInt(number[i])<=1000)
				{
					sum=sum+Integer.parseInt(number[i]);
				}
			}
		}
		
		if(flag == 1)
		{
			String no_negative_numbers="";
			
			for(int i=0;i<num.size();i++)
			{
				no_negative_numbers=no_negative_numbers+num.get(i)+",";
			}
			
			throw new Exception("No Negative Numbers: "+no_negative_numbers);
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
