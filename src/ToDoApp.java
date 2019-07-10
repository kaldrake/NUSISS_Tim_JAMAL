import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class ToDoApp {

	public static int count = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ToDoList toDoList = new ToDoList();
		Task task = new Task(count++, "Apple", false);
		Task task2 = new Task(count++, "Orange", false);
		Task task3 = new Task(count++, "Chicken", false);
		toDoList.addTask(task);
		toDoList.addTask(task2);
		toDoList.addTask(task3);
		toDoList.displayAll(toDoList);
		
		boolean askAgain = true;
		
		while(askAgain) {
			mainMenu();
			
			Scanner input = new Scanner(System.in);
	    	String number = input.nextLine();
			switch(number) {
			case "a":
				Task task4 = new Task(count++, "Duck", false);
				toDoList.addTask(task4);
				toDoList.displayAll(toDoList);
				break;
			case "b":
				//task = new Task(count++, "Apple", false);
				removeTask(toDoList, task2);
				toDoList.displayAll(toDoList);
				break;
			case "c":
				toDoList.displayAll(toDoList);
				break;
			case "d":
				//task = new Task(count++, "Orange", false);
				completeTask(toDoList, task);
				toDoList.displayAll(toDoList);
				break;
			case "e":
				askAgain = false;
				break;
			default:
				askAgain = false;
				break;
			}
		}
	}
	
	public static void updateTask(Task task){
		
	}
	
	public static void removeTask(ToDoList todoList, Task task){
		todoList.removeTask(task.getTaskID());
	}
	
	public static void completeTask(ToDoList todoList, Task task){
		todoList.getTask(task.getTaskID()).setStatus(true);
		
	}
	
	public static void mainMenu() {
		System.out.println("Welcome to ToDo-List Application ============\n");
		System.out.println("a) Add task\nb) Remove task\nc) Display all tasks\nd) Complete task");
		System.out.println("\nPlease enter your choice: ");
	}

}
