
public class Searching 
{
	public static int counter = 0;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Comparable linearSearch(Comparable[] data, Comparable target)
	{
		Comparable result=null;
		int index =0;
		
		while(result==null && index <= data.length)
		{
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
		int first=0,last=data.length-1,mid;
		
		while(result ==null && first <= last)
		{
			mid=(first+last)/2;
		
		if(data[mid].compareTo(target)==0)
			result = data[mid];
		else
			if(data[mid].compareTo(target) > 0)
				last = mid - 1;
			else
				first = mid +1;
		}
		return result;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Comparable recurvBinary(Comparable[] data, Comparable target, int first, int last)
	{
		int mid;
		
		mid = (first + last)/2;
	if (data[mid].compareTo(target) == 0)
        return data[mid];
     else
        if (first == last)
     	    return null;
        else
           if (data[mid].compareTo(target) > 0)
              return recurvBinary(data, target, first, mid-1);
           else
              return recurvBinary(data, target, mid+1, last);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Comparable RecursiveBinarySearch(Comparable[] data, Comparable target)
	{
		int first=0,last=data.length-1,mid;
		
			mid=(first+last)/2;
		
		if(data[mid].compareTo(target)==0)
			return data[mid];
		else
			if(data[mid].compareTo(target) > 0)
				return recurvBinary(data, target, first, mid-1);
			else
				return recurvBinary(data, target, mid+1,last);
		
	}
}
