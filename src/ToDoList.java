import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ToDoList {
	private HashMap<Integer, Task> tasks = new HashMap<Integer, Task>();

	public void clearMap() {
		tasks.clear();
	}

	public void addTask(Task task) {
		tasks.put(task.getTaskID(), task);
	}

	public void completeTask(Integer id) {
		getTask(id).setStatus(true);
		// Add code here
	}

	public boolean getStatus(Integer id) {
		return getTask(id).isStatus();
	}

	public Task getTask(Integer id) {
		// Add code here
		return tasks.get(id);
	}

	public Task removeTask(Integer id) {
		return tasks.remove(id);
	}

	public Collection<Task> getAllTasks() {
		// Add code here
		return tasks.values();
	}

	public Collection<Task> getCompletedTasks() {
		Collection<Task> completedTaskList = new ArrayList<>();

		for (Task t : tasks.values()) {
			if (t.isStatus())
				completedTaskList.add(t);
		}

		return completedTaskList;
	}
	
	public void displayAll(ToDoList todoList) {
		Collection<Task> tasks = todoList.getAllTasks();
		ArrayList<Task> taskList = new ArrayList<>(tasks); 
		System.out.println(tasks.size());
		for(int i = 0; i < taskList.size(); ++i) {
			taskList.get(i).printTask();
		}
	}
	
}
