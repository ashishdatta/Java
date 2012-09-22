
public class fibonacci 
{
	public int fact(int x)
	{
			if(x <= 1)
			{
				return 1;
			}
			else
			{
				return x * fact(x-1);
			}	
	}
	
	public int fib(int x)
	{
		if( x<=0)
		{
			return 0;
		}
		else if(x==1)
			return 1;
		else
		{
			return fib(x-1)+fib(x-2);
		}
		
	}
}
