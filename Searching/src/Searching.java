public class Searching 
{
	public static int counter= 0;
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Comparable LinearSearch(Comparable[] data, Comparable target)
	{
		Comparable result = null;
		int index = 0;
		
		while(result==null && index < data.length)
		{
			counter++;
			if(data[index].compareTo(target)==0)
				result = data[index];
			index++;
		}
		
		return result;
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Comparable binarySearch(Comparable[] data, Comparable target)
	{
		Comparable result = null;
		int first = 0, last = data.length-1,mid; 
		counter = 0;
		while(result==null && first <= last)
		{
			counter++;
			mid = (first + last)/2;
			if(data[mid].compareTo(target) == 0)
				result = data[mid];
			else
				if(data[mid].compareTo(target) > 0)
					last = mid - 1;
				else
					first = mid +1;
		}
			
		return result;
	}
	
	@SuppressWarnings({"rawtypes","unchecked"})
	public static Comparable recurvBinary(Comparable[] data, Comparable target, int first, int last)
	{
			int mid;
			counter++;
			mid = (first + last)/2;
			if(data[mid].compareTo(target) ==0)
				return data[mid];
			else
				if(first==last)
					return null;
				else
					if(data[mid].compareTo(target) > 0)
						return recurvBinary(data, target, first, mid-1);
					else
						return recurvBinary(data, target, mid+1, last);		
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Comparable RecursiveSearch(Comparable[] data, Comparable target)
	{
		int mid, first = 0, last = data.length-1;
		Comparable result=null;
		counter = 0;
		
		while(result == null && first <= last)
		{
			counter++;
			mid = (first + last)/2;
			if(data[mid].compareTo(target)==0)
			{
				return data[mid]; 
			}
			
			else
				if(data[mid].compareTo(target) > 0)
					return recurvBinary(data, target, first, mid -1);
				else
					return recurvBinary(data, target,first +1, last);
		}
		
		return result;
	}
	
	//---------------------------------------------------------------------------------//
	
	@SuppressWarnings({ "rawtypes" })
	public static Comparable Interpolation(Integer[] data, Integer target)
	{
		int mid, first = 0, last = data.length-1;
		counter =0;
		//Comparable result = null;
		
		counter++;
		mid = first+ ((last - first) * (target - data[first])) / (data[last] - data[first]);
		if(data[mid].compareTo(target)==0)
			return data[mid];
		else
			if(data[mid].compareTo(target) > 0)
				return recurvInterpolation(data, target, first, mid -1);
			else
				return recurvInterpolation(data, target,mid + 1, last);
	}
	
	@SuppressWarnings("rawtypes")
	public static Comparable recurvInterpolation(Integer[] data, Integer target, int first, int last)
	{
		int mid;
	      
		  counter ++;
	      mid = first+ ((last - first) * (target - data[first])) / (data[last] - data[first]);  // determine midpoint
	      if (data[mid].compareTo(target) == 0)
	         return data[mid];
	      else
	         if (first >= last)
	      	    return null;
	         else
	            if (data[mid].compareTo(target) > 0)
	               return recurvInterpolation(data, target, first, mid-1);
	            else
	               return recurvInterpolation(data, target, mid+1, last);
		
	}
}

