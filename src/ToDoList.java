import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ToDoList
{
	private HashMap<String, Task> tasks = new HashMap<String, Task>();
	
	public void clearMap() {
		tasks.clear();
	}
	
	public void addTask (Task task) {
		tasks.put(task.getDescription(), task);	
	}
	public void completeTask(String description) {
		getTask(description).setStatus(true);
		// Add code here
	}
	public boolean getStatus(String description) {		
		return getTask(description).isStatus();
	}
	public Task getTask(String description) {
		// Add code here
		return tasks.get(description);
	}
	public Task removeTask(String description) {
		return tasks.remove(description);
	}
	public Collection<Task> getAllTasks() {
		// Add code here
		return tasks.values();
	}
	public Collection<Task> getCompletedTasks() {
		Collection<Task> completedTaskList = new ArrayList<>();
		
		for (Task t : tasks.values())
		{
			if(t.isStatus())
				completedTaskList.add(t);
		}
		
		return completedTaskList;
	}
}
