
public class driver 
{
	public static void main(String[] args)
	{
		System.out.println(gcd(10,30));
	}


	public static int gcd(int num1, int num2)
	{
		if(num2 <= num1 && (num1%num2==0))
		{
			return num2;
		}
		
		else if(num1 < num2)
		{
			return gcd(num2, num1);
		}
		
		else
		{
			return gcd(num2, num1%num2);
		}
	}
	
	public static int ackerman(int m, int n)
	{
		if(m==0)
		{
			return n+1;
		}
		
		else if(m >0 && n==0)
		{
			return ackerman(m-1,1);
		}
		
		else if(m >0 && n >0)
		{ 
			return ackerman(m-1,ackerman(m,n-1));
		}
		
		else
		{
			return 0;
		}
	}

}