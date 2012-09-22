import java.util.*;
public class Driver 
{
	public static void main(String[] args) 
	{
		Integer[] list1 = new Integer[1000];
		Integer[] randomList = new Integer[1000];
		Random rand = new Random();
		Comparable result = null, result1 = null;
		int counter=0;
		
		while(result1==null)
		{
			for(int ii =0; ii < list1.length;ii++)
			{
				list1[ii]=ii+1;
				randomList[ii]= rand.nextInt(100+1);
				//System.out.println(list1[ii]+"\n"+randomList[ii]);			
			}	
			
			counter++;
			result = Searching.RecursiveBinarySearch(list1, 90);
			result1 = Searching.RecursiveBinarySearch(randomList, 90);
		}
	
		System.out.println("It took us: "+counter+" tries");
		
		

	}

}
