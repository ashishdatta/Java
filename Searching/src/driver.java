import java.util.Random;
public class driver {

	@SuppressWarnings( "rawtypes")
	public static void main(String[] args) 
	{
		/*Integer[] list = {1,2,3,4,5};
		Comparable result,result2;
		
		result = Searching.RecursiveSearch(list, 3);
		System.out.println(result);
		result2 = Searching.binarySearch(list, 3);
		System.out.println(result2);
		
		result = Searching.Interpolation(list, 2);
		System.out.println(result + "steps: "+Searching.counter);*/
		
		Integer[] list = new Integer[1000];
		Integer[] randList = new Integer[1000];
		Comparable result;
		Random step = new Random(400);
		
		for (int ii =0; ii<1000;ii++)
		{
			list[ii] = ii;
			if (ii==0)
				randList[ii] = 1;
			else
				randList[ii] = randList[ii-1] + step.nextInt(ii);
			
			System.out.println (list[ii] + " : " + randList[ii]);
					
		}
		
		System.out.println ("List with step size 1");
		result = Searching.binarySearch(list, 53);
		System.out.println ("     Binary search (recursive) found : " + result + " in "+ Searching.counter + " steps.");
		
		result = Searching.Interpolation(list, 53);
		System.out.println ("     Interpolation search (recursive) found : " + result + " in "+ Searching.counter + " steps.");		

		result = Searching.binarySearch(list, 460);
		System.out.println ("     Binary search (recursive) found : " + result + " in "+ Searching.counter + " steps.");
		
		result = Searching.Interpolation(list, 460);
		System.out.println ("     Interpolation search (recursive) found : " + result + " in "+ Searching.counter + " steps.");		


		
		System.out.println ("\n-------------------\nList with random step size");
		result = Searching.binarySearch(randList, 54);
		System.out.println ("     Binary search (recursive) found : " + result + " in "+ Searching.counter + " steps.");
		
		result = Searching.Interpolation(randList, 54);
		System.out.println ("     Interpolation search (recursive) found : " + result + " in "+ Searching.counter + " steps.");	
		
		result = Searching.binarySearch(randList, 464);
		System.out.println ("     Binary search (recursive) found : " + result + " in "+ Searching.counter + " steps.");
		
		result = Searching.Interpolation(randList, 464);
		System.out.println ("     Interpolation search (recursive) found : " + result + " in "+ Searching.counter + " steps.");	
		
		result = Searching.Interpolation(randList, 142487);
		System.out.println ("     Interpolation search (recursive) found : " + result + " in "+ Searching.counter + " steps.");	
	}

}
