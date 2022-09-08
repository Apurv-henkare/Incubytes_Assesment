package testing;

public class FizzBuzz {

	public static String calc(int i) {
		// TODO Auto-generated method stub
		
		String var="";
		
		
		
		if(i%3 == 0)
		{
			var="Fizz";
		}
		
        if(i%5 == 0)
		{
			var=var+"Buzz";
		}
         //13 number 
		if(var.length() == 0)
		{
			var=i+"";
		}
		 return var;
		
	} 
	
	
}
