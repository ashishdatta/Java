import java.util.Scanner;
public class Driver 
{	
	public static void main(String[] args) 
	{
		int numOfTasks=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many tasks are there?");
		numOfTasks=scan.nextInt();
		
		Scanner[] arrayOfscanners = new Scanner[numOfTasks];
		Task[] task = new Task[numOfTasks];
		
		//Run through the array. Initializing arrayOfscanners and the task[]. 
		for(int i=0; i < numOfTasks; i++)
		{
			arrayOfscanners[i]= new Scanner(System.in);
			System.out.println("Please enter task and priority on the next line");
			task[i] = new Task(arrayOfscanners[i].nextLine(), arrayOfscanners[i].nextInt());
		}	
		
		//Sorts the array by priority
		sortItems(task,task.length);
		
		//Prints all the tasks (sorted)
		for(int i = 0; i < numOfTasks; i++)
		{
			System.out.println(task[i].toString()+"\n");
		}				
}
	
	public static void sortItems(Task[] a, int n)
	{
		Task temp;
		for(int ii =0; ii < n-1; ii++)
		{
			for(int i = 1; i < n; i++)
			{
				if(a[i-1].getPriority() > a[i].getPriority())
				{
					temp = a[i-1];
					a[i-1] = a[i];
					a[i]=temp;
				}
			}
		}
	}

}
