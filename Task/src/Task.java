
public class Task implements Priority

{
	private String taskType;
	private int priority;
	
	
 
	 public Task(String task, int num)
	 {
		 taskType = task;
		 priority = num;
	 }
	@Override
	public void setPriority(int taskNum) 
	{
		priority = taskNum;
	}

	@Override
	public int getPriority() 
	{
		return priority;
	}
	
	
	
	public String toString()
	{
	      String result = "The tasks in order of priority are: \n"+"Task: "+taskType+" with priority of "+priority;
	      return result;
	}

}
