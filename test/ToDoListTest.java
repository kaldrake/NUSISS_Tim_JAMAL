import java.util.Collection;

import org.junit.*;
import org.junit.Test;

import junit.framework.*;


public class ToDoListTest extends TestCase{
	// Define Test Fixtures
	ToDoList toDoList;
	Task task;
	
	public ToDoListTest() {
		super();
	}
	@BeforeClass
	 public void setUp() throws Exception{
		//Initialise Test Fixtures
		toDoList = new ToDoList();
	}
//	@AfterClass
//	 public void tearDown() throws Exception{
//		// Uninitialise test Fixtures
//	}

//	@Before
//	public void setUp() {
//		System.out.println("HIII");
//		toDoList = new ToDoList();
//		task = new Task("HELLO");
//		toDoList.addTask(task);
//	}
	
	@After
	public void cleanUpPerTestCase() {
		toDoList.clearMap();
	}
	
	@Test
	public void testAddTask() {		
		task = new Task("HELLO");
		toDoList.addTask(task);

		assertEquals(toDoList.getTask(task.getDescription()), task);
		//fail("Not implemented yet");
	}
	@Test
	public void testgetStatus() {	
		task = new Task("HELLO");
		toDoList.addTask(task);
		boolean result = toDoList.getStatus(task.getDescription());
		
		assertFalse(result);
		//fail("Not implemented yet");
	}
	@Test
	public void testRemoveTask() {
		task = new Task("HELLO");
		toDoList.addTask(task);
		toDoList.removeTask(task.getDescription());
		
		assertFalse(toDoList.getAllTasks().contains(task));
	}
	@Test
	public void testGetCompletedTasks() {
		task = new Task("HELLO");
		toDoList.addTask(task);
		Task task2 = new Task("HELLO5", true);
		toDoList.addTask(task2);
		Task task3 = new Task("HELLO6", true);
		toDoList.addTask(task3);
		
		Collection<Task> taskList = toDoList.getCompletedTasks();
		
		assertEquals(taskList.size(), 2);
	}
	
	@Test
	public void testCompleteTask() {
		task = new Task("HELLO");
		toDoList.addTask(task);
		toDoList.completeTask(task.getDescription());
		
		assertEquals(toDoList.getTask(task.getDescription()).isComplete(), true);
	}
}
