import java.util.Date;

public class Task {

	// Taskid, name , description, status, added date, priority, completed date

	int taskID;
	String name;
	String description;
	boolean status;
	Date addedDate, completedDate;
	int Priority;

	public int getTaskID() {
		return taskID;
	}

	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public Date getCompletedDate() {
		return completedDate;
	}

	public void setCompletedDate(Date completedDate) {
		this.completedDate = completedDate;
	}

	public int getPriority() {
		return Priority;
	}

	public void setPriority(int priority) {
		Priority = priority;
	}

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Task(int taskID, String name, boolean status) {
		super();
		this.taskID = taskID;
		this.name = name;
		this.status = status;
	}

	public Task(String description) {
		super();
		this.description = description;
	}
	
	public void printTask() {
		System.out.println("ID: " + this.taskID + " Name: " + this.name + " Status: " + this.status);
	}
}
